package com.zensar.spring_boot_app_ide.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.spring_boot_app_ide.entity.Product;
//@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
