package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		String[] fortuneList= {"Good Fortune", "Ok Fortune", "Muh Fortune", "Not so good Fortune", "Bad Fortune"};
		
		int rnd = new Random().nextInt(fortuneList.length);
		
		
		return fortuneList[rnd];
	}

}
