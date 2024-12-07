package com.dhanya.Hibernate_Inheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="Permanent_employee")
public class Car extends Vechile{
	int no_of_doors;

	public int getNo_of_doors() {
		return no_of_doors;
	}

	public void setNo_of_doors(int no_of_doors) {
		this.no_of_doors = no_of_doors;
	}
	
}
