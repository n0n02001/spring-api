package com.example.demo.testCase1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SingletonClass {

	private static SingletonClass instance;

	private SingletonClass() {
	}

	/* 안정성은 높지만 성능이 낮다.
	synchronized를 통해 이 메소드에 하나의 스레드가 들어옴으로
	멀티스레드 환경에서 하나의 인스턴스라는 것으 보장할 수 있다.
	 단점으로는 동기화하는 때에 성능 이슈가 발생함. */

	public static synchronized SingletonClass getInstance() {
		if (instance == null) {
			instance = new SingletonClass();
		}

		return instance;
	}
}

class main {
	public static void main(String[] args) {
		SingletonClass instance = SingletonClass.getInstance();
	}

}