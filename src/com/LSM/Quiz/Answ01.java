package com.LSM.Quiz;

public class Answ01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcabcabc";
		String strTarget = "ab";
		int countA = 0;
		
		for(int i=0;i<=str.length() - strTarget.length();i++) {
			if(str.substring(i,i+strTarget.length()).equals(strTarget)) { //글자뽑아내기 1회전:0,2
				//1회전) i=0 0~2 -> "ab" 이게 strTarget과 같은지 비교, 같으면 카운트함
				//2회전) i=1 1~3 -> "bc" 
				//3회전) i=2 2~4 -> "ca" 
				//이런식으로 하면 1,4,7회전때 ab를찾아서 총 3회 카운트해줌
				countA++;
			}
		}
		System.out.println(countA);
	}

}
