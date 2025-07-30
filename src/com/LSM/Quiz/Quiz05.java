package com.LSM.Quiz;

public class Quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str = "Hello123, Java456";
		 
	        int count = 0;
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
	                count++;
	            }
	        }

	        System.out.println(count);
		
	}

}