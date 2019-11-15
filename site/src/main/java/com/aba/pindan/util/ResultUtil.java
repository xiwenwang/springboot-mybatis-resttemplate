package com.aba.pindan.util;

import com.aba.pindan.response.HttpResponse;

public class ResultUtil {

    /**
     * 成功返回格式
     *
     * @param object
     * @return
     */
    public static HttpResponse success(Object object) {
        HttpResponse response = new HttpResponse();
        response.setSuccess(true);
        response.setErrCode(ResultParamEnum.RESULT_OK_ENUM.getCode());
        response.setErrMsg(ResultParamEnum.RESULT_OK_ENUM.getMsg());
        response.setData(object);
        return response;
    }

    /**
     * 错误响应格式
     *
     * @param code
     * @param msg
     * @return
     */
    public static HttpResponse error(int code, String msg) {
        HttpResponse response = new HttpResponse();
        response.setSuccess(false);
        response.setErrCode(code);
        response.setErrMsg(msg);
        response.setData(null);
        return response;
    }
}
