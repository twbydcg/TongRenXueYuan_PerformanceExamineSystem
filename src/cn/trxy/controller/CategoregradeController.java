package cn.trxy.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.trxy.bean.CategoregradeBean;
import cn.trxy.dao.CategoregradeDao;

/*
 * ѧ�����Ŀ���������
 * */
public class CategoregradeController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/xml;charset=utf-8");
		resp.setHeader("Cache-control", "no-cache");
		PrintWriter out=resp.getWriter();
		//���ѧ�����Ŀ����������ID
		int categoryid=Integer.parseInt(req.getParameter("index"));
		CategoregradeDao categoregradeDao=new CategoregradeDao();
		List<CategoregradeBean> allCategoregrade = categoregradeDao.getAllCategoregrade(categoryid);
		//�������Ϸ�װ��x m l ����
		String xmlData="<root>";
		for(CategoregradeBean c:allCategoregrade) {
			xmlData+="<obj><name>"+c.getTypename()+"</name><id>"+c.getId()+"</id></obj>";
		}
		xmlData+="</root>";
		out.print(xmlData);
	}

}
