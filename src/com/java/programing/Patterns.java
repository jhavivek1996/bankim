package com.java.programing;

public class Patterns {
	public static void main(String[] args) {
		int n= 3;
		for (int i = 0; i < n; i++) { //1st i Loops
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}//close of 1st i loops
		for (int i = 0; i < n; i++) {// 2nd i Loops required
			for (int j = 0; j < n; j++) {
				System.out.print("$");
			}
			System.out.println();
		}//close of 2nd i loops
	}

}
