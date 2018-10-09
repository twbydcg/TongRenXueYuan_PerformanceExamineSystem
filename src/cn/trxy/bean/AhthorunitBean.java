package cn.trxy.bean;

/**
 * （作者等级表）
 * */
public class AhthorunitBean {
	
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
		return "AhthorunitBean [id=" + id + ", name=" + name + "]";
	}
	
	
}
