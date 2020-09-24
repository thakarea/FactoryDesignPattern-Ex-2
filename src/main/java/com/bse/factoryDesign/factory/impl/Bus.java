package com.bse.factoryDesign.factory.impl;

import org.springframework.stereotype.Component;

import com.bse.factoryDesign.factory.Vehicle;

@Component
public class Bus implements Vehicle {

	@Override
	public String specification() {
		return "This is Bus with maximum speed of 150km/hr";
	}

	@Override
	public String getType() {
		return "motor-cycle-type";
	}

}
