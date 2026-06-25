package com.nt.service;

public class Arithmetic {

	public int sum(int x,int y) {
		return(x+y);
	}
	
	public int sub(int x,int y) {
		return (x-y);
	}
	
	public double mult(int x,int y) {
		System.out.println("Arithmetic mult() called!!!!");
		return (x*y);
	}
	
	public int div(int x,int y) {
		System.out.println("Arithmetic div() called!!!!");
		return (x/y);	}
}
