package com.symagic.mail.web.view;

public class Response<T> {

    private int code;
    private T data;
    private String msg;

    public void setCode(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }

    public void setData(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }

}
