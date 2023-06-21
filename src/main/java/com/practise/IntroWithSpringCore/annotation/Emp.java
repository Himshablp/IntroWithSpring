package com.practise.IntroWithSpringCore.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	String empId;
	String empName;
	Address address;
	
	public Emp() {
		super();
		System.out.println("Employee Object creation start");
	}
	@Autowired
	public Emp(String empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}

	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}

	
	

}
