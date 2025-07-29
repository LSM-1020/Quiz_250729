package com.LSM.Quiz;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Banana = "banana";
		String str = "";
		
		for(int i=0;i<Banana.length();i++) {
		if (str.indexOf("b") == -1) { 
			str = str + "b"; 
			System.out.print(str.charAt(0));
		
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