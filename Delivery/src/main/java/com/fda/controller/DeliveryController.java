package com.fda.controller;



import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fda.entity.Delivery;
import com.fda.service.DeliveryService;

@RestController
	@RequestMapping("/api/delivery")
	public class DeliveryController {

	    private final DeliveryService deliveryService;

	    public DeliveryController(DeliveryService deliveryService) {
	        this.deliveryService = deliveryService;
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Delivery> getDeliveryById(@PathVariable Long id) {
	        Delivery delivery = deliveryService.getDeliveryById(id);
	        return ResponseEntity.ok(delivery);
	    }

	    @PostMapping
	    public ResponseEntity<Delivery> createDelivery(@RequestBody Delivery delivery) {
	        Delivery createdDelivery = deliveryService.createDelivery(delivery);
	        return ResponseEntity.status(HttpStatus.CREATED).body(createdDelivery);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Delivery> updateDelivery(@PathVariable Long id, @RequestBody Delivery delivery) {
	        Delivery updatedDelivery = deliveryService.updateDelivery(id, delivery);
	        return ResponseEntity.ok(updatedDelivery);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteDelivery(@PathVariable Long id) {
	        deliveryService.deleteDelivery(id);
	        return ResponseEntity.noContent().build();
	    }

	    @GetMapping
	    public ResponseEntity<List<Delivery>> getAllDeliveries() {
	        List<Delivery> deliveries = deliveryService.getAllDeliveries();
	        return ResponseEntity.ok(deliveries);
	    }
	

}
