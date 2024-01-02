package com.manish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manish.model.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

