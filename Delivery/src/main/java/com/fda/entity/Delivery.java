package com.fda.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String address;

    @ManyToOne
    @JoinColumn(name = "delivery_agent_id")
    private DeliveryAgent deliveryAgent;

	public int getId() {
		return id;
	}

	public void setId(int i) {
		this.id = i;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public DeliveryAgent getDeliveryAgent() {
		return deliveryAgent;
	}

	public void setDeliveryAgent(DeliveryAgent deliveryAgent) {
		this.deliveryAgent = deliveryAgent;
	}

	public Delivery(int id, String address, DeliveryAgent deliveryAgent) {
		super();
		this.id = id;
		this.address = address;
		this.deliveryAgent = deliveryAgent;
	}



	

	public void start() {
		// TODO Auto-generated method stub
		
	}

	public void complete() {
		// TODO Auto-generated method stub
		
	}

}