package com.example.goosfraba.repostories;

import com.example.goosfraba.models.City;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends MongoRepository<City, String> {
	// additional methods can be added here

	City findByCode(String code);

}
