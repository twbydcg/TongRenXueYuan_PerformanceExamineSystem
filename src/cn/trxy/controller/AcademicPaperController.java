package cn.trxy.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.trxy.bean.AcademicPaperBean;
import cn.trxy.bean.UserBean;
import cn.trxy.servce.AcademicPaperService;

/*
 *  论文类成果--学术类论文控制器
 * */
public class AcademicPaperController extends ActionSupport {

	public String paperRegiter(){
		
		//获取用户信息
		HttpServletRequest request = ServletActionContext.getRequest();
		UserBean userInfo=(UserBean)request.getSession().getAttribute("userInfo");
		
		//算分字段----------------------------------------------------------------start//
		//刊物类型
		String category=getCategory();
		//作者等级
		String authorgrade=getAuthorgrade();
		//学校署名
		String schoolsign=getSchoolsign();
		//刊物类型具体类别
		int categorysecond=Integer.parseInt(getCategorysecond());
		//是否在职
		int job=userInfo.getJob();
		
		AcademicPaperService academicPaperService=new AcademicPaperService();
		if(authorgrade!=""&&schoolsign!=null&&category!=null) {
			//计算所得分
			int score=academicPaperService.calculateScore(category,schoolsign, authorgrade, categorysecond,job);
			//设置给属性
			setScore(score);
		}
		//算分字段----------------------------------------------------------------end//
		AcademicPaperBean a=new AcademicPaperBean();
		//(`id`, `papertype`, `papertitle`, `yearlimit`, `firstauthor`, `messageauthor`, `publishdate`, `projectsource`, `number`, `schoolsign`, 
		//`ISSNnumber`, `cnNumber`, `category`, `categorysecond`, `layout`, `firstproject`, `score`, `authorgrade`, `academyid`, `ofauthor`, `yourfile`, `statuss`, `comment`)
		
		//学院
		setAcademyid(userInfo.getAcademyid());
		//所属作者
		setOfauthor(userInfo.getId());
		//文件路径
		setYourfile(getYourfile());
		//审核状态 默认0
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
		
		//添加数据
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
	private int score;//积分
	private String authorgrade;//作者等级
	private int academyid;//所属学院
	private int ofauthor;//所属作者
	private String yourfile;//附件路径(附件下载)
	private int statuss;//审核状态 0审核中 1已审核
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
