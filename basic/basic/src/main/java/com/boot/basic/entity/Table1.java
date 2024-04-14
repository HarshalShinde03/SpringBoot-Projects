package com.boot.basic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Table1")
public class Table1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="tId")
	private Integer tId;
	private String tName;
	private String tCity;
}
