package com.example.goosfraba.controllers;

import com.example.goosfraba.models.Vehicle;
import com.example.goosfraba.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
	@Autowired
	private VehicleService vehicleService;

	@PostMapping
	public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
		// validate and save vehicle
		return vehicleService.createVehicle(vehicle);

	}

	@GetMapping("/city/{code}")
	public List<Vehicle> getVehiclesByCityCode(@PathVariable String code) {
// retrieve vehicles by city code
		return vehicleService.getVehiclesByCityCode(code);
	}

	@PutMapping("/park/{vehicleId}/{facilityId}")
	public Vehicle parkVehicle(@PathVariable String vehicleId, @PathVariable String facilityId) {
		// retrieve vehicle by id, update isParked to true and parkingFacilityId to facilityId
		return vehicleService.parkVehicle(vehicleId, facilityId);
	}

	@PutMapping("/unpark/{vehicleId}")
	public Vehicle unParkVehicle(@PathVariable String vehicleId) {
		// retrieve vehicle by id, update isParked to false and parkingFacilityId to null
		return vehicleService.unParkVehicle(vehicleId);
	}
}