package cn.trxy.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.trxy.bean.UserBean;
import cn.trxy.servce.UserService;

public class UserController extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	//�û���½��֤����
	public String checkLogin() {
		
		//��ȡsession�������֤��
		HttpServletRequest request = ServletActionContext.getRequest();
		String code=(String)request.getSession().getAttribute("code");
		//�ж���֤���Ƿ���ȷ
		if(!getSecruityCode().equals(code)) {
			return "login";
		}
		
		//�Թ��ź��������һ��ļ��
		if(getAccount()=="" || getPassword()=="") {
			return "home/index";
		}else {
			//���빤�ź����������֤
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
