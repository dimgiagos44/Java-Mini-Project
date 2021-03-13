package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Location;
import net.javaguides.springboot.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService{
	@Autowired
	private LocationRepository locationRepository;
	@Override
	public List<Location> getAllLocations(){
		return locationRepository.findAll();
	}

}
