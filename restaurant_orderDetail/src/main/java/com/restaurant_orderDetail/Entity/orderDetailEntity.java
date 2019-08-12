package com.restaurant_orderDetail.Entity;

import javax.persistence.Entity;

@Entity
public class orderDetailEntity {
	
	private int ord_no;
	private Integer mem_no;
	private Integer ven_no;
	private Integer dish_id;
	private String dish_name ;
	private Integer amount;

}
