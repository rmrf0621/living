package com.fc.bot.task;

import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fc.bot.mapper.CompanyJobMapper;
import com.fc.bot.task.dto.CompanyJobDto;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 菲龙网相关数据采集
 */
@Slf4j
@Component("flwCompanyTask")
public class FlwCompanyTask {


    @Autowired
    private CompanyJobMapper companyJobMapper;

    //使用注解注入
    @Autowired
    private RestTemplate restTemplate;

    public final static String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.193 Safari/537.36";
    public final static String BASE_URL = "https://www.flw.ph/plugin.php?id=fn_job:Ajax&f=GetAjaxList&page=1&class=1&formhash=fee6c945&province=&city=&dist=&bbclassid=&bclassid=&classid=&month_wages=&experience=&education=&order=&keyword=";

    /**
     * 有参任务
     *
     * @param cookie
     */
    public void spider(String cookie) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("cookie", cookie);
        httpHeaders.add("User-Agent", USER_AGENT);
        List<CompanyJobDto> list = httpResult(cookie);
        list.forEach(companyJobDto -> {
            ResponseEntity<String> response = restTemplate.exchange(companyJobDto.getUrl(), HttpMethod.GET, new HttpEntity<>(httpHeaders), String.class);
            String rep = response.getBody();
            String content = rep.substring(rep.indexOf("<div class=\"Text\">"), rep.indexOf("<div class=\"ViewBox \">"));
            companyJobDto.setContent(content);
            log.error("信息正文内容:{}", content);
            try {
                companyJobMapper.insert(companyJobDto);
            } catch (Exception e) {
                log.error("数据入库错误:{}", e.getMessage(), e);
            }
        });
    }

    /**
     * 爬取页面返回结果
     *
     * @param cookie
     * @return
     */
    private List<CompanyJobDto> httpResult(String cookie) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("cookie", cookie);
        httpHeaders.add("User-Agent", USER_AGENT);
        // 注意几个请求参数
        ResponseEntity<String> response = restTemplate.exchange(BASE_URL, HttpMethod.GET, new HttpEntity<>(httpHeaders), String.class);
        // 请求通过的
        if (response.getStatusCode() != HttpStatus.OK) {
            return null;
        }

        List<CompanyJobDto> list = new ArrayList<CompanyJobDto>();

        for (Object obj : JSONArray.parseArray(response.getBody())) {
            JSONObject json = (JSONObject) obj;

            CompanyJobDto dto = new CompanyJobDto();
            dto.setCompany(json.getString("name"));
            dto.setPosition(json.getString("community"));
            dto.setState(1);
            dto.setCreateTime(new Date());
            dto.setCreateUser(json.getString("username") + "|admin");
            dto.setUpdateTime(new Date());
            dto.setUrl(json.getString("url"));
            log.info("参数列表:{}", dto.getUrl());
            list.add(dto);
        }


        return list;
    }

}

