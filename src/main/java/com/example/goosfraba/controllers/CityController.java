package com.example.goosfraba.controllers;

import com.example.goosfraba.models.City;
import com.example.goosfraba.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {
	@Autowired
	private CityService cityService;

	@PostMapping
	public City createCity(@RequestBody City city) {
		// validate and save city
		return cityService.createCity(city);
	}

	@GetMapping("/{id}")
	public City getCityById(@PathVariable String id) {
		// retrieve city by id
		return cityService.getCityById(id);
	}

	@GetMapping("/code/{code}")
	public City getCityByCode(@PathVariable String code) {
		// retrieve city by code
		return cityService.getCityByCode(code);
	}

	@GetMapping
	public List<City> getAllCities() {
		// retrieve all cities
		return cityService.getAllCities();
	}
}