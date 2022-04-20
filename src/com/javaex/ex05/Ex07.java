package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] leftArray = new int[] {10, 20, 30};
		int[] rightArray = new int[] {10, 20, 30};
		
		if(leftArray.length==rightArray.length) { //두배열의갯수가 같니?
			//같으면 세부검사
		//	System.out.println("세부검사");
			for(int i=0; i<leftArray.length; i++) {
				
				if(leftArray[i] != rightArray[i]) { //각방의 데이터가 다르니?
					//다르면
					System.out.println(i + " 번째의 값이 다릅니다. ");
				}
			}
			
		}else {
			System.out.println("두배열의 크기가 다릅니다.");
		}
		
	}

}
