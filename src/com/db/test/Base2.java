package com.db.test;

public class Base2 {
	public static void main(String[] args) {
		Sub2 sub1=new Sub2();
		Sub2 sub2=new Sub2();
		Sub2 sub3=new Sub2();
		System.out.println(sub1.num);

		System.out.println(sub2.num);

		System.out.println(sub3.num);
		System.out.println(sub1.num+sub2.num+sub3.num);
	}


}
