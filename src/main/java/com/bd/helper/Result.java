package com.bd.helper;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.context.MessageSource;

import java.io.Serializable;
import java.util.Locale;

/**
 * @author zw
 * @param <T>
 */
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 5925101851082556645L;

    @ApiModelProperty(value = "成功返回数据")
    private T data;
    @ApiModelProperty(value = "调用结果状态 | 0:失败,1:成功")
    private Integer state;
    @ApiModelProperty(value = "失败错误码")
    private String errorCode;
    @ApiModelProperty(value = "失败信息")
    private String errorMsg;

    public static <T> Result<T> newError(T data) {
        Result<T> result = new Result<>();
        result.setData(data);
        return result.setData(data);
    }

    public Result() {
        this.state = Status.SUCCESS.code;
    }

    public Result(ErrorCode appErrorCode) {
        this(Status.ERROR, appErrorCode.getCode(), appErrorCode.getMessage());
    }

    public Result(ErrorCode appErrorCode,MessageSource messageSource,Locale locale) {
        this(Status.ERROR, appErrorCode.getCode(), messageSource.getMessage(appErrorCode.name(), null, locale));
    }

    public Result(String errorCode, String errorMsg) {
        this(Status.ERROR, errorCode, errorMsg);
    }

    public Result(Result.Status status, String errorCode, String errorMsg) {
        this.state = status.code();
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return this.data;
    }

    public Result<T> setData(T content) {
        this.data = content;
        return this;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public Result<T> setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public Result<T> setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public enum Status {
        // 失败
        ERROR(0),
        // 成功
        SUCCESS(1);

        private Integer code;

        private Status(Integer code) {
            this.code = code;
        }

        public Integer code() {
            return this.code;
        }
    }
}