package com.restaurant_order.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant_order.Entity.orderEntity;
import com.restaurant_order.ServiceImp.orderServiceImp;

@RestController
@RequestMapping("/")
public class orderController {

	@Autowired
	orderServiceImp orderServiceImp;
	
//	@Autowired
//	orderRepository  orderRepository;
	
	@GetMapping("/order/{ord_no}") 
	public orderEntity findfindByOrder_no(@PathVariable("ord_no")int ord_no) {
		return orderServiceImp.findByOrd_no(ord_no);
	}
	
	@PostMapping("/order/create") 
	 public orderEntity insert(@RequestBody orderEntity orderEntity) {
	  return orderServiceImp.insert(orderEntity);
	
	}
	
	
}
