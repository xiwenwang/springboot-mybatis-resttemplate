package com.aba.pindan.config;

import com.aba.pindan.response.HttpResponse;
import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
@Component
public class LogAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);
    
    ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut("execution(public * com.aba.pindan.site.*.*(..))")
    public void requestLog(){};

    @Before("requestLog()")
    public synchronized void doBefore(JoinPoint joinPoint) {
        startTime.set(System.currentTimeMillis());
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        //
        LOGGER.info("mapping = {}", request.getRequestURI());
        LOGGER.info("args = {}", Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(returning = "response", pointcut = "requestLog()")
    public void doAfterRunning(HttpResponse response) {
        LOGGER.info("response = {}", JSON.toJSONString(response));
        LOGGER.info("spend times = {} ms", (System.currentTimeMillis()-startTime.get()));
        startTime.remove();
    }
}
