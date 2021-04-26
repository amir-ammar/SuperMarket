package guc.supermarket.products;

abstract public class GroceryProduct {
	
	private String name;
	private double price;
	private double discount;
	
	
	String getName() {
		return name;
	}
	
	double getPrice() {
		return price;
	}
	
	double getDiscount() {
		return discount;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setPrice(double price) {
		this.price = price;
	}
	
	void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	public GroceryProduct() {
		
	}
	
	public GroceryProduct(String name , double price , double discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	
	
	public final double getActualPrice() {
		return this.getPrice() - (this.getPrice()*(this.getDiscount()/100));
	}
	
	public String toString() {
		return "Name: " + name + '\n' + "Price: " + price + '\n' + "Discount: " + discount + '\n';
	}
	
	
	
	abstract public boolean refrigerate();
	
	abstract public boolean equals(Object o);
	
	

}
