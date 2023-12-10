package com.example.demo.testCase1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SingletonClass2 {

	private static SingletonClass2 instance = new SingletonClass2();

	private SingletonClass2() {
	}

	/*
	 * 이른 초기화 방법을 사용하므로 멀티 스레드 환경에 대응이 가능하다.
	 * 단점으로는 미리 만들어서 인스턴스를 만드는 과정이 길다면
	 * 메모리 리소스를 많이 사용함. (메모리 낭비할 가능성이 있음.)
	 */

	public static SingletonClass2 getInstance() {
		return instance;
	}
}

