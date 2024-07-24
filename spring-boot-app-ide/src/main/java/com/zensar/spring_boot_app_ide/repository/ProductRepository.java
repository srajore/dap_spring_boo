package com.zensar.spring_boot_app_ide.repository;

import java.util.List;

import com.zensar.spring_boot_app_ide.dto.ProductDto;

public interface ProductRepository {
	
	public ProductDto getProduct(int productId);
	
	public List<ProductDto> getAllProducts();
	
	public ProductDto insertProduct(ProductDto productDto);

}
