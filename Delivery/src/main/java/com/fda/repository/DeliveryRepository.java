package com.fda.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fda.entity.Delivery;


@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {

	Optional<Delivery> findById(Long id);
    // Additional custom query methods if needed

	Delivery save(Delivery delivery);
}

