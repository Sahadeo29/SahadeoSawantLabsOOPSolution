package com.greatlearning.credentials;
import java.util.Random;

import com.greatlearning.employee.*;

public class CredentialServices {
	public char[] generatePassword() {
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialCharacters="!@#$%^&*_+/<>?";
		String values= capitalLetters+smallLetters+numbers+specialCharacters;
		Random random=new Random();
		char[] password=new char[8];
		for(int i=0;i<8;i++) {
			password[i]=values.charAt(random.nextInt(values.length()));
		}
		return password;
		}
	
	public String generateEmailAddress(Employee employee,String department) {
		String emailAddress="";
		emailAddress= employee.getFirstName()+employee.getLastName()+"."+employee.getDepartment()+"@"+"abc.com";
		return emailAddress.toLowerCase();
		}
	
	public void showCredentials(Employee employee,String emailAddress,char[] generatePassword) {
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows:");
		System.out.println("Email-->"+emailAddress);
		System.out.println("Password-->"+"");
		System.out.print(generatePassword);
		}
	}