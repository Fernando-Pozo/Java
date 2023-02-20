package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program2 {
	public static void main(String[] args) {
		
		Map<Product, Double> Stock = new HashMap<>();
		
		Product p1 = new Product("TV", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		Stock.put(p1, 10000.0);
		Stock.put(p2, 20000.0);
		Stock.put(p3, 15000.0);
		
		Product ps = new Product("TV", 900.0);
		
		System.out.println("Contains 'ps' key: " + Stock.containsKey(ps));
	}
}
