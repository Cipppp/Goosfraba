package com.example.goosfraba.controllers;

import com.example.goosfraba.models.ParkingFacility;
import com.example.goosfraba.services.ParkingFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parking-facilities")
public class ParkingFacilityController {
	@Autowired
	private ParkingFacilityService parkingFacilityService;

	@PostMapping
	public ParkingFacility createParkingFacility(@RequestBody ParkingFacility facility) {
		// validate and save facility
		return parkingFacilityService.createParkingFacility(facility);
	}

	@GetMapping("/{id}")
	public ParkingFacility getParkingFacilityById(@PathVariable String id) {
		// retrieve facility by id
		return parkingFacilityService.getParkingFacilityById(id);
	}

	@GetMapping("/city/{cityId}")
	public List<ParkingFacility> getParkingFacilitiesByCity(@PathVariable String cityId) {
		// retrieve facilities by city id
		return parkingFacilityService.getParkingFacilitiesByCity(cityId);
	}
}