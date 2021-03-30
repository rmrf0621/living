package com.tv.living.generator;

import lombok.Data;

import java.io.Serializable;


public class ResultGenerator<T> implements Serializable {

    public static <T> Result success(T data) {
        return new Result(CodeContanst.SUCCESS_CODE,data);
    }
    public static <T> Result success() {
        return new Result(CodeContanst.SUCCESS_CODE,"操作成功");
    }

    public static <T> Result fail(Integer code ,String msg) {
        return new Result(code,msg);
    }

    public static <T> Result fail(String msg) {
        return new Result(CodeContanst.FAIL_CODE,msg);
    }


    public static void main(String[] args) {
        System.out.println(ResultGenerator.fail(CodeContanst.SUCCESS_CODE,"测试一下"));

    }


}

