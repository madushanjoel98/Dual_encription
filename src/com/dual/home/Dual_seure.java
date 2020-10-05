package com.dual.home;

import java.security.NoSuchAlgorithmException;

//MAIN CLASS
public class Dual_seure {
	// output is a String
	public static String DualEncrypt(String pass,String skey) throws NoSuchAlgorithmException {
		String md=Md5_Starter.mD5(pass);
		return One_Encryption.encrypt(md, skey);
	}
	//Output is a Boolean. if your password is wrong output is False else it was correct output is true
	public static Boolean DualDecrypt(String oriPass,String dePass,String skey) throws NoSuchAlgorithmException {
		String de=One_Encryption.decrypt(dePass, skey);
		return Md5_Starter.md5_valid(oriPass, de);
	}


}
