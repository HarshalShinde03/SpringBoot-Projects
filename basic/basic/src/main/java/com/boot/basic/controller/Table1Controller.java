package com.boot.basic.controller;

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

import com.boot.basic.entity.Table1;
import com.boot.basic.service.Table1Service;

@RestController
@RequestMapping("/table1s")
public class Table1Controller {
	
	@Autowired
	Table1Service table1Service;
	
	@GetMapping("/")
	public List<Table1> getDetails() {
		return table1Service.getTable1s();
	}
	
	@GetMapping("/{tId}")
	public Table1 getDetailsById(@PathVariable Integer tId) {
		return table1Service.getTable1byId(tId);
	}
	
	@PostMapping("/save")
	public Table1 createTable1(@RequestBody Table1 t1) {
		return table1Service.createTable1(t1);
	}
	
	@DeleteMapping("/{tId}")
	public void deleteTable1(@PathVariable Integer tId) {
		table1Service.deleteById(tId);
	}
	
	@PutMapping("/{tId}")
	public Table1 updateTable1(@PathVariable Integer tId,@RequestBody Table1 t1) {
		return table1Service.updateTable1(tId, t1);
	}
	
	
}

