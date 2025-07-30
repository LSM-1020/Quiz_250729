package com.LSM.Quiz;

public class Answ04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "i like chopin";
		String str2 = "";
		
		for(int i=0;i<str.length();i++) {
			if(i == 0) { //문장의 첫글자 확인
				//str.charAt(i) -> toUpperCase() 적용 안됨
				str2 = str2 + String.valueOf(str.charAt(0)).toUpperCase();
				//문자열로 바꿔줌 '' -> ""
			} else if (String.valueOf(str.charAt(i)).equals(" ")) {
				str2 = str2 + str.charAt(i); //빈칸을 삽입
				str2 = str2 + String.valueOf(str.charAt(i+1)).toUpperCase();
				i++; 
				// 이미 다음 i값에 해당하는 문자는 대문자로 변경되어 삽입완료 ->다음문자에 대한 i값은 생략
			} else {
				str2 = str2 + String.valueOf(str.charAt(i));
			}
		}
		 System.out.println(str2);
		
		
	}
}
