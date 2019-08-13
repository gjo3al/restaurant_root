package com.restaurant_order.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant_order.Entity.orderEntity;
import com.restaurant_order.Repository.orderRepository;
import com.restaurant_order.Service.orderService;

@Service
public class orderServiceImp implements orderService {

	@Autowired
	orderRepository orderRepository;
	
	@Override
	public orderEntity findByOrd_no(Integer ord_no) {
		
		return orderRepository.getOne(ord_no);
	}

	@Override
	public orderEntity insert(orderEntity orderEntity) {
		
		return orderRepository.save(orderEntity) ;
	}

	@Override
	public orderEntity update(orderEntity orderEntity) {
		
		return orderRepository.save(orderEntity);
	}

}
