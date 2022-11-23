package entities;

public class OrderItem {
	
	private Integer Quantity;
	private Double price; 
	
	private Product product;
	

	public OrderItem(){
	}
	
	public OrderItem(Integer Quantity, Double price, Product product){
		this.Quantity = Quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return Quantity;
	}

	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Double subTotal() {
		return Quantity * price;
	}
}
