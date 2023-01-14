package com.example.goosfraba.repostories;

import com.example.goosfraba.models.ParkingFacility;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingFacilityRepository extends MongoRepository<ParkingFacility, String> {
	// additional methods can be added here

	// initialize the service
	// create a new parking facility

	ParkingFacility findByCityId(String cityId);

	ParkingFacility findByCityCode(String cityCode);


}
