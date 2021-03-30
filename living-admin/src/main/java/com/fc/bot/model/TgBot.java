package com.fc.bot.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class TgBot implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "")
	private Integer id;
	
	@ApiModelProperty(value = "机器人昵称")
	private String name;
	
	@ApiModelProperty(value = "机器人账号")
	private String account;
	
	@ApiModelProperty(value = "telegram的token")
	private String token;
	
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
	@JsonProperty("account")
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account =  account;
	}
	@JsonProperty("token")
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token =  token;
	}

								
	public TgBot(Integer id,String name,String account,String token) {
				
		this.id = id;
				
		this.name = name;
				
		this.account = account;
				
		this.token = token;
				
	}

	public TgBot() {
	    super();
	}

	

}