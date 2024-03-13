package com.project.ecommerce.store.repositories;

import com.project.ecommerce.store.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>
{
}
