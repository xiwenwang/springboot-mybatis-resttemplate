package com.aba.pindan.exception;

import com.aba.pindan.response.HttpResponse;
import com.aba.pindan.util.ResultUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(value = HttpMessageConversionException.class)
    ResponseEntity<Map> httpMessageConversionException(HttpMessageConversionException e) {
        Map<String, String> map = new HashMap<>();
        map.put("suceess", "false");
        return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = ServletRequestBindingException.class)
    ResponseEntity<Map> noHandle() {
        Map<String, String> map = new HashMap<>();
        map.put("suceess", "false");
        return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
    }

    /**
     * 处理全局异常情况
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    ResponseEntity<HttpResponse> globalException(Exception ex) {

        HttpResponse response = ResultUtil.error(200, "error");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
