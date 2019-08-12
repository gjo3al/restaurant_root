package com.example.service;

import java.util.List;

import com.example.entity.DishType;
import com.example.entity.Menu;

public interface MenuService {

	public List<Menu> findByName(String dishName);

	public List<Menu> findByPriceGreaterThan(int dishPrice);
	
	public List<Menu> findByPriceLessThan(int dishPrice);

	public List<Menu> findByType(DishType dishType);
	
	public Menu insert(Menu menu);
}
