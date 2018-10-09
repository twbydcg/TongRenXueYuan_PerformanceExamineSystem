package cn.trxy.bean;

/**
 * 项目来源
 * */
public class ProjectsourceBean {
	
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "SubjectcategoryBean [id=" + id + ", name=" + name + "]";
	}

}
