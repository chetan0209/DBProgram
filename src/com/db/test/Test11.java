package com.db.test;
/*
 * Boolean flag value to reach the finally block
 */
public class Test11 {
	try {
		if(flag) {
			while(true) {
		}
			else {
				System.exit(1);
			}
			finally {
				System.out.println("In finally");
			}
	}

}
