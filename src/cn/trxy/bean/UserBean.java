package cn.trxy.bean;

import java.sql.Date;

/**
 * �û�����Bean
 * */
public class UserBean {
	
	private Integer id;
	private String account;//����
	private String username;//�û�����
	private String password;//�û�����
	private int age;//����
	private int sex;//�Ա�
	private Date birthday;//��������
	private int job;//�Ƿ���ְ 0��ʾ����ְ 1��ʾ��ְ
	private String direction;//�о�����
	private String phone;//�绰����
	private int academyid ;//ѧԺ
	private String back;//��ע
	
	
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
	
	
	
	
	
	

}
