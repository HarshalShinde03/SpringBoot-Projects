package com.boot.basic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.basic.entity.Table1;
import com.boot.basic.repository.Table1Repository;

@Service
public class Table1Service {

	@Autowired
	private Table1Repository table1Repository;
	
	
	public List<Table1> getTable1s(){
		return table1Repository.findAll();
	}
	
	public Table1 getTable1byId(Integer tId) {
		return table1Repository.findById(tId).orElse(null);
	}
	
	public void deleteById(Integer tId) {
		table1Repository.deleteById(tId);
	}
	
	public Table1 updateTable1(Integer tId, Table1 t1) {
		Table1 currenTable1 = table1Repository.findById(tId).orElse(null);
		if(currenTable1!=null) {
			currenTable1.setTCity(t1.getTCity());
			currenTable1.setTName(t1.getTName());
			return table1Repository.save(currenTable1);
		}
		else {
			return null;
		}
	}
	
	public Table1 createTable1(Table1 t1) {
		return table1Repository.save(t1);
	}
	
}
