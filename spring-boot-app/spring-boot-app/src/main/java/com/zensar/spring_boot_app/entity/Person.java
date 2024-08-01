package com.zensar.spring_boot_app.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Person {
	
	@Id
	private int personId;
	
	private String personName;
	
	private double personAge;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "person")

	/*@JoinTable(
	        name = "user_laptop",
	        joinColumns = @JoinColumn(
	                name = "person_id",
	                referencedColumnName = "personId"
	        ),
	        inverseJoinColumns = @JoinColumn(
	                name = "laptop_id",
	                referencedColumnName = "laptopId"
	        )
	)*/
	private List<Laptop> laptops;
	

}
