package com.fc.bot.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class TgGroup implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "")
	private Integer id;
	
	@ApiModelProperty(value = "群组频道的名字")
	private String groupName;
	
	@ApiModelProperty(value = "账号地址")
	private String account;
	
	@ApiModelProperty(value = "类型(0群组，1频道)")
	private Integer type;
	
	@ApiModelProperty(value = "内容类别，招聘，闲聊，黄色，工具，旅游")
	private String classes;
	
	@ApiModelProperty(value = "描述")
	private String groupDesc;
	
	@ApiModelProperty(value = "状态")
	private Integer state;
	
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id =  id;
	}
	@JsonProperty("groupName")
	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName =  groupName;
	}
	@JsonProperty("account")
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account =  account;
	}
	@JsonProperty("type")
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type =  type;
	}
	@JsonProperty("classes")
	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes =  classes;
	}
	@JsonProperty("groupDesc")
	public String getGroupDesc() {
		return groupDesc;
	}

	public void setGroupDesc(String groupDesc) {
		this.groupDesc =  groupDesc;
	}
	@JsonProperty("state")
	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state =  state;
	}

														
	public TgGroup(Integer id,String groupName,String account,Integer type,String classes,String groupDesc,Integer state) {
				
		this.id = id;
				
		this.groupName = groupName;
				
		this.account = account;
				
		this.type = type;
				
		this.classes = classes;
				
		this.groupDesc = groupDesc;
				
		this.state = state;
				
	}

	public TgGroup() {
	    super();
	}

	

}