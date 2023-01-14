package com.example.goosfraba.services;

import com.example.goosfraba.models.ParkingFacility;
import com.example.goosfraba.repostories.ParkingFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingFacilityService {
	@Autowired
	private ParkingFacilityRepository parkingFacilityRepository;

	public ParkingFacility createParkingFacility(ParkingFacility facility) {
		// validate and save facility
		return parkingFacilityRepository.save(facility);
	}

	public ParkingFacility getParkingFacilityById(String id) {
		// retrieve facility by id
		return parkingFacilityRepository.findById(id).orElse(null);
	}

	public List<ParkingFacility> getParkingFacilitiesByCity(String cityId) {
		// retrieve facilities by city id
		return (List<ParkingFacility>) parkingFacilityRepository.findByCityId(cityId);
	}
}
