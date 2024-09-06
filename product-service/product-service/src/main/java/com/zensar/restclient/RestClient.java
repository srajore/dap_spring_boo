package com.zensar.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.zensar.dto.CouponDto;

//@FeignClient("http://localhost:8083")
@FeignClient("COUPON-SERVICE")
public interface RestClient {

	@GetMapping("/coupon-api/coupons/{couponCode}")
	ResponseEntity<CouponDto> getCoupon(@PathVariable("couponCode") String couponCode);
}
