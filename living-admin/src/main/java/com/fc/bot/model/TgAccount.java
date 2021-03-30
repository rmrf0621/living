package com.fc.bot.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class TgAccount implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "")
	private Integer id;
	
	@ApiModelProperty(value = "用户名,昵称")
	private String nickName;
	
	@ApiModelProperty(value = "账号")
	private String account;
	
	@ApiModelProperty(value = "app_id")
	private Integer appId;
	
	@ApiModelProperty(value = "")
	private String appHash;
	
	@ApiModelProperty(value = "")
	private String testConfig;
	
	@ApiModelProperty(value = "")
	private String proConfig;
	
	@ApiModelProperty(value = "")
	private String publicKeys;
	
	@ApiModelProperty(value = "部门，平台")
	private Integer depId;
	
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id =  id;
	}
	@JsonProperty("nickName")
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName =  nickName;
	}
	@JsonProperty("account")
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account =  account;
	}
	@JsonProperty("appId")
	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId =  appId;
	}
	@JsonProperty("appHash")
	public String getAppHash() {
		return appHash;
	}

	public void setAppHash(String appHash) {
		this.appHash =  appHash;
	}
	@JsonProperty("testConfig")
	public String getTestConfig() {
		return testConfig;
	}

	public void setTestConfig(String testConfig) {
		this.testConfig =  testConfig;
	}
	@JsonProperty("proConfig")
	public String getProConfig() {
		return proConfig;
	}

	public void setProConfig(String proConfig) {
		this.proConfig =  proConfig;
	}
	@JsonProperty("publicKeys")
	public String getPublicKeys() {
		return publicKeys;
	}

	public void setPublicKeys(String publicKeys) {
		this.publicKeys =  publicKeys;
	}
	@JsonProperty("depId")
	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId =  depId;
	}

																		
	public TgAccount(Integer id,String nickName,String account,Integer appId,String appHash,String testConfig,String proConfig,String publicKeys,Integer depId) {
				
		this.id = id;
				
		this.nickName = nickName;
				
		this.account = account;
				
		this.appId = appId;
				
		this.appHash = appHash;
				
		this.testConfig = testConfig;
				
		this.proConfig = proConfig;
				
		this.publicKeys = publicKeys;
				
		this.depId = depId;
				
	}

	public TgAccount() {
	    super();
	}

	

}