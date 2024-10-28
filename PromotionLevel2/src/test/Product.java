package test;

public class Product {
	private String productName;
	private String productId;
	private double price;
	private int quality;

	public Product() {
		productName = "CellingFan";
		productId = "IDFCD";
		price = 1500.00;
		quality = 8;
	}

	public Product(String productName, String productId, double price, int quality) {
		this.productName = productName;
		this.productId = productId;
		this.price = price;
		this.quality = quality;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public String toString() {
		return "ProductDetails\nProductName:" + getProductName() + "\nProductId:" + getProductId() + "\nPrice:" + getPrice() + "\nQuality:"
				+ getQuality();
	}
}
