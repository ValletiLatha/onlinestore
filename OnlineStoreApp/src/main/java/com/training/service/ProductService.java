package com.training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.entities.Product;
import com.training.entities.ProductDto;
import com.training.exception.ProductException;
import com.training.repository.CategoryRepository;
import com.training.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;

	@Autowired
	CategoryRepository categoryRepository;

	public List<ProductDto> products(String categoryType) {
		

		List<ProductDto> productList = new ArrayList<>();
		List<Product> products = productRepository.findByCategoryType(categoryType);
		for (Product product : products) {
			ProductDto productDto = new ProductDto();
			BeanUtils.copyProperties(product, productDto);
			productList.add(productDto);
		}
		return productList;
	}

	public Product productDetails(Integer productId) throws ProductException {
		
		
		Product product = productRepository.findByProductId(productId);
	
		return product;
	}
}


