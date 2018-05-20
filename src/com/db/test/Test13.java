package com.db.test;

public class Test13 {

	public int aMethod() {
		/*
		 * run prog with static and non-static output will be
		 * diff because in inside non static method
		 * we can not define static varible otherwise 
		 * it will be compile time error. 
		 */
		static int i=0;
		
//		 int i = 0;
		i++;

		return i;
	}

	public static void main(String[] args) {
		Test13 t=new Test13();
		t.aMethod();
		int j=t.aMethod();
		System.out.println(j);
	}
}
