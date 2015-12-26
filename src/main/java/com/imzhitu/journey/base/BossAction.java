package com.imzhitu.journey.base;

import org.springframework.beans.factory.annotation.Autowired;

import com.imzhitu.journey.base.service.BossService;

public class BossAction {
	
	@Autowired
	private BossService service;
	
	public void  testDemo(){
		service.showBossInfo();
	}
	
	
	
}
