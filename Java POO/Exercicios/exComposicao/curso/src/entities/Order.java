package entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Instant moment;
	private OrderStatus status;
	
	private Client client;

	private List<OrderItem> orderitem = new ArrayList<>();
	
	public Order() {
	}

	public Order(Instant moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getProdutos() {
		return orderitem;
	}
	
	public void addProduct(OrderItem orderitems) {
		orderitem.add(orderitems);
	}
	
	public void addRemove(OrderItem orderitems) {
		orderitem.remove(orderitems);
	}
	
	public double total() {
		double sum = 0.0;
		for (OrderItem it : orderitem) {
			sum += it.subTotal();
		}
		return sum;
	}
	
}
