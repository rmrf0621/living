package com.tv.living.expection;

import com.tv.living.generator.Result;
import com.tv.living.generator.ResultGenerator;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class GlobalExpection {



    @ExceptionHandler(value = Exception.class)//指定拦截的异常
    public Result errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception{
        return ResultGenerator.fail("系统异常,请联系管理员!");
    }
}
