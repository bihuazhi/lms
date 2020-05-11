package com.lms.entity;

public enum ResultCode {

    SUCCESS(true,1000,"操作成功！"),
    //---系统错误返回码-----
    FAIL(false,1001,"操作失败"),
    UNAUTHENTICATED(false,1002,"您还未登录！"),
    UNAUTHORISE(false,1003,"权限不足"),
    SERVER_ERROR(false,1111,"抱歉，系统繁忙，请稍后重试！"),

    //---用户操作返回码----
    USERLOGIN_ERROR(false,2001,"用户名或者密码不一致！");
    //---企业操作返回码----
    //---权限操作返回码----
    //---其他操作返回码----

    //操作是否成功
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;

    ResultCode(boolean success,int code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public boolean success() {
        return success;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }

}
