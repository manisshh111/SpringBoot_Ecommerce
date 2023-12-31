package com.manish.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.manish.exception.ProductException;
import com.manish.model.Product;
import com.manish.request.CreateProductRequest;

public interface ProductService {

	public Product createProduct(CreateProductRequest req);
	
	public String deleteProduct(Long productId) throws ProductException;
	
	public Product updateProduct(Long productId, Product req) throws ProductException;
	
	public Product findProductById(Long id) throws ProductException;
	
	public List<Product> findProductByCategory(String category);
	
	public List<Product> searchProduct(String query);
	
	public Page<Product> getAllProducts(String category, List<String> colors, List<String> sizes, Integer minPrice, Integer maxPrice,
			Integer minDiscount, String sort, String stock, Integer pageNumber, Integer pageSize);
	
	public List<Product> getAllProducts();
	
	
}
