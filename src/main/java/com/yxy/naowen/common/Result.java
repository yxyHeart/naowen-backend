package com.yxy.naowen.common;

import lombok.Data;

@Data
public class Result {
    private long code;
    private Object data;

    public Result() {}
    public Result(long code,Object data){
        this.code = code;
        this.data = data;
    };
    public static Result success(Object data) {
        return new Result(200, data);
    }

    public static Result fail(Object data) {
        return new Result(500, data);
    }

}
