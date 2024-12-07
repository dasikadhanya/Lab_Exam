package com.dhanya.Hibernate_Inheritance;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
//@Table(name="Emp")
@DiscriminatorColumn(name="type",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value="Vechile")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Vechile {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
int id;
String name;
String type;
double maxspeed;
String color;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double getMaxspeed() {
	return maxspeed;
}
public void setMaxspeed(double maxspeed) {
	this.maxspeed = maxspeed;
}
public String getColor() {
	return color;
}
public void setColor1(String color) {
	this.color = color;
}
}
