package com.example.demo.testCase1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SingletonClass4 {

	private static SingletonClass4 instance;

	public static class SingletonClassHolder {
		private static final SingletonClass4 instance = new SingletonClass4();
	}

	private SingletonClass4() {
	}
	/*
	 * lazy loading이 가능해진다.
	 */

	public static SingletonClass4 getInstance() {
		
		return SingletonClassHolder.instance;
	}

}