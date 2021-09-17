package com.jb.sports.exceptions;

public class SportSystemException extends Exception{
    public SportSystemException(ErrMsg errMsg){
        super(errMsg.getMsg());
    }
}
