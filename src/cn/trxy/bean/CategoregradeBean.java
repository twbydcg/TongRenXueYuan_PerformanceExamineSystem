package cn.trxy.bean;

/**
 * 学术论文刊物具体分类表
 * */
public class CategoregradeBean {
	
	private Integer id;
	private String typename;
	private int score;
	private int categoryid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	@Override
	public String toString() {
		return "CategoregradeBean [id=" + id + ", typename=" + typename + ", score=" + score + ", categoryid="
				+ categoryid + "]";
	}
	
	

}
