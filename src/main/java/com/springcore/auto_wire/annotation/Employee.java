package com.springcore.auto_wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	//using type annotation
	@Autowired
	//to specify bean if there are mutiple bean abd it will give error if bean doesn't found
	@Qualifier("address1")
    private Address address;

	public Address getAddress() {
		return address;
	}
//@Autowired
	public void setAddress(Address address) {
		System.out.println("Setting values");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
//@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
    
}
