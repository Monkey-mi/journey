package com.imzhitu.journey.base.pojo;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public class ObjectDemoForHouse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8030459386342992735L;
	/**
	 * 楼层
	 */
	private Integer floor;
	/**
	 * 是否出售
	 */
	private boolean isSale;
	
	public ObjectDemoForHouse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ObjectDemoForHouse(Integer floor, boolean isSale) {
		super();
		this.floor = floor;
		this.isSale = isSale;
	}

	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	public boolean isSale() {
		return isSale;
	}
	public void setSale(boolean isSale) {
		this.isSale = isSale;
	}

	@Override
	public String toString() {
		return "ObjectDemoForHouse [floor=" + floor + ", isSale=" + isSale + "]";
	}
	
	
}
