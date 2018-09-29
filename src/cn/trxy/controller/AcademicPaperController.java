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
	private Integer id;
	private String papertype;
	private String papertitle;
	private String firstauthor;
	private String messageauthor;
	private String ofdeptment;
	private String publishdate;
	private String projectsource;
	private String number;
	private String schoolsign;
	private String ISSNnumber;
	private String cnNumber;
	private String category;
	private String categorysecond;
	private String layout;
	private String firstproject;
	private String score;
	private String authorgrade;
	private String academyid;
	private String ofauthor;
	private String yourfile; //附件

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPapertype() {
		return papertype;
	}

	public void setPapertype(String papertype) {
		this.papertype = papertype;
	}

	public String getPapertitle() {
		return papertitle;
	}

	public void setPapertitle(String papertitle) {
		this.papertitle = papertitle;
	}

	public String getFirstauthor() {
		return firstauthor;
	}

	public void setFirstauthor(String firstauthor) {
		this.firstauthor = firstauthor;
	}

	public String getMessageauthor() {
		return messageauthor;
	}

	public void setMessageauthor(String messageauthor) {
		this.messageauthor = messageauthor;
	}

	public String getOfdeptment() {
		return ofdeptment;
	}

	public void setOfdeptment(String ofdeptment) {
		this.ofdeptment = ofdeptment;
	}

	public String getPublishdate() {
		return publishdate;
	}

	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}

	public String getProjectsource() {
		return projectsource;
	}

	public void setProjectsource(String projectsource) {
		this.projectsource = projectsource;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getSchoolsign() {
		return schoolsign;
	}

	public void setSchoolsign(String schoolsign) {
		this.schoolsign = schoolsign;
	}

	public String getISSNnumber() {
		return ISSNnumber;
	}

	public void setISSNnumber(String iSSNnumber) {
		ISSNnumber = iSSNnumber;
	}

	public String getCnNumber() {
		return cnNumber;
	}

	public void setCnNumber(String cnNumber) {
		this.cnNumber = cnNumber;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategorysecond() {
		return categorysecond;
	}

	public void setCategorysecond(String categorysecond) {
		this.categorysecond = categorysecond;
	}

	public String getLayout() {
		return layout;
	}

	public void setLayout(String layout) {
		this.layout = layout;
	}

	public String getFirstproject() {
		return firstproject;
	}

	public void setFirstproject(String firstproject) {
		this.firstproject = firstproject;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getAuthorgrade() {
		return authorgrade;
	}

	public void setAuthorgrade(String authorgrade) {
		this.authorgrade = authorgrade;
	}

	public String getAcademyid() {
		return academyid;
	}

	public void setAcademyid(String academyid) {
		this.academyid = academyid;
	}

	public String getOfauthor() {
		return ofauthor;
	}

	public void setOfauthor(String ofauthor) {
		this.ofauthor = ofauthor;
	}

	public String getYourfile() {
		return yourfile;
	}

	public void setYourfile(String yourfile) {
		this.yourfile = yourfile;
	}

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
		//学校署名
		String schoolSign = this.getSchoolsign();
		//刊物类型中的具体某一个类或者区......
		String  categorySecond = this.getCategorysecond();
		//作者等级
		String  authorGrade = this.getAuthorgrade();
		
		return "index";
	}
	
}
