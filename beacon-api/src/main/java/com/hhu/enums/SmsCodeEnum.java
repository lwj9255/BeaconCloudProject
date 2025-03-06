package com.hhu.enums;

import lombok.Getter;

// 仅为类中的属性写get方法
@Getter
public enum SmsCodeEnum {
    PARAMETER_ERROR(-10, "参数不合法！");

    private Integer code;
    private String msg;

    SmsCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
