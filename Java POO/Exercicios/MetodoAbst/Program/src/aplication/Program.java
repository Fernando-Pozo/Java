package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;



public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int number = sc.nextInt();
		
		for(int i = 0; i < number; i++ ) {
			System.out.println("Shape #" + (i+1) + " data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			sc.nextLine();
			String color = sc.nextLine();
			if(type == 'r' | type == 'R') {
				System.out.println("Width: ");
				Double width = sc.nextDouble();
				System.out.println("Height: ");
				Double height = sc.nextDouble();
				list.add(new Rectangle(width, height));
			}else if (type == 'c' | type == 'C') {
				System.out.println("Radius: ");
				Double radius = sc.nextDouble();
				list.add(new Circle(radius));
			}
		}
		
		System.out.println("SHAPE AREAS: ");
		for(Shape lt : list) {
			System.out.println(lt.area());
		}
		
		sc.close();
	}
}
