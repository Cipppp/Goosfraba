package com.example.goosfraba.services;

import com.example.goosfraba.models.City;
import com.example.goosfraba.repostories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
	@Autowired
	private CityRepository cityRepository;

	public City createCity(City city) {
		// validate and save city
		return cityRepository.save(city);
	}

	public City getCityById(String id) {
		// retrieve city by id
		return cityRepository.findById(id).orElse(null);
	}

	public City getCityByCode(String code) {
		// retrieve city by code
		return cityRepository.findByCode(code);
	}

	public List<City> getAllCities() {
		// retrieve all cities
		return (List<City>) cityRepository.findAll();
	}
}
