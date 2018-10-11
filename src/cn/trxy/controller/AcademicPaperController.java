package cn.trxy.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.trxy.bean.UserBean;

/*
 *  ������ɹ�--ѧ�������Ŀ�����
 * */
public class AcademicPaperController extends ActionSupport {

	public String paperRegiter(){
		//����ֶ�
		//���ߵȼ�
		String authorgrade=getAuthorgrade();
		//ѧУ����
		String schoolsign=getSchoolsign();
		
		//��ȡ�û���Ϣ
		HttpServletRequest request = ServletActionContext.getRequest();
		UserBean userInfo=(UserBean)request.getSession().getAttribute("userInfo");
		
		
		return "home/index";
	}
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String papertype;//��������
	private String papertitle;//������Ŀ
	private String yearlimit;//��������
	private String firstauthor;//��һ����
	private String messageauthor;//ͨѶ����
	private String publishdate;//����ʱ��
	private String projectsource;//��Ŀ��Դ
	private String number;//�ں�
	private String schoolsign;//ѧУ����
	private String ISSNnumber;//ISSN��
	private String cnNumber;//CN��
	private String category;//��������
	private String categorysecond;//���������е�ĳ��/ĳ������
	private String layout;//����
	private String firstproject;//ѧ������
	private String score;//����
	private String authorgrade;//���ߵȼ�
	private int academyid;//����ѧԺ
	private String ofauthor;//��������
	private String yourfile;//����·��(��������)
	private String statuss;//���״̬ 0����� 1�����
	private String comment;//��ע
	

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
