package com.oes.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "OEOrder")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;
	private String userName;
	private LocalDate orderDate;
	private int totalOrderCost;
	private String status;
	
	List<Product> allProducts;

	public Order(String userName, LocalDate orderDate, int totalOrderCost, String status, List<Product> allProducts) {
		super();
		this.userName = userName;
		this.orderDate = orderDate;
		this.totalOrderCost = totalOrderCost;
		this.status = status;
		this.allProducts = allProducts;
	}
	
	
	
}