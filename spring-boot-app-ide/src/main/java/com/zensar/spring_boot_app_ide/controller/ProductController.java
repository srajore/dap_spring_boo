package com.zensar.spring_boot_app_ide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.spring_boot_app_ide.dto.ProductDto;
import com.zensar.spring_boot_app_ide.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	// CR(Read)U D

	// @RequestMapping(value = "/product",method =
	// {RequestMethod.GET,RequestMethod.POST})

	@GetMapping(value = "/product/{productId}")
	public ProductDto getProduct(@PathVariable("productId") int id) {
		return productService.getProduct(id);
	}

	@GetMapping(value = "/product")
	public List<ProductDto> getAllProducts() {
		return productService.getAllProducts();
	}

	@PostMapping("/product")
	public ProductDto insertProduct(@RequestBody ProductDto productDto) {
		productService.insertProduct(productDto);
		return productDto;
	}

	// update

	// delete

}
