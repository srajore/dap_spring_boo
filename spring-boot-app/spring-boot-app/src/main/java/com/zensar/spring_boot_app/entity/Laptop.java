package com.zensar.spring_boot_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Laptop {
	@Id
	private int laptopId;
	
	private String laptopName;
	
	@ManyToOne
	private Person person;

}
