package com.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.Car;
import com.practice.repository.CarRepo;

@Service
public class CarService {

	@Autowired
	CarRepo carRepo;
	
	public List<Car> getCars(){
		return carRepo.findAll();
	}
	
	public Car getCarById(Integer id) {
		return carRepo.findById(id).orElse(null);
	}
	
	public Car updateCar(Car c1, Integer id) {
		Car c2 = carRepo.findById(id).orElse(null);
		c2.setId(c1.getId());
		c2.setName(c1.getName());
		c2.setPrice(c1.getPrice());
		
		return carRepo.save(c2);
	}
	
	public Car createCar(Car c1) {
		return carRepo.save(c1);
	}
	
	public void deleteCar(Integer id) {
		carRepo.deleteById(id);
	}
	
}
