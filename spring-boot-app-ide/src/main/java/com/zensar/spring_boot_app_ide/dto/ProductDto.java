package com.zensar.spring_boot_app_ide.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class ProductDto {
	
	@Id
	private int productId;
	private String productName;
	private double productCost;

}
