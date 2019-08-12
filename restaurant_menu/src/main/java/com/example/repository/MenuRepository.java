package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.DishType;
import com.example.entity.Menu;

// @Query中可使用JPQL
// 參考 https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.at-query
public interface MenuRepository extends JpaRepository<Menu, Integer> {
	
	@Query("select m from Menu m where m.dishName like %?1%")
	public List<Menu> findByName(String dishName);
	
	@Query("select m from Menu m where m.dishPrice > ?1")
	public List<Menu> findByPriceGreaterThan(int dishPrice);
	
	@Query("select m from Menu m where m.dishPrice < ?1")
	public List<Menu> findByPriceLessThan(int dishPrice);
	
	@Query("select m from Menu m where m.dishType = ?1")
	public List<Menu> findByType(DishType dishType);
}
