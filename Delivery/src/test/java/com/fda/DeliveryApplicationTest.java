package com.fda;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fda.entity.Delivery;
import com.fda.entity.DeliveryAgent;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class DeliveryApplicationTest {

    @Test
    public void testDeliveryCreation() {
        // Create a mock delivery agent
        DeliveryAgent deliveryAgentMock = mock(DeliveryAgent.class);

        // Create a delivery instance
        Delivery delivery = new Delivery(0, null, deliveryAgentMock);

        // Verify that the delivery agent was set correctly
        assertEquals(deliveryAgentMock, delivery.getDeliveryAgent());
    }

    @Test
    public void testStartDelivery() {
        // Create a mock delivery agent
        DeliveryAgent deliveryAgentMock = mock(DeliveryAgent.class);

        // Create a delivery instance
        Delivery delivery = new Delivery(0, null, deliveryAgentMock);

        // Start the delivery
        delivery.start();

        // Verify that the delivery agent's startDelivery method was called
        verify(deliveryAgentMock).startDelivery();
    }

    @Test
    public void testCompleteDelivery() {
        // Create a mock delivery agent
        DeliveryAgent deliveryAgentMock = mock(DeliveryAgent.class);

        // Create a delivery instance
        Delivery delivery = new Delivery(0, null, deliveryAgentMock);

        // Complete the delivery
        delivery.complete();

        // Verify that the delivery agent's completeDelivery method was called
        verify(deliveryAgentMock).completeDelivery();
    }

	

		
		

		


	}