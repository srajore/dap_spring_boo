package com.zensar.spring_boot_app_ide.entity;

import com.zensar.spring_boot_app_ide.dto.ProductDto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

// @NamedQuery(name = "Product.test", query = "from Product as p where p.productName=?1 and   p.productCost<=?2")

//@NamedNativeQuery(name = "Product.test", query = "select * from product where product_name=?1", resultClass = Product.class)

/*@NamedQueries(value = { @NamedQuery(name = "Product.test", query = "from Product as p where p.productName=?1 and   p.productCost<=?2"),
						@NamedQuery(name = "Product.test", query = "from Product as p where p.productName=?1 and   p.productCost<=?2")
})*/

public class Product {
	@Id
	private int productId;
	
	private String productName;
	private double productCost;

}
