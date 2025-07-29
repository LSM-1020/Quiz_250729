package com.LSM.Quiz;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "i like chopin";
		String str = "";
		
		for(int i=0;i<word.length();i++) {
			if (str.indexOf("i") == -1) { 
				System.out.println(str.toUpperCase());
				System.out.println(str);
			
			}else if (str.indexOf("a") == -1) {
				str = str + "a"; 
				System.out.print(str.charAt(1));
				
			}else if (str.indexOf("n") == -1) {
				str = str + "n"; 
				System.out.print(str.charAt(2));
			}

			}	
		
	}

}
