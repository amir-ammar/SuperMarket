package guc.supermarket.products;



public class DairyProduct extends GroceryProduct{

	private Fat fat;


	public Fat getFat() {
		return fat;
	}

	public void setFat(Fat fat) {
		this.fat = fat;
	}

	public DairyProduct(String name , double price , double discount , Fat fat) {
		super(name , price , discount);
		this.fat = fat;
	}


	public String toString() {
		return super.toString() + "Fat Level: " + fat;
	}

	@Override
	public boolean refrigerate() {

		return true;
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof DairyProduct) {


			DairyProduct d = (DairyProduct)o;
			if(this.getName().equals(d.getName()) && this.getPrice()==d.getPrice() && this.getDiscount()==d.getDiscount() && this.getFat()==d.getFat()) {
				return true;
			}

		}
		return false;

	}


















}
