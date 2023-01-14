package com.example.goosfraba.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
@lombok.Data
public class Vehicle {
	@Id
	private String id;
	@ManyToOne
	private City city;
	private Boolean isParked;
	private String parkingFacilityId;

	public Vehicle() {

	}
	// getters and setters
}