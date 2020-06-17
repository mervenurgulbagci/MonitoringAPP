package com.okan.monitor.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "DOWNSERVICES")
@Entity
public class Downservices {

	
	@Id
	@Column
	@SequenceGenerator(name = "DOWN_SEQ", sequenceName = "DOWN_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DOWN_SEQ")
	private Integer id;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private Date time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Downservices() {
	}

	public Downservices(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public Downservices(String name, String address, Date time) {
		this.name = name;
		this.address = address;
		this.time = time;
	}

}
