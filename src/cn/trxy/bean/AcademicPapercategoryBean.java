package cn.trxy.bean;

/**
 * 学术论文刊物类别表
 * */
public class AcademicPapercategoryBean {
	
	private Integer id;
	private String categoryname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	@Override
	public String toString() {
		return "AcademicPapercategoryBean [id=" + id + ", categoryname=" + categoryname + "]";
	}
	
	

}
