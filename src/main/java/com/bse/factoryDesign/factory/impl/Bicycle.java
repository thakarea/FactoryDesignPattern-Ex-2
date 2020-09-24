package com.bse.factoryDesign.factory.impl;

import org.springframework.stereotype.Component;

import com.bse.factoryDesign.factory.Vehicle;

@Component
public class Bicycle implements Vehicle{

	@Override
	public String specification() {
		return "This is Bicycle and the speed depends on the way you ride it";
	}

	@Override
	public String getType() {
		return "bicycle-type";
	}

}
