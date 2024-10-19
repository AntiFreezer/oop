package com.dmitrydrobysh.app;

class MyInteger{
	private final int value;

	public MyInteger(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}

/* Is Error if value is final

	public void setValue(int value){
		this.value = value;
	}

*/
}