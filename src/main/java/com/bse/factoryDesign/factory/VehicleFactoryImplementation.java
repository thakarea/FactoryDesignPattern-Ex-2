package com.bse.factoryDesign.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleFactoryImplementation {

	@Autowired
	private List<Vehicle>  vehicleList;

	private static final Map<String, Vehicle> handler = new HashMap<String, Vehicle>();

	@PostConstruct
	private void initMap()
	{
		vehicleList.stream().forEach(vehicle -> handler.put(vehicle.getType(), vehicle));
	}

	public static Vehicle createInstance(String vehicle) throws Exception {
		return Optional.ofNullable(handler.get(vehicle)).orElseThrow(() -> new IllegalArgumentException("Invalid vahicle"));
	}

}
