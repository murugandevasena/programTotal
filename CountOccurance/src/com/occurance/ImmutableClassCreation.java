package com.occurance;

public final class ImmutableClassCreation {
	 final private int aadharNum;
	 
	 public ImmutableClassCreation(int aadhar) {
		 aadharNum= aadhar;
	 }

	public int getAadharNum() {
		return aadharNum;
	}
}
