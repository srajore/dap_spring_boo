package com.zensar.spring_boot_app_ide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zensar.spring_boot_app_ide.entity.Product;
//@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	//List<Product>getByProductName(String productName); 
	
	//@Query(value = "from Product as p where p.productName=?1")
	//List<Product>test(String productName); 
	
	@Query(value = "select * from product where product_name=:name",nativeQuery = true)
	List<Product>test(@Param("name")String productName); 
	
	//List<Product>test(String productName,double productCost); 

}
