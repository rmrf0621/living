package com.fc.bot.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class CompanyJob implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "ID")
	private Integer id;
	
	@ApiModelProperty(value = "公司名字")
	private String company;
	
	@ApiModelProperty(value = "福利信息")
	private String welfare;
	
	@ApiModelProperty(value = "职位信息")
	private String jobs;
	
	@ApiModelProperty(value = "公司地点")
	private String position;
	
	@ApiModelProperty(value = "具体内容")
	private String content;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "创建时间")
	private Date createTime;
	
	@ApiModelProperty(value = "创建人")
	private String createUser;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "修改时间")
	private Date updateTime;
	
	@ApiModelProperty(value = "信息状态")
	private String state;
	
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id =  id;
	}
	@JsonProperty("company")
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company =  company;
	}
	@JsonProperty("welfare")
	public String getWelfare() {
		return welfare;
	}

	public void setWelfare(String welfare) {
		this.welfare =  welfare;
	}
	@JsonProperty("jobs")
	public String getJobs() {
		return jobs;
	}

	public void setJobs(String jobs) {
		this.jobs =  jobs;
	}
	@JsonProperty("position")
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position =  position;
	}
	@JsonProperty("content")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content =  content;
	}
	@JsonProperty("createTime")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime =  createTime;
	}
	@JsonProperty("createUser")
	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser =  createUser;
	}
	@JsonProperty("updateTime")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime =  updateTime;
	}
	@JsonProperty("state")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state =  state;
	}

																				
	public CompanyJob(Integer id,String company,String welfare,String jobs,String position,String content,Date createTime,String createUser,Date updateTime,String state) {
				
		this.id = id;
				
		this.company = company;
				
		this.welfare = welfare;
				
		this.jobs = jobs;
				
		this.position = position;
				
		this.content = content;
				
		this.createTime = createTime;
				
		this.createUser = createUser;
				
		this.updateTime = updateTime;
				
		this.state = state;
				
	}

	public CompanyJob() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}