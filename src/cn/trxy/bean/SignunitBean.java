package cn.trxy.bean;

/**
 * 署名单位表
 * */
public class SignunitBean {
	
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
		return "SignunitBean [id=" + id + ", name=" + name + "]";
	}
	
	

}
