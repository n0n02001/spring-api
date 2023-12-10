package com.example.demo.testCase1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SingletonClass3 {

	private static volatile SingletonClass3 instance;
	// volatile java 1.5 이상부터

	/*
	 * double checked locking
	 * 작업 처리 효율에 있어서 더 좋다.
	 */

	public static SingletonClass3 getInstance() {
		if (instance == null) {
			synchronized (SingletonClass3.class) {
				if (instance == null) {
					instance = new SingletonClass3();
				}
			}
		}
		return instance;
	}

	private SingletonClass3() {
	}
}

