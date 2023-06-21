package com.practise.IntroWithSpringCore.stereotype;

import org.springframework.stereotype.Component;

@Component
public class Address {
	String street;
	String colony;
	String City;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", colony=" + colony + ", City=" + City + "]";
	}
	

}
