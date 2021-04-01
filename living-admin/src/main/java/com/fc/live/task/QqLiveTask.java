package com.fc.live.task;
import cn.hutool.core.date.DateUtil;
import com.fc.v2.mapper.auto.TsysUserMapper;
import com.fc.v2.model.auto.TsysUser;
import com.fc.v2.model.auto.TsysUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

/**
 * http://live.qq.com直播
 */
@Component("qqliveTask")
public class QqLiveTask {


    /**
     * 无参的任务
     */
//    public void runTask1()
//    {
//        System.out.println("正在执行定时任务，无参方法");
//    }

    /**
     * 有参任务
     * 目前仅执行常见的数据类型  Integer Long  带L  string  带 ''  bool Double 带 d
     * @param
     * @param
     */
//    public void runTask2(Integer a,Long b,String c,Boolean d,Double e)
//    {
//        System.out.println("正在执行定时任务，带多个参数的方法"+a+"   "+b+" "+c+"  "+d+" "+e+"执行时间:"+DateUtil.now());
//    }


    /**
     * QQ直播赛事接口地址
     */
    private final static String QQ_URL = "http://live.qq.com/api/calendar/game_list/0/{current}/{end}";

    /**
     * 采集QQ直播数据
     */
    public void collect(){
        String startTime = DateUtil.format(new Date(),"YYYY-MM-DD");


    }

    public static void main(String[] args) {
        System.out.println();
    }
}
