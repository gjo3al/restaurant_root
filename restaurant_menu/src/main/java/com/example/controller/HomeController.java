package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.DishType;
import com.example.entity.Menu;
import com.example.service.MenuService;

@RestController
public class HomeController {

	@Autowired
	MenuService service;
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return service.toString();
	}
	
	@GetMapping("/menus") 
		public List<Menu> findAll() {
			return service.findByName("");
	}
	
	@GetMapping("/menus/name/{name}") 
	public List<Menu> findfindByName(@PathVariable("name")String name) {
		return service.findByName(name);
	}
	
	@GetMapping("/menus/greaterThan/{price}") 
	public List<Menu> findByPriceGreaterThan(@PathVariable("price")int dishPrice) {
		return service.findByPriceGreaterThan(dishPrice);
	}
	
	@GetMapping("/menus/lessThan/{price}") 
	public List<Menu> findByPriceLessThan(@PathVariable("price")int dishPrice) {
		return service.findByPriceLessThan(dishPrice);
	}
	
	@GetMapping("/menus/type/{type}") 
	public List<Menu> findByType(@PathVariable("type")String dishType) {
		return service.findByType(DishType.fromType(dishType));
	}
}
