package org.pratice;

public class StringVowels {
	public static void main(String[] args) {
	String s="HemaLatha";
	s=s.toLowerCase();
	int vowels=0,nonvowels =0;
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			vowels++;
		}
		else {
			nonvowels++;
		}}
	System.out.println("vowels count"+vowels);
	System.out.println("nonvowels count+nonvowels");
		
	
	

}
}

