package cn.trxy.bean;

/*
 * ������ɹ�--ѧ��������JavaBean
 * */
public class AcademicPaperBean  {
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
	@Override
	public String toString() {
		return "AcademicPaperBean [id=" + id + ", papertype=" + papertype + ", papertitle=" + papertitle
				+ ", yearlimit=" + yearlimit + ", firstauthor=" + firstauthor + ", messageauthor=" + messageauthor
				+ ", publishdate=" + publishdate + ", projectsource=" + projectsource + ", number=" + number
				+ ", schoolsign=" + schoolsign + ", ISSNnumber=" + ISSNnumber + ", cnNumber=" + cnNumber + ", category="
				+ category + ", categorysecond=" + categorysecond + ", layout=" + layout + ", firstproject="
				+ firstproject + ", score=" + score + ", authorgrade=" + authorgrade + ", academyid=" + academyid
				+ ", ofauthor=" + ofauthor + ", yourfile=" + yourfile + ", statuss=" + statuss + ", comment=" + comment
				+ "]";
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
	public String getYearlimit() {
		return yearlimit;
	}
	public void setYearlimit(String yearlimit) {
		this.yearlimit = yearlimit;
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
	public int getAcademyid() {
		return academyid;
	}
	public void setAcademyid(int academyid) {
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
	
	
	
	
}
