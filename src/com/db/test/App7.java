package com.db.test;

public class App7 {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("DBOI");
	StringBuffer sb1=new StringBuffer("Banglore");
	sb.delete(1, 3);
	sb.append(sb1);
	System.out.println(sb);
	
}
}
