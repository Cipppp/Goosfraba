package com.example.goosfraba.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Entity
@lombok.Data
public class City {
	@Id
	private String id;
	@Column(length = 256)
	@NotNull
	private String name;
	@Column(length = 4)
	@NotNull
	private String code;
	@OneToMany(mappedBy = "city")
	private List<ParkingFacility> parkingFacilities;

	public City() {

	}
	// getters and setters
}
