package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		*/
	
		/*
		int[] intArray = new int[] {3,6,9};
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		*/
		
		/*
		int[] intArray = {3, 6, 9};
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}			
		*/
		
		double[] dArray = new double[5];
		dArray[0] = 3.14;
		dArray[1] = 7.3;
		dArray[2] = 5.2;
		
		for(int i=0; i<dArray.length; i++) {
			System.out.println(dArray[i]);
		}
		
		System.out.println("================");
		
		char[] cArray = new char[5];
		cArray[0] = '안';
		cArray[1] = '녕';
		cArray[2] = '하';
		cArray[3] = '세';
		cArray[4] = '요';
		
		for(int i=0; i<cArray.length; i++) {
			System.out.println(cArray[i]);
		}
		
		System.out.println("================");
		boolean[] bArray = new boolean[3];
		
		bArray[0] = true;
		bArray[1] = false;
		bArray[2] = 3==5;
		
		for(int i=0; i<bArray.length; i++) {
			System.out.println(bArray[i]);
		}
		
		
	}		

}
