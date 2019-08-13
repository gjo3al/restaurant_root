package com.restaurant_order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant_order.Entity.orderEntity;

public interface orderRepository extends JpaRepository<orderEntity,Integer> {

}
