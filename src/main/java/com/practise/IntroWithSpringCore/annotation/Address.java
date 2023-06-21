package com.practise.IntroWithSpringCore.annotation;

public class Address {
	String street;
	String city;
	
	public Address() {
		super();
		System.out.println("Address Object Creations Start");
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		System.out.println("Setting Address Object");
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	

}
