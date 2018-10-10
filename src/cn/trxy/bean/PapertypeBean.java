package cn.trxy.bean;

/**
 * 论文类型
 * */
public class PapertypeBean {
	
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
		return "PapertypeBean [id=" + id + ", name=" + name + "]";
	}
	
	

}
