package entities;

public class Rectangle extends Shape {

	
	private Double width;
	private Double height;
	
	public Rectangle() {};
		
	public Rectangle(Double width, Double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public Double area() {
		return width * height;
	}

}
