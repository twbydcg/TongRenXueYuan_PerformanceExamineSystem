package cn.trxy.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import cn.trxy.utils.DBConnection;

public class InternetArticleController {
	private int id;
	private String 	articleType;	//文章类型
	private String  articleTitle;	//文章标题
	private String  department;		//所属部门
	private String  firstAuthor;	//第一作者
	private String  messageAuthor;	//通讯作者
	private String  publishTime;	//发表时间
	private String  press;			//刊登报刊/互联网
	private String  subjectType;	//学科门类
	private String  firstSubject;	//一级学科
	private String  issueNumber;	//期号
	private String  schoolSign;		//学校署名
	private String  layout;			//版面
	private String  newspaperNumber;//报刊号
	private String  back;			//备份
	private int checkStatus;		//审核状态
	private int nPoint;				//积分
	private int authorLevel;		//作者等级
	private int academy;			//所属学院
	private int author;				//所属作者
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getArticleType() {
		return articleType;
	}



	public void setArticleType(String articleType) {
		this.articleType = articleType;
	}



	public String getArticleTitle() {
		return articleTitle;
	}



	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getFirstAuthor() {
		return firstAuthor;
	}



	public void setFirstAuthor(String firstAuthor) {
		this.firstAuthor = firstAuthor;
	}



	public String getMessageAuthor() {
		return messageAuthor;
	}



	public void setMessageAuthor(String messageAuthor) {
		this.messageAuthor = messageAuthor;
	}



	public String getPublishTime() {
		return publishTime;
	}



	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}



	public String getPress() {
		return press;
	}



	public void setPress(String press) {
		this.press = press;
	}



	public String getSubjectType() {
		return subjectType;
	}



	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}



	public String getFirstSubject() {
		return firstSubject;
	}



	public void setFirstSubject(String firstSubject) {
		this.firstSubject = firstSubject;
	}



	public String getIssueNumber() {
		return issueNumber;
	}



	public void setIssueNumber(String issueNumber) {
		this.issueNumber = issueNumber;
	}



	public String getSchoolSign() {
		return schoolSign;
	}



	public void setSchoolSign(String schoolSign) {
		this.schoolSign = schoolSign;
	}



	public String getLayout() {
		return layout;
	}



	public void setLayout(String layout) {
		this.layout = layout;
	}



	public String getNewspaperNumber() {
		return newspaperNumber;
	}



	public void setNewspaperNumber(String newspaperNumber) {
		this.newspaperNumber = newspaperNumber;
	}



	public String getBack() {
		return back;
	}



	public void setBack(String back) {
		this.back = back;
	}



	public int getCheckStatus() {
		return checkStatus;
	}



	public void setCheckStatus(int checkStatus) {
		this.checkStatus = checkStatus;
	}



	public int getnPoint() {
		return nPoint;
	}



	public void setnPoint(int nPoint) {
		this.nPoint = nPoint;
	}



	public int getAuthorLevel() {
		return authorLevel;
	}



	public void setAuthorLevel(int authorLevel) {
		this.authorLevel = authorLevel;
	}



	public int getAcademy() {
		return academy;
	}



	public void setAcademy(int academy) {
		this.academy = academy;
	}



	public int getAuthor() {
		return author;
	}


	public void setAuthor(int author) {
		this.author = author;
	}
	
	public String ArticleController(){
		int point=0;
		Statement st=null;
		Connection con=null;
		ResultSet rs =null;
		try{
			con=DBConnection.getConnection();
			st = con.createStatement();
			rs=st.executeQuery("select * from Article_point where articleName='"+this.getPress()+"'");
			while(rs.next()){
				point+=rs.getInt(3);
			}
			String sql = "insert into"+
						" trxypes_internetArticle(articleType,articleTitle,department,firstAuthor,messageAuthor,publishTime,press,subjectType,firstSubject,issueNumber,schoolSign,layout,newspaperNumber,nPoint,authorLevel,academy,author)"+
						"values("+
						"'"+this.getArticleType()+"',"+		//文章类型
						"'"+this.getArticleTitle()+"',"+	//文章标题
						"'"+this.getDepartment()+"',"+		//所属部门
						"'"+this.getFirstAuthor()+"',"+		//第一作者
						"'"+this.getMessageAuthor()+"',"+	//通讯作者
						"'"+this.getPublishTime()+"',"+		//发表时间
						"'"+this.getPress()+"',"+			//刊登报刊/互联网
						"'"+this.getSubjectType()+"',"+		//学科门类
						"'"+this.getFirstSubject()+"',"+	//一级学科
						"'"+this.getIssueNumber()+"',"+		//期号
						"'"+this.getSchoolSign()+"',"+		//学校署名
						"'"+this.getLayout()+"',"+			//版面
						"'"+this.getNewspaperNumber()+"',"+	//报刊号
						"'"+point+"',"+						//积分
						"'"+this.getAuthorLevel()+"',"+		//作者等级
						"'"+this.getAcademy()+"',"+			//所属学院
						"'"+this.getAuthor()+"',"+			//所属作者
						")";		
						//所属学院和作者在数据库中属于外键，这里需要先通过Session取得所属学院和作者在数据库中的ID，然后再加进来
			int flag = st.executeUpdate(sql);
			if(flag>0){
				
			}else{
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
			if(null!=st){st.close();}
			if(null!=con){con.close();}
			if(null!=rs){rs.close();}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return "index";
	}
}
