package com.db.test;

public class TestB6 {
	public void start() {
		System.out.println("TESTB");
	}
public static void main(String[] args) {
	TestB6 t=new TestB6();
	(TestA6)t.start();
	
	/*
	 * Below syntax has been asked which is not possible practically so explain
	 * it
	 */
//	/(TestA6)new TestB6().start();
}
}
