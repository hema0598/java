package org.pratice;

public class CaseCount {
	public static void main(String[] args) {
		String S="HeMaLaThA123$$##";
		int upper=0,lower=0,special=0,number=0;
		for(int i=0;i<S.length();i++) {
			char c=S.charAt(i);
	
		if(Character.isUpperCase(c)) {
			upper++;

}
		else if(Character.isLowerCase(c)) {
			lower++;

}
		else if(Character.isDigit(c)) {
			number++;

}
		else {
		special++;
}}
		System.out.println("upper case"+upper);
		System.out.println("lower case"+lower);
		System.out.println("number count"+number);
		System.out.println("special count"+special);
	}}
