package com.occurance;

public class UseAbstractPractice extends AbstractPractice {
	public void printDetails() {
		String s = "Onward";
		int gstNum = 1234;
		System.out.println(s);
		System.out.println(gstNum);
	}
	public static void main(String[] args) {
		//we can not create instance for abstract class.
		UseAbstractPractice u = new UseAbstractPractice();
		//AbstractPractice s = new AbstractPractice();
		u.printDetails();
	}

}
