package cn.trxy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.trxy.bean.AcademicPapercategoryBean;
import cn.trxy.bean.AhthorunitBean;
import cn.trxy.bean.LayoutBean;
import cn.trxy.bean.PapertypeBean;
import cn.trxy.bean.ProjectsourceBean;
import cn.trxy.bean.SignunitBean;
import cn.trxy.bean.SubjectcategoryBean;
import cn.trxy.bean.UserBean;
import cn.trxy.dao.AcademicPapercategoryDao;
import cn.trxy.dao.AhthorunitDao;
import cn.trxy.dao.LayoutDao;
import cn.trxy.dao.PapertypeDao;
import cn.trxy.dao.ProjectsourceDao;
import cn.trxy.dao.SignunitDao;
import cn.trxy.dao.SubjectcategoryDao;
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
			return "login";
		}else {
			//传入工号和密码进行验证
			UserService userService=new UserService();
			UserBean userBean = userService.checkLogin(getAccount(), getPassword());
			if(userBean==null) {
				return "login";
			}else {
				//将用户存入session中
				request.getSession().setAttribute("userInfo", userBean);
				/**
				 * 这里是准备数据区域 
				 * */
				//准备科研成功--学术论文成果 需要的数据
				//1、论文类型
				PapertypeDao papertypeDao=new PapertypeDao();
				List<PapertypeBean> papertype = papertypeDao.getAll();
				request.getSession().setAttribute("papertype", papertype);
				//2、刊物类别
				AcademicPapercategoryDao academicPapercategoryDao=new AcademicPapercategoryDao();
				List<AcademicPapercategoryBean> allAcademicPapercategory = academicPapercategoryDao.getAllAcademicPapercategory();
				request.getSession().setAttribute("academicPapercategory", allAcademicPapercategory);
				//3、作者等级表）
				AhthorunitDao ahthorunitDao=new AhthorunitDao();
				List<AhthorunitBean> ahthorunit= ahthorunitDao.getAll();
				request.getSession().setAttribute("ahthorunit", ahthorunit);
				//4、项目来源
				ProjectsourceDao projectsourceDao=new ProjectsourceDao();
				List<ProjectsourceBean> projectsource= projectsourceDao.getAll();
				request.getSession().setAttribute("projectsource", projectsource);
				//5、署名单位
				SignunitDao signunitDao=new SignunitDao();
				List<SignunitBean> signunit = signunitDao.getAll();
				request.getSession().setAttribute("signunit", signunit);
				//6、版面
				LayoutDao layoutDao = new LayoutDao();
				List<LayoutBean> layout= layoutDao.getAll();
				request.getSession().setAttribute("layout",layout);
				//7、学科门类
				SubjectcategoryDao SubjectcategoryDao = new SubjectcategoryDao();
				List<SubjectcategoryBean> subjectcategory = SubjectcategoryDao.getAll();
				request.getSession().setAttribute("subjectcategory", subjectcategory);
				
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
