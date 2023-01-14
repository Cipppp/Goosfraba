package com.example.goosfraba.repostories;

import com.example.goosfraba.models.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends MongoRepository<Vehicle, String> {
	// additional methods can be added here
	Vehicle findByCityCode(String code);
}
