package com.educandoweb.course.entities;

import java.io.Serializable;
import java.util.Objects;

import com.educandoweb.course.entities.pk.OrderItemPK;
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;
=======
>>>>>>> a0e46d0951ebf360ef0f1ce07a46c83403198753

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
<<<<<<< HEAD
	private OrderItemPK id = new OrderItemPK();
=======
	private OrderItemPK id;
>>>>>>> a0e46d0951ebf360ef0f1ce07a46c83403198753
	
	private Integer quantity;
	private Double price;
	
<<<<<<< HEAD
	public OrderItem() {
	}
=======
>>>>>>> a0e46d0951ebf360ef0f1ce07a46c83403198753
	
	public OrderItem(Order order, Product product, 
			Integer quantity, Double price) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}
	
<<<<<<< HEAD
	@JsonIgnore
=======
>>>>>>> a0e46d0951ebf360ef0f1ce07a46c83403198753
	public Order getOrder() {
		return id.getOrder();
	}
	
<<<<<<< HEAD
	public void setOrder(Order order) {
=======
	public void serOrder(Order order) {
>>>>>>> a0e46d0951ebf360ef0f1ce07a46c83403198753
		id.setOrder(order);
	}
	
	public Product getProduct() {
		return id.getProduct();
	}
	
	public void setProduct(Product product) {
		id.setProduct(product);
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	} 
}
