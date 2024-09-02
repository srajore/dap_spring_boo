package com.zensar.spring_boot_app_ide.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ProductDto implements Serializable {
	
	
	private int productId;
	private String productName;
	private double productCost;

}
