package com.dhanya.Hibernate_Inheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="Contract_employee")
public class Truck extends Vechile {
 double loadcapacity;

public double getLoadcapacity() {
	return loadcapacity;
}

public void setLoadcapacity(double loadcapacity) {
	this.loadcapacity = loadcapacity;
}
 
}
