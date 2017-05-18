package com.helloworld.hwblog.user.model;

public class RegisteoneModel {
	private String username;
	private String password;
	private String repassword;
	private String email;
	private String checkcode;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCheckcode() {
		return checkcode;
	}
	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}
	public RegisteoneModel(String username, String password, String repassword, String email, String checkcode) {
		super();
		this.username = username;
		this.password = password;
		this.repassword = repassword;
		this.email = email;
		this.checkcode = checkcode;
	}
	public RegisteoneModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RegisteoneModel [username=" + username + ", password=" + password + ", repassword=" + repassword
				+ ", email=" + email + ", checkcode=" + checkcode + "]";
	}

}
