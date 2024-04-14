package com.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.entity.Car;

public interface CarRepo extends JpaRepository<Car, Integer>{

	
}
