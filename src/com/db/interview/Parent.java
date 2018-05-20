package com.db.interview;
/*
 * will parent class contain one method that return int or any custom object
 * in child class can we change it return type
 * 
 * Answer: we can not change
 * 
 * see both example covered in child parent class for 
 * overiding cases
 */
public class Parent {

	/*
	 * here we used in parent class return type as int
	 * child when we will try with diffrent return types 
	 * so it will be a compile time error
	 * as we can not changes return type of primitive or
	 * wrapper type or any custom type object
	 * like parent contain Employee type as return
	 
	 child class returing Customer type object
	 that not-possible
	 */
	public int m1(int i) {
		return 0;
	}
	/*public Employee m1() {
		return new Employee():
	}*/
	//if return type as wrapper class
	public Integer m2(int i) {
		return 0;
	}
}
