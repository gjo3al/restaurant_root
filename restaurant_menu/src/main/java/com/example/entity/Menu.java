package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer dishId;
	String dishName;
	int dishPrice;
	
	//自訂Enum與儲存於資料庫中類型的轉換
	//可在application.yml中加上logging.level.org.hibernate.type.descriptor.sql: trace觀看sql參數的變化
	@Enumerated(EnumType.STRING)
	DishType dishType;
	
	public int getDishId() {
		return dishId; 
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public int getDishPrice() {
		return dishPrice;
	}
	public void setDishPrice(int dishPrice) {
		this.dishPrice = dishPrice;
	}
	public String getDishType() {
		return dishType.name();
	}
	public void setDishType(DishType dishType) {
		this.dishType= dishType;
	}
}

