package guc.supermarket.cart;

import guc.supermarket.products.Beverage;
import guc.supermarket.products.DairyProduct;
import guc.supermarket.products.Fat;
import guc.supermarket.products.GroceryProduct;
import guc.supermarket.products.SugarLevel;

import java.util.*;
public class Cart {
	
	private ArrayList<GroceryProduct> products;
	
	public Cart() {
		products = new ArrayList<>();
	}
	
	
	ArrayList<GroceryProduct> getProducts() {
		return products;
	}
	
	public void addProduct(GroceryProduct p) {
		products.add(p);
	}
	
	public double getTotal() {
		double sum = 0;
		int size = products.size();
		for(int i = 0 ; i<size ; i++) {
			GroceryProduct g = products.remove(0);
			sum += g.getActualPrice();
			products.add(g);
		}
		return sum;
	}
	
	public String toString() {
		String allInfo = null;
		int size = products.size();
		for(int i = 0 ; i<size ; i++) {
			GroceryProduct g = products.remove(0);
			allInfo = allInfo + g.toString();
			allInfo += "\n"+"-------------------------------" + "\n";
			products.add(g);
		}
		return allInfo;
	}
	
	
	
	
	
	
	
	
}
