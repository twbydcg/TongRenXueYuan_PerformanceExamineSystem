package cn.trxy.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *  论文类成果--学术类论文控制器
 * */
public class AcademicPaperController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	//doPost方法
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doPost(req, resp);
	}
	
	//doGet方法
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doGet(req, resp);
	}
	
	public String paperRegiter(){
		
		return "index";
	}
	
}
