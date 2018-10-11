package cn.trxy.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.trxy.bean.UserBean;

/*
 *  论文类成果--学术类论文控制器
 * */
public class AcademicPaperController extends ActionSupport {

	public String paperRegiter(){
		//算分字段
		//作者等级
		String authorgrade=getAuthorgrade();
		//学校署名
		String schoolsign=getSchoolsign();
		
		//获取用户信息
		HttpServletRequest request = ServletActionContext.getRequest();
		UserBean userInfo=(UserBean)request.getSession().getAttribute("userInfo");
		
		
		return "home/index";
	}
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String papertype;//论文类型
	private String papertitle;//论文题目
	private String yearlimit;//论文年限
	private String firstauthor;//第一作者
	private String messageauthor;//通讯作者
	private String publishdate;//出版时间
	private String projectsource;//项目来源
	private String number;//期号
	private String schoolsign;//学校署名
	private String ISSNnumber;//ISSN号
	private String cnNumber;//CN号
	private String category;//刊物类型
	private String categorysecond;//刊物类型中的某类/某区。。
	private String layout;//版面
	private String firstproject;//学科门类
	private String score;//积分
	private String authorgrade;//作者等级
	private int academyid;//所属学院
	private String ofauthor;//所属作者
	private String yourfile;//附件路径(附件下载)
	private String statuss;//审核状态 0审核中 1已审核
	private String comment;//备注
	

	public int getAcademyid() {
		return academyid;
	}

	public String getYearlimit() {
		return yearlimit;
	}

	public void setYearlimit(String yearlimit) {
		this.yearlimit = yearlimit;
	}

	public String getStatuss() {
		return statuss;
	}

	public void setStatuss(String statuss) {
		this.statuss = statuss;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setAcademyid(int academyid) {
		this.academyid = academyid;
	}

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
	
}
