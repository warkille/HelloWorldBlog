package com.helloworld.hwblog.user.entity;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity(name="UserInfo")
public class UserInfo {
	@Id
	@GeneratedValue(generator = "uid")
    @GenericGenerator(name = "uid",strategy = "native")
	private int id;
	private String nickName;
	private String icon;
	private int sex;
	@Temporal(TemporalType.TIMESTAMP)
	private Date birthday;
	private String address;
	private String qqAcount;
	private String hobby;
	private String username;
	private int subNumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQqAcount() {
		return qqAcount;
	}
	public void setQqAcount(String qqAcount) {
		this.qqAcount = qqAcount;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getSubNumber() {
		return subNumber;
	}
	public void setSubNumber(int subNumber) {
		this.subNumber = subNumber;
	}
	public UserInfo( String nickName, String icon, int sex, Date birthday, String address, String qqAcount,
			String hobby, String username, int subNumber) {
		super();
		
		this.nickName = nickName;
		this.icon = icon;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
		this.qqAcount = qqAcount;
		this.hobby = hobby;
		this.username = username;
		this.subNumber = subNumber;
	}
	
	public UserInfo(String nickName, String icon, int sex, Date birthday, String address, String qqAcount,
			String hobby) {
		super();
		this.nickName = nickName;
		this.icon = icon;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
		this.qqAcount = qqAcount;
		this.hobby = hobby;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

