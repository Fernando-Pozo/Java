package entities;

public class Circle extends Shape{
	
	private Double radius;
	public static final Double pi = 3.14;
	
	public Circle() {};
	
	public Circle(Double radius) {
		super();
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double area() {
		return pi * Math.pow(radius, 2);
	}

}
