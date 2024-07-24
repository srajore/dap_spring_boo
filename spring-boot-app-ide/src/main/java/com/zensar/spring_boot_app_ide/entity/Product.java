package com.zensar.spring_boot_app_ide.entity;

import com.zensar.spring_boot_app_ide.dto.ProductDto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
	@Id
	private int productId;
	
	private String productName;
	private double productCost;

}
