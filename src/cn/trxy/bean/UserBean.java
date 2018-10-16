package cn.trxy.bean;

import java.sql.Date;

/**
 * 用户作者Bean
 * */
public class UserBean {
	
	private Integer id;
	private String account;//工号
	private String username;//用户姓名
	private String password;//用户密码
	private int age;//年龄
	private int sex;//性别
	private Date birthday;//出生日期
	private int job;//是否在职 0表示不在职 1表示在职
	private String direction;//研究方向
	private String phone;//电话号码
	private int academyid ;//学院
	private String back;//备注
	private String office;//职称
	private String role;//用户身份
	
	
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getAcademyid() {
		return academyid;
	}
	public void setAcademyid(int academyid) {
		this.academyid = academyid;
	}
	public String getBack() {
		return back;
	}
	public void setBack(String back) {
		this.back = back;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getJob() {
		return job;
	}
	public void setJob(int job) {
		this.job = job;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", account=" + account + ", username=" + username + ", password=" + password
				+ ", age=" + age + ", sex=" + sex + ", birthday=" + birthday + ", job=" + job + ", direction="
				+ direction + ", phone=" + phone + ", academyid=" + academyid + ", back=" + back + "]";
	}
	
}
