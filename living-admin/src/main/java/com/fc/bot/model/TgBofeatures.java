package com.fc.bot.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class TgBofeatures implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "")
	private Integer id;
	
	@ApiModelProperty(value = "功能名字")
	private String name;
	
	@ApiModelProperty(value = "服务名字")
	private String service;
	
	@ApiModelProperty(value = "功能配置")
	private String config;
	
	@ApiModelProperty(value = "部门，平台")
	private Integer depId;
	
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id =  id;
	}
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name =  name;
	}
	@JsonProperty("service")
	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service =  service;
	}
	@JsonProperty("config")
	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config =  config;
	}
	@JsonProperty("depId")
	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId =  depId;
	}

										
	public TgBofeatures(Integer id,String name,String service,String config,Integer depId) {
				
		this.id = id;
				
		this.name = name;
				
		this.service = service;
				
		this.config = config;
				
		this.depId = depId;
				
	}

	public TgBofeatures() {
	    super();
	}

	

}