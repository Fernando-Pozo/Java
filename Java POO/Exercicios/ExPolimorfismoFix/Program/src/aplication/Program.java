package aplication;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UserProduct;

public class Program {
	public static void main(String[] args) throws ParseException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of products: ");
		int numberOfProducts = sc.nextInt();
		
		for(int i = 0; i < numberOfProducts; i++) {
			System.out.println("Product #" + (i+1) + " date");
			System.out.print("Common, used or imported (c/u/i) ? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if(type == 'i' | type == 'I') {
				System.out.print("Customs fee: ");
				Double fee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, fee));
			}else if(type == 'u' | type == 'U') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String ler = sc.next();
				LocalDate date = LocalDate.parse(ler, fmt);
				list.add(new UserProduct(name, price, date));
			}else {
				list.add(new Product(name, price));
			}
		}
		
		System.out.println("PRICE TAGS:");
		for(Product prd : list) {
			System.out.println(prd.priceTag());
		}
		
		sc.close();
	}
}
