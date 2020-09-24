package com.bse.factoryDesign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bse.factoryDesign.factory.Vehicle;
import com.bse.factoryDesign.factory.VehicleFactoryImplementation;

@RestController
public class FactoryController {

	// private static final Logger Log = LoggerFactory.getLogger(FactoryController.class);

	@GetMapping("/bse/vehicle/{vehicle-type}")
	public String getVehicleTypeInfo(@PathVariable("vehicle-type") String vehicle) throws Exception {

		Vehicle vahicleFactory = VehicleFactoryImplementation.createInstance(vehicle);
		return vahicleFactory.specification();

	}

}
