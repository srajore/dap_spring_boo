package com.zensar.spring_boot_app_ide.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.spring_boot_app_ide.dto.ProductDto;
//@Repository
public interface ProductRepository extends JpaRepository<ProductDto, Integer> {

}
