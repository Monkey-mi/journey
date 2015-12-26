package com.imzhitu.journey.base.service.impl;

import org.springframework.stereotype.Service;

import com.imzhitu.journey.base.pojo.ObjectDemoForBoss;
import com.imzhitu.journey.base.service.BossService;

@Service
public class BossServiceImpl implements BossService {

	 public void showBossInfo() {
		
		ObjectDemoForBoss boss = new ObjectDemoForBoss();
		boss.setName("MikeShailene");
		
		System.out.println("------------------------------------->" +"中华"+ "<---------------------------------------------------");
	}


	}

