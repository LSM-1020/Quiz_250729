package com.LSM.Quiz;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "i like chopin";
		String str = "";
		
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			
			if (i == 0) { 
				str = str + Character.toUpperCase(ch);
			}else if (word.charAt(i - 1) == ' ') {
                str = str + Character.toUpperCase(ch);
            } else {
                str = str + ch;
            }
        }
        System.out.println(str);
	}
}