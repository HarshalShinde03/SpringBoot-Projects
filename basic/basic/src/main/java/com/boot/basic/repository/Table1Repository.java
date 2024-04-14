package com.boot.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.basic.entity.Table1;

@Repository
public interface Table1Repository extends JpaRepository<Table1, Integer>{

}
