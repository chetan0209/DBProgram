package com.db.test;
/*
 * Q: When float object is cligible for GC 
 */
public class Object4 {
	public Object m() {
	Object o=new Float(3.14f);
	Object [] ob=new Object4[1];
	ob[0] =o;/*this LINE */
	o=null;/*THis LINE */
	
	ob[0]=null;//this LINE /
	return o;//this line
	}

}
