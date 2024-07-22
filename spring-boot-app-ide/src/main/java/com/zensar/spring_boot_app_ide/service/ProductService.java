package com.zensar.spring_boot_app_ide.service;

import java.util.List;

import com.zensar.spring_boot_app_ide.dto.ProductDto;

public interface ProductService {
	
	public ProductDto getProduct(int productId);
	
	public List<ProductDto> getAllProducts();
	
	public ProductDto insertProduct(ProductDto productDto);
	
	
	
	
	
}
