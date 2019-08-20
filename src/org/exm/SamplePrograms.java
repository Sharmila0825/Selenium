package org.exm;

import java.util.Scanner;

public class SamplePrograms {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String s = sc.next();

		String rev = "";
		System.out.println(s);
		int l = s.length();
		int i;
		System.out.println("Length: " + l);
		for (i = l - 1; i >= 0; i--) {
			char c = s.charAt(i);
			rev = rev + c;
		}
		System.out.println(rev);
		if (s.equalsIgnoreCase(rev)) {
			System.out.println("PAlindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}
