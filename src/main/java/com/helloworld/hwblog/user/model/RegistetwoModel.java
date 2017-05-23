package com.helloworld.hwblog.user.model;

import java.util.Date;

public class RegistetwoModel {
	private String nickName;
	private String icon;
	private int sex;
	private Date birthday;
	private String address;
	private String qqAcount;
	private String hobby;
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
	public RegistetwoModel(String nickName, String icon, int sex, Date birthday, String address, String qqAcount,
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
	public RegistetwoModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RegistetwoModel [nickName=" + nickName + ", icon=" + icon + ", sex=" + sex + ", birthday=" + birthday
				+ ", address=" + address + ", qqAcount=" + qqAcount + ", hobby=" + hobby + "]";
	}
	
}
