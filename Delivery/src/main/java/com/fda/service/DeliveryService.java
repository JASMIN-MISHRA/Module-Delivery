package com.fda.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fda.entity.Delivery;
import com.fda.entity.DeliveryAgent;
import com.fda.exception.DeliveryAgentNotFoundException;
import com.fda.exception.DeliveryNotFoundException;
import com.fda.repository.DeliveryAgentRepository;
import com.fda.repository.DeliveryRepository;

@Service
public class DeliveryService {

	private final DeliveryRepository deliveryRepository;
    private final DeliveryAgentRepository deliveryAgentRepository;

    public DeliveryService(DeliveryRepository deliveryRepository, DeliveryAgentRepository deliveryAgentRepository) {
        this.deliveryRepository = deliveryRepository;
        this.deliveryAgentRepository = deliveryAgentRepository;
    }

    public Delivery getDeliveryById(Long id) {
        return deliveryRepository.findById(id)
                .orElseThrow(() -> new DeliveryNotFoundException("Delivery not found"));
    }

    public Delivery createDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    public Delivery updateDelivery(Long id, Delivery updatedDelivery) {
        Delivery existingDelivery = deliveryRepository.findById(id)
                .orElseThrow(() -> new DeliveryNotFoundException("Delivery not found"));

        // Update the delivery fields as needed

        return deliveryRepository.save(existingDelivery);
    }

    public void deleteDelivery(Long id) {
        Delivery delivery = deliveryRepository.findById(id)
                .orElseThrow(() -> new DeliveryNotFoundException("Delivery not found"));
        deliveryRepository.delete(delivery);
    }

    public List<Delivery> getAllDeliveries() {
        return deliveryRepository.findAll();
    }

    // Delivery Agent CRUD operations

    public DeliveryAgent getDeliveryAgentById(Long id) {
        return deliveryAgentRepository.findById(id)
                .orElseThrow(() -> new DeliveryAgentNotFoundException("Delivery Agent not found"));
    }

    public DeliveryAgent createDeliveryAgent(DeliveryAgent deliveryAgent) {
        return deliveryAgentRepository.save(deliveryAgent);
    }

    public DeliveryAgent updateDeliveryAgent(Long id, DeliveryAgent updatedDeliveryAgent) {
        DeliveryAgent existingDeliveryAgent = deliveryAgentRepository.findById(id)
                .orElseThrow(() -> new DeliveryAgentNotFoundException("Delivery Agent not found"));

        // Update the delivery agent fields as needed

        return deliveryAgentRepository.save(existingDeliveryAgent);
    }

    public void deleteDeliveryAgent(Long id) {
        DeliveryAgent deliveryAgent = deliveryAgentRepository.findById(id)
                .orElseThrow(() -> new DeliveryAgentNotFoundException("Delivery Agent not found"));
        deliveryAgentRepository.delete(deliveryAgent);
    }

    public List<DeliveryAgent> getAllDeliveryAgents() {
        return deliveryAgentRepository.findAll();
    }

	public void cancelDelivery(Package mockPackage) {
		// TODO Auto-generated method stub
		
	}

	public void deliverPackage(Package mockPackage) {
		// TODO Auto-generated method stub
		
	}
}
