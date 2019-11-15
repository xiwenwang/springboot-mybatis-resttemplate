package com.aba.pindan.util;

public enum ResultParamEnum {

    RESULT_OK_ENUM(710000, "ok"),
    RESULT_PARAM_ERROR(710001, "参数错误");

    private Integer code;

    private String msg;

    ResultParamEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
