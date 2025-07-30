package com.LSM.Quiz;

public class Answ02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String email = "korea@korea.com";
	
//	String addr1 = email.substring(0, 5);
//	System.out.println("이메일 아이디 :" + addr1);
//	
//	String addr2 = email.substring(5,15);
//	System.out.println("이메일 도메인 :" + addr2);
	
	int at_index = email.indexOf("@"); //@의 인덱스
	String emailId = email.substring(0,at_index);
	String emailDomain = email.substring(at_index + 1);
	
	System.out.println("이메일 아이디 :" + emailId);
	System.out.println("이메일 도메인 :" + emailDomain);
	}
}