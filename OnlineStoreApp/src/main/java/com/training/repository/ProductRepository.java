package com.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.entities.Product;



public interface ProductRepository extends JpaRepository<Product,Integer> {
	
	List<Product> findByCategoryType(String categoryType);

	Product findByProductId(int productId);

	List<Product> findByCategoryId(int categoryId);
	

}
