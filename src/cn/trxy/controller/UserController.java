package cn.trxy.controller;

public class UserController {
	
	//用户登陆验证方法
	public String checkLogin() {
		System.out.println(getAccount());
		System.out.println(getPassword());
		System.out.println(getSecruityCode());
		return "home/index";
	}
	
	private String account;
	private String password;
	private String secruityCode;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecruityCode() {
		return secruityCode;
	}
	public void setSecruityCode(String secruityCode) {
		this.secruityCode = secruityCode;
	}
	
	
	
}
