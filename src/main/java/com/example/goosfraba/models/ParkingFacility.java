package com.example.goosfraba.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.jetbrains.annotations.NotNull;

@Entity
@lombok.Data
public class ParkingFacility {
	@Id
	private String id;
	@Column(length = 256)
	@NotNull
	private String name;
	@ManyToOne
	private City city;
	private Integer capacity;
	private Integer availableCapacity;

	public ParkingFacility() {

	}
	// getters and setters
}