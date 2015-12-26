package com.imzhitu.journey.base.pojo;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public class ObjectDemoForCar implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1164444333984716739L;
	
	/**
	 * 颜色
	 */
	private String color;
	/**
	 * 价格
	 */
	private Integer price;
	
	public ObjectDemoForCar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ObjectDemoForCar(String color, Integer price) {
		super();
		this.color = color;
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ObjectDemoForCar [color=" + color + ", price=" + price + "]";
	}
	
}
