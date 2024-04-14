package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.Car;
import com.practice.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {

	@Autowired
	CarService carService;
	
	@GetMapping("/")
	public List<Car> displayCars(){
		return carService.getCars();
	}
	
	@GetMapping("/{id}")
	public Car displayById(@PathVariable Integer id) {
		return carService.getCarById(id);
	}
	
	@PostMapping("/save")
	public Car createCar(@RequestBody Car c1) {
		return carService.createCar(c1);
	}
	
	@PutMapping("/{id}")
	public Car updateCar(@RequestBody Car c1, @PathVariable Integer id) {
		return carService.updateCar(c1, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Integer id) {
		 carService.deleteCar(id);
	}
	
}
