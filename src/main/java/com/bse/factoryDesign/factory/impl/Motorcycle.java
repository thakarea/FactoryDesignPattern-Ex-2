package com.bse.factoryDesign.factory.impl;

import org.springframework.stereotype.Component;

import com.bse.factoryDesign.factory.Vehicle;

@Component
public class Motorcycle implements Vehicle {

	@Override
	public String specification() {
		return "This is MotorCycle with maximum speed of 400km/hr";
	}

	@Override
	public String getType() {
		return "bus-type";
	}

}
