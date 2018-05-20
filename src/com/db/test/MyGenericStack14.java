package com.db.test;

import java.util.Stack;

public class MyGenericStack14<E> {
	Stack<E> s=new Stack<>();
	public void push(E obj) {
		s.push(obj);
	}
	public E pop() {
		E obj=s.pop();
		return obj;
	}

}
