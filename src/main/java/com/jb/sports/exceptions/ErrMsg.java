package com.jb.sports.exceptions;

public enum ErrMsg {
    ID_NOT_FOUND("Id not found"),
    ID_ALREADY_EXIST("Id is already exist");

    public String getMsg() {
        return msg;
    }

    private String msg;
    ErrMsg(String msg){
        this.msg = msg;
    }
}
