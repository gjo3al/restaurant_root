package com.restaurant_order.Service;

import com.restaurant_order.Entity.orderEntity;

public interface orderService {

	 public orderEntity findByOrd_no(Integer ord_no);
	 
	 public orderEntity insert (orderEntity orderEntity);
	 
	 public orderEntity update (orderEntity orderEntity);
}
