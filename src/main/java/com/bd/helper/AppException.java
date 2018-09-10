package com.bd.helper;

public class AppException extends Exception {

    private ErrorCode errorCode;

    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public AppException(ErrorCode errorCode, Long userId) {
        this.errorCode = errorCode;
        this.userId = userId;
    }

    public AppException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
