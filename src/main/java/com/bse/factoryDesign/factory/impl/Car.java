package com.bse.factoryDesign.factory.impl;

import org.springframework.stereotype.Component;

import com.bse.factoryDesign.factory.Vehicle;

@Component
public class Car implements Vehicle{

	@Override
	public String specification() {
		return "This is Car with maximum speed of 200km/hr";
	}

	@Override
	public String getType() {
		return "car-type";
	}
}
