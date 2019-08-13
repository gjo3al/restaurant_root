package com.restaurant_order.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.restaurant_order.Entity.orderEntity;

public interface orderRepository extends JpaRepository<orderEntity, Integer>{

	
	@Query(value = "insert into order_List(mem_no,ven_no,dish_id,dish_name,amount) values(?,?,?,N?,?)",nativeQuery = true)
	  List<orderEntity> saveorupdate(orderEntity orderEntity);

}
