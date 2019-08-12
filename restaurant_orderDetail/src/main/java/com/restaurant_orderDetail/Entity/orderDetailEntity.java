package com.restaurant_orderDetail.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order_detail")
public class orderDetailEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ord_no;
	private Integer dish_id;
	private Integer qty ;
	private Integer dish_price;
	public int getOrd_no() {
		return ord_no;
	}
	public void setOrd_no(int ord_no) {
		this.ord_no = ord_no;
	}
	public Integer getDish_id() {
		return dish_id;
	}
	public void setDish_id(Integer dish_id) {
		this.dish_id = dish_id;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getDish_price() {
		return dish_price;
	}
	public void setDish_price(Integer dish_price) {
		this.dish_price = dish_price;
	}

}
