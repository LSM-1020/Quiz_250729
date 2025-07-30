package com.LSM.Quiz;

public class Answ03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "banana";
		String result = ""; // int sum=0; 같은형식
		
	for(int i=0;i<str.length();i++) {
		if(result.indexOf(str.charAt(i)) == -1) {
			result += str.charAt(i);
		}
	}
		System.out.println(result);
	
	
	}
}
