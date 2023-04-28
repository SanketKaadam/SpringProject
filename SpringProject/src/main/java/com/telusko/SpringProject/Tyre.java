package com.telusko.SpringProject;

import org.springframework.stereotype.Component;

@Component // if we don't mention component annotation then we need to use xml based configuration
public class Tyre {
	
	private String Brand;
	

	/* public Tyre(String brand) {
		super();
		Brand = brand;
	} */

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	@Override
	public String toString() {
		return "Its Working...";
	}
	

}
