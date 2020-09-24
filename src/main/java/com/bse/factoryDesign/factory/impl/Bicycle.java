package com.bse.factoryDesign.factory.impl;

import org.springframework.stereotype.Component;

import com.bse.factoryDesign.factory.Vahicle;

@Component
public class Bicycle implements Vahicle{

	@Override
	public String specification() {
		return "This is Bicycle and the speed depends on the way you ride it";
	}

}
