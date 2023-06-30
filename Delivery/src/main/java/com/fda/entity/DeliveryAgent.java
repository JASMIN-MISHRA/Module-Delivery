package com.fda.entity;







import com.fda.service.DeliveryService;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;




@Entity
public class DeliveryAgent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DeliveryAgent(DeliveryService deliveryService) {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeliveryAgent(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void cancelDelivery(Package mockPackage) {
		// TODO Auto-generated method stub
		
	}

	public boolean deliverPackage(Package mockPackage) {
		// TODO Auto-generated method stub
		return false;
	}

	public void startDelivery() {
		// TODO Auto-generated method stub
		
	}

	public void completeDelivery() {
		// TODO Auto-generated method stub
		
	}

    // Getters and setters, constructors, and other fields as needed
}