package com.java.programing;

public class Patterns2 {
		public static void main(String[] args) {
			int n= 3;
			for (int i = 0; i < n; i++) { //1st i Loops
					for (int j = 0; j < n; j++) {
						System.out.print("*");
					}
					for (int j = 0; j < n; j++) {
						System.out.print("$");
					}
					System.out.println();
				}
}
}
