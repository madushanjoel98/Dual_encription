package com.dual.home;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		@SuppressWarnings("resource")
		Scanner type=new Scanner(System.in);
		
		System.out.println("Testing File");
		System.out.println("enter the new PassWord:");
		String pass=type.nextLine();
		System.out.println("enter the key");
		String skey=type.nextLine();;
		System.out.println("Password: "+pass);
		System.out.println("Secretkey: "+skey);
	
		//encrypt
		String inString=Dual_seure.DualEncrypt(pass, skey);
		System.out.println("Encrpted pass: "+inString);
		System.out.println("  ");
		System.out.println("  ");
		//decrypt
		System.out.println("Decrypt:");
		System.out.println(Dual_seure.DualDecrypt(pass,inString, skey));

		
	}

}
