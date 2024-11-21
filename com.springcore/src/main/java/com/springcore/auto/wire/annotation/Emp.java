package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("Setting values");
		this.address = address;
	}
	
	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor...");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
