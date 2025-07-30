package com.LSM.Quiz;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcabcabc";
		
		int count = 0;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i) == 'a' && str.charAt(i+1) == 'b') {	
				count++;
			}
		}
		
		System.out.println(str + "문자열 내 ab가 " + count + "번 포함됨");
	}

}