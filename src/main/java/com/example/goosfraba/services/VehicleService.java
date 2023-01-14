package com.example.goosfraba.services;

import com.example.goosfraba.models.Vehicle;
import com.example.goosfraba.repostories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
	@Autowired
	private VehicleRepository vehicleRepository;

	public Vehicle createVehicle(Vehicle vehicle) {
		// validate and save vehicle
		return vehicleRepository.save(vehicle);
	}

	public List<Vehicle> getVehiclesByCityCode(String code) {
		// retrieve vehicles by city code
		return (List<Vehicle>) vehicleRepository.findByCityCode(code);
	}

	public Vehicle parkVehicle(String vehicleId, String facilityId) {
		// retrieve vehicle by id, update isParked to true and parkingFacilityId to facilityId
		Vehicle vehicle = vehicleRepository.findById(vehicleId).orElse(null);
		if (vehicle != null) {
			vehicle.setIsParked(true);
			vehicle.setParkingFacilityId(facilityId);
			return vehicleRepository.save(vehicle);
		}
		return null;
	}

	public Vehicle unParkVehicle(String vehicleId) {
		// retrieve vehicle by id, update isParked to false and parkingFacilityId to null
		Vehicle vehicle = vehicleRepository.findById(vehicleId).orElse(null);
		if (vehicle != null) {
			vehicle.setIsParked(false);
			vehicle.setParkingFacilityId(null);
			return vehicleRepository.save(vehicle);
		}
		return null;
	}
}