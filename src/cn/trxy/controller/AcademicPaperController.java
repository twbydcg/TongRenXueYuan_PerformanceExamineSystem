package cn.trxy.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *  ������ɹ�--ѧ�������Ŀ�����
 * */
public class AcademicPaperController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	//doPost����
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doPost(req, resp);
	}
	
	//doGet����
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doGet(req, resp);
	}
	
	public String paperRegiter(){
		
		return "index";
	}
	
}
