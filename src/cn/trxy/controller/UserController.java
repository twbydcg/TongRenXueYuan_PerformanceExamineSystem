package cn.trxy.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.trxy.bean.UserBean;
import cn.trxy.servce.UserService;

public class UserController extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	//用户登陆验证方法
	public String checkLogin() {
		
		//获取session里面的验证码
		HttpServletRequest request = ServletActionContext.getRequest();
		String code=(String)request.getSession().getAttribute("code");
		//判断验证码是否正确
		if(!getSecruityCode().equals(code)) {
			return "login";
		}
		
		//对工号和密码进行一般的检测
		if(getAccount()=="" || getPassword()=="") {
			return "home/index";
		}else {
			//传入工号和密码进行验证
			UserService userService=new UserService();
			UserBean userBean = userService.checkLogin(getAccount(), getPassword());
			if(userBean==null) {
				return "login";
			}else {
				return "home/index";
			}
		}
		
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
