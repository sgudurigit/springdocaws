package com.io.springdocaws.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.io.springdocaws.model.Location;

@RestController
public class MainController {

	@GetMapping("/locations")
	public List<Location> getLocations() {
		
		List<Location> retailLocation = new ArrayList<Location>();
		
		Location l1 = new Location ("900","123 Main street",30.2,44.5);
		Location l2 = new Location ("800","324 Main street",18.2,22.5);
		Location l3 = new Location ("700","678 Main street",16.2,33.5);
		
		retailLocation.add(l1);
		retailLocation.add(l2);
		retailLocation.add(l3);
		
		return retailLocation;
		
	}
	
}
