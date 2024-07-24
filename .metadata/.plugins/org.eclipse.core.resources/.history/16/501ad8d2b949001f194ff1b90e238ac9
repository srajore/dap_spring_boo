package com.zensar.spring_boot_app_ide.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.spring_boot_app_ide.dto.ProductDto;
import com.zensar.spring_boot_app_ide.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;

	@Autowired
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public ProductDto getProduct(int productId) {
		return productRepository.findById(productId).get();  //not a good practice
		//return productRepository.getById(productId);   it's dep. method getById()
	}

	public List<ProductDto> getAllProducts() {
		return productRepository.findAll();
	}

	public ProductDto insertProduct(ProductDto productDto) {
		productRepository.save(productDto);
		
		return productDto;
	}

}
