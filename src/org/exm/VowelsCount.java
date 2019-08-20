package org.exm;

import java.util.Scanner;

public class VowelsCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String s = sc.next();
		int vowels = 0;
		int nonvowels=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')) {
				vowels++;
			}
			else {
				nonvowels++;
			}
		}
		System.out.println("Vowels: "+vowels);
		System.out.println("Consonants: "+nonvowels);
	}

}
