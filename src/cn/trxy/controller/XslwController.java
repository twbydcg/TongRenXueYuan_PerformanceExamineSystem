package cn.trxy.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.trxy.bean.UserBean;
import cn.trxy.bean.XslwBean;
import cn.trxy.dao.XslwDao;

public class XslwController extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request=null;
	private int id;
	private int statu;
	
	
	public int getStatu() {
		return statu;
	}

	public void setStatu(int statu) {
		this.statu = statu;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private  XslwBean xslw;

	public XslwBean getXslw() {
		return xslw;
	}

	public void setXslw(XslwBean xslw) {
		this.xslw = xslw;
	}
	
	public String add() {
		//获取用户信息
		request = ServletActionContext.getRequest();
		UserBean userInfo=(UserBean)request.getSession().getAttribute("userInfo");
		int id=userInfo.getId();
		int academicid=userInfo.getAcademyid();
		getXslw().setUserid(id);
		getXslw().setSsxy(academicid);
		getXslw().setShzt(0);

		//上传文件 得到文件的路径存入位置 位置路径  /upload/科研成果（kycg）/文件名
		
		//调用DAO存入数据库
		XslwDao dao=new XslwDao();
		boolean add = dao.add(getXslw());
		if(add) {
			return "lookOver/scientificPayoffs";
		}else {
			return "upload/back";
		}
	}
	
	//通过论文id修改审核状态
	public void updateStatu() {
		//调用DAO改变状态
		System.out.println(getStatu()+"==="+getId());
		new XslwDao().updateStatu(getStatu(),getId());
	}
	
}
