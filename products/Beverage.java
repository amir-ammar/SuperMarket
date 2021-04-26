package guc.supermarket.products;

public class Beverage extends GroceryProduct{
	
	private SugarLevel sugarLevel;
	
	
	public SugarLevel getSugarLevel() {
		return sugarLevel;
	}
	
	public void setSugarLevel(SugarLevel sugarLevel) {
		this.sugarLevel = sugarLevel;
	}
	
	public Beverage(String name , double price , double discount , SugarLevel sugarLevel) {
		super(name , price , discount);
		this.sugarLevel = sugarLevel;
	}
	
	
	
	
	public String toString() {
		return super.toString() + "Sugar Level: "+ sugarLevel;
	}

	@Override
	public boolean refrigerate() {
		return false;
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Beverage) {
		
		Beverage d = (Beverage)o;
		if(this.getName().equals(d.getName()) && this.getPrice()==d.getPrice() && this.getDiscount()==d.getDiscount() && this.getSugarLevel()==d.getSugarLevel()) {
			return true;
			}
		}
			return false;
		
	}
	
	
	public final double getActualPrice(double extra) {
		return this.getPrice() - (this.getPrice()*((this.getDiscount()+extra)/100));
	}

		

	
}
