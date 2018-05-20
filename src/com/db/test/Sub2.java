package com.db.test;

public class Sub2 {
	public static Integer num = 10;

	// use static and non-static output will be diffrent
	// for this class we have Base2 main class
	// where this class is calling
	public Sub2() {
		num = num + 1;
	}
}
