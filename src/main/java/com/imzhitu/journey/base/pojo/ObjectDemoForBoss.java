package com.imzhitu.journey.base.pojo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObjectDemoForBoss implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8533410403379866208L;
	
	private String name;
	@Autowired
	private ObjectDemoForCar car;
	@Autowired
	private ObjectDemoForHouse house;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ObjectDemoForCar getCar() {
		return car;
	}
	public void setCar(ObjectDemoForCar car) {
		this.car = car;
	}
	public ObjectDemoForHouse getHouse() {
		return house;
	}
	public void setHouse(ObjectDemoForHouse house) {
		this.house = house;
	}
	@Override
	public String toString() {
		return "ObjectDemoForBoss [name=" + name + ", car=" + car + ", house=" + house + "]";
	}
	
}
