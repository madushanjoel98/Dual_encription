package com.dual.home;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5_Starter {
	
	//SHA-256 genarater
	public static String SHA_256(String pass) throws NoSuchAlgorithmException {
		MessageDigest m=MessageDigest.getInstance("SHA-256");
		m.reset();
		m.update(pass.getBytes());
		byte[]digest=m.digest();
		BigInteger bigInteger=new BigInteger(1,digest);
		String hash=bigInteger.toString(16);
		
		return hash;
		
	}
	
	//MD5 Validator 
	public static Boolean md5_valid(String pass,String MD5) throws NoSuchAlgorithmException {
		MessageDigest m=MessageDigest.getInstance("MD5");
		m.reset();
		m.update(pass.getBytes());
		byte[]digest=m.digest();
		BigInteger bigInteger=new BigInteger(1,digest);
		String hash=bigInteger.toString(16);
		System.out.println("MD5 value:"+hash);
		if(hash.equals(MD5)) {
			return true;
		}else {
		return false;
		}
	}
	
	
	

}
