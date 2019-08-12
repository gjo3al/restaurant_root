package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.DishType;
import com.example.entity.Menu;
import com.example.repository.MenuRepository;

@Service
@Transactional
public class MenuServiceImpl implements MenuService {

	@Autowired
	MenuRepository menuRepository;
	
	@Override
	public List<Menu> findByName(String dishName) {
		return menuRepository.findByName(dishName);
	}

	@Override
	public List<Menu> findByPriceGreaterThan(int dishPrice) {
		return menuRepository.findByPriceGreaterThan(dishPrice);
	}

	@Override
	public List<Menu> findByPriceLessThan(int dishPrice) {
		return menuRepository.findByPriceLessThan(dishPrice);
	}

	@Override
	public List<Menu> findByType(DishType dishType) {
		return menuRepository.findByType(dishType);
	}

	@Override
	public Menu insert(Menu menu) {
		return menuRepository.save(menu);
	}
}
