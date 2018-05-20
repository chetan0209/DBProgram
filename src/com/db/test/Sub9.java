package com.db.test;

public class Sub9 extends Super9
{
	/*
	 * when we will extend parent class
	 * so it enforce in child to implement parent
	 * parametrized construtor
	 */
	public Sub9(String text) {
		super(text);
		i=2;
	}
	
	public static void main(String[] args) {
		Sub9 s=new Sub9("Hello");
		System.out.println(s.i);
				
	}

}
