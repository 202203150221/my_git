package com.wyh.controller;

public class Result {
    public Integer code;
    public String msg;
    public Object data;

    public Result(Integer code, Object data, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

    public Result() {
    }
}
