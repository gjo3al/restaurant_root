package com.restaurant_order.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class orderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ord_no;
	private Integer mem_no;
	private Integer ven_no;
	private Integer dish_id;
	private String dish_name ;
	private Integer amount;
	public int getOrd_no() {
		return ord_no;
	}
	public void setOrd_no(int ord_no) {
		this.ord_no = ord_no;
	}
	public Integer getMem_no() {
		return mem_no;
	}
	public void setMem_no(Integer mem_no) {
		this.mem_no = mem_no;
	}
	public Integer getVen_no() {
		return ven_no;
	}
	public void setVen_no(Integer ven_no) {
		this.ven_no = ven_no;
	}
	public Integer getDish_id() {
		return dish_id;
	}
	public void setDish_id(Integer dish_id) {
		this.dish_id = dish_id;
	}
	public String getDish_name() {
		return dish_name;
	}
	public void setDish_name(String dish_name) {
		this.dish_name = dish_name;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}

}
