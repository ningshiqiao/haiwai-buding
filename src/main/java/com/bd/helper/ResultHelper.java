package com.bd.helper;

public class ResultHelper {

    public static Result delResult(long isOk) {
        return isOk == 1L ? new Result().setData(1L) : new Result(ErrorCode.DEL_FAIL);
    }

    public static Result saveResult(long isOk) {
        return isOk == 1L ? new Result().setData(1L) : new Result(ErrorCode.SAVE_FAIL);
    }

    public static Result saveObjResult(Object object) {
        return object == null ? new Result(ErrorCode.SAVE_FAIL) : new Result().setData(1L);
    }

}
