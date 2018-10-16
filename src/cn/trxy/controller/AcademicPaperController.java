package cn.trxy.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.trxy.bean.AcademicPaperBean;
import cn.trxy.bean.UserBean;
import cn.trxy.servce.AcademicPaperService;

/*
 *  ������ɹ�--ѧ�������Ŀ�����
 * */
public class AcademicPaperController extends ActionSupport {

	public String paperRegiter(){
		
		//��ȡ�û���Ϣ
		HttpServletRequest request = ServletActionContext.getRequest();
		UserBean userInfo=(UserBean)request.getSession().getAttribute("userInfo");
		
		//����ֶ�----------------------------------------------------------------start//
		//��������
		String category=getCategory();
		//���ߵȼ�
		String authorgrade=getAuthorgrade();
		//ѧУ����
		String schoolsign=getSchoolsign();
		//�������;������
		int categorysecond=Integer.parseInt(getCategorysecond());
		//�Ƿ���ְ
		int job=userInfo.getJob();
		
		AcademicPaperService academicPaperService=new AcademicPaperService();
		if(authorgrade!=""&&schoolsign!=null&&category!=null) {
			//�������÷�
			int score=academicPaperService.calculateScore(category,schoolsign, authorgrade, categorysecond,job);
			//���ø�����
			setScore(score);
		}
		//����ֶ�----------------------------------------------------------------end//
		AcademicPaperBean a=new AcademicPaperBean();
		//(`id`, `papertype`, `papertitle`, `yearlimit`, `firstauthor`, `messageauthor`, `publishdate`, `projectsource`, `number`, `schoolsign`, 
		//`ISSNnumber`, `cnNumber`, `category`, `categorysecond`, `layout`, `firstproject`, `score`, `authorgrade`, `academyid`, `ofauthor`, `yourfile`, `statuss`, `comment`)
		
		//ѧԺ
		setAcademyid(userInfo.getAcademyid());
		//��������
		setOfauthor(userInfo.getId());
		//�ļ�·��
		setYourfile(getYourfile());
		//���״̬ Ĭ��0
		setStatuss(0);

		a.setId(null);
		a.setPapertype(getPapertype());
		a.setPapertitle(getPapertitle());
		a.setYearlimit(getYearlimit());
		a.setFirstauthor(getFirstauthor());
		a.setMessageauthor(getMessageauthor());
		a.setPublishdate(getPublishdate());
		a.setProjectsource(getProjectsource());
		a.setNumber(getNumber());
		a.setSchoolsign(getSchoolsign());
		a.setISSNnumber(getISSNnumber());
		a.setCnNumber(getCnNumber());
		a.setCategory(getCategory());
		a.setCategorysecond(getCategorysecond());
		a.setLayout(getLayout());
		a.setScore(getScore());
		a.setAuthorgrade(getAuthorgrade());
		a.setAcademyid(getAcademyid());
		a.setOfauthor(getOfauthor());
		a.setYourfile(getYourfile());
		a.setStatuss(getStatuss());
		a.setComment(getComment());
		a.setFirstproject(getFirstproject());
		
		//�������
		Boolean res=academicPaperService.addData(a);
		if(res) {
			request.setAttribute("addSuccess", true);
		}else {
			request.setAttribute("addSuccess", false);
		}
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
	private int score;//����
	private String authorgrade;//���ߵȼ�
	private int academyid;//����ѧԺ
	private int ofauthor;//��������
	private String yourfile;//����·��(��������)
	private int statuss;//���״̬ 0����� 1�����
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

	public int getStatuss() {
		return statuss;
	}

	public void setStatuss(int statuss) {
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getAuthorgrade() {
		return authorgrade;
	}

	public void setAuthorgrade(String authorgrade) {
		this.authorgrade = authorgrade;
	}

	public int getOfauthor() {
		return ofauthor;
	}

	public void setOfauthor(int ofauthor) {
		this.ofauthor = ofauthor;
	}

	public String getYourfile() {
		return yourfile;
	}

	public void setYourfile(String yourfile) {
		this.yourfile = yourfile;
	}
	
}
