package com.zensar.spring_boot_app_ide.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.spring_boot_app_ide.dto.ProductDto;

@Service
public class ProductServiceImpl implements ProductService {

	List<ProductDto> products = new ArrayList<>();

	public ProductServiceImpl() {
		products.add(new ProductDto(1, "HDD", 4500));
		products.add(new ProductDto(2, "MAC", 45000));
		products.add(new ProductDto(3, "IPad", 45000));

	}

	// CR(Read)U D

	// @RequestMapping(value = "/product",method =
	// {RequestMethod.GET,RequestMethod.POST})

	
	public ProductDto getProduct( int productId) {
		for(ProductDto product:products) {
			if(product.getProductId()==productId)
				return product;
			
		}
		return null;
	}

	@GetMapping(value = "/product")
	public List<ProductDto> getAllProducts() {
		return products;
	}
	
	
	@PostMapping("/product")
	public ProductDto insertProduct(@RequestBody ProductDto productDto) {
		//System.out.println("*******************************"+productDto);
		products.add(productDto);
		return productDto;
	}
	
}
	
