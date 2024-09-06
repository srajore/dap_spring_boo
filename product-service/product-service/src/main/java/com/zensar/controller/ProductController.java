package com.zensar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zensar.dto.CouponDto;
import com.zensar.entity.Product;
import com.zensar.restclient.RestClient;
import com.zensar.services.ProductService;

@RestController
@RequestMapping("/product-api")
public class ProductController {

	@Autowired
	private ProductService productService;

	//@Autowired
	//private RestTemplate restTemplate;
	
	@Autowired
	private RestClient  restClient;

	@PostMapping("/product")
	public Product insertProduct(@RequestBody Product product) {

		String couponCode = product.getCouponCode();

	//	ResponseEntity<CouponDto> coupon = restTemplate
	//			.getForEntity("http://localhost:8083/coupon-api/coupons/" + couponCode, CouponDto.class);
		
		//ResponseEntity<CouponDto> coupon = restTemplate
		//		.getForEntity("http://COUPON-SERVICE/coupon-api/coupons/" + couponCode, CouponDto.class);
		
		ResponseEntity<CouponDto> coupon = restClient.getCoupon(product.getCouponCode());

		//CouponDto dto = coupon.getBody();
		
		CouponDto dto = coupon.getBody();
		product.setPrice(product.getPrice() - 50);

		return productService.insertProduct(product);

	}
	
	// FeignClient

}
