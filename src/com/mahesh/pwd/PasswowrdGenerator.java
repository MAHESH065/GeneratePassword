package com.mahesh.pwd;

import java.util.Random;

public class PasswowrdGenerator {
	public static void main(String[] args) {
		
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String randomPwd = "";
		int length = 6;
		
		Random rand = new Random();
		
		char[] chars = new char[length];
		for(int i = 0; i < length; i++) {
			chars[i] = characters.charAt(rand.nextInt(characters.length()));
		}
		
		System.out.println(chars.toString());
		
		for (int i = 0; i < chars.length; i++) {
			randomPwd += chars[i];
		}
		
		System.out.println("Password :: "+randomPwd);
	}
}
