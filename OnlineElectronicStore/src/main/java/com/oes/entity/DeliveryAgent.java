package com.oes.entity;

import java.time.LocalDate;

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
@Table(name = "OEDelivery")
public class DeliveryAgent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deliveryId;
	private String deliveryStatus;
	private String payment;
	
	public DeliveryAgent(String deliveryStatus, String payment) {
		super();
		this.deliveryStatus = deliveryStatus;
		this.payment = payment;
	}
	
	

}