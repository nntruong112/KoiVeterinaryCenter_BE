package com.devteria.identity_service.exception;

//Class này là đã chuẩn  hóa các cái exception khi gặp

import lombok.Getter;

@Getter
public enum ErrorCode {
    USER_UNACCEPTED(9999,"User is not accepted"),
    USER_EXISTED( 1002, "User existed"),
    USERNAME_INVALID(1003,"Username must be at least 3 characters"),
    PASSWORD_INVALID(1004,"Password must be at least 8 characters"),
    INVALID_KEY(1001,"Invalid message key"),
    USER_NOT_EXISTED(1005,"User not existed"),
    UNAUTHENTICATED(1006,"Unauthenticated")
    ;

    private int code ;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
