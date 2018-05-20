package com.db.test;

public class PassO8 extends Two8{
public static void main(String[] args) {
	PassO8 p=new PassO8();
	p.start();
}
public void start() {
	Two8 t=new Two8();
	System.out.println(t.x);
	Two8 t2=fix(t);
	
}
private Two8 fix(Two8 t) {
	t.x=42;
	return t;
}
}
