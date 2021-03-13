package net.javaguides.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.service.LocationService;

@Controller
public class LocationController {
	@Autowired
	private LocationService locationService;
	
	@GetMapping("/locations")
	public String viewLocationsPage(Model model) {
		model.addAttribute("listLocations", locationService.getAllLocations());
		return "locations";
	}
}
