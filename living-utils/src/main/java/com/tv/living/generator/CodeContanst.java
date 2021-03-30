package com.tv.living.generator;

public interface CodeContanst {

    public final static Integer SUCCESS_CODE =10000;

    public final static Integer FAIL_CODE = 50000;



    enum  CodeEnum{

        NOT_LOGIN("405","未登陆");

        CodeEnum(String code, String msg) {
        }
    }

}


