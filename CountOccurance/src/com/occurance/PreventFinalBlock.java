package com.occurance;

public class PreventFinalBlock {
	public static void main(String[] args) {
		
		int x= 4;
		try {
			x=x*5;
			System.out.println(x);
			System.exit(0);
		}
		catch(ArithmeticException a) {
			a.printStackTrace();
		}
		finally {
			System.out.println("It is final block.");
		}
	}

}
