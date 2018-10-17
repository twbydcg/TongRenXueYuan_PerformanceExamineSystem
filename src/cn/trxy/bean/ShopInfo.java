package cn.trxy.bean;

public class ShopInfo {
	
	private Integer id;
	private String name;
	private double price;
	private String imageUrl;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return "ShopInfo [id=" + id + ", name=" + name + ", price=" + price + ", imageUrl=" + imageUrl + "]";
	}
	public ShopInfo(Integer id, String name, double price, String imageUrl) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.imageUrl = imageUrl;
	}
	
	
	

}
