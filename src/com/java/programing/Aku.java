package com.java.programing;

public class Aku {
		public static void main(String[] args) {
			int n= 10;
			System.out.println("  ");
			for (int i = 0; i <n; i++) {
				System.out.print("  ");
				for (int j = 0; j < n; j++) {
					if (i==0||j==0||i==n/2||j==n-1) {
						System.out.print("A");
					}
					else {
						System.out.print(" ");

					}
					
				}
				System.out.print("  ");
				for (int j = 0; j < n; j++) {
					if (j==0||i+j==n/2||i-j==n/2) {
						System.out.print("K");
					}
					else {
						System.out.print(" ");

					}
				}
				System.out.print("  ");
				for (int j = 0; j < n; j++) {
					if (j==0||j==n-1||i==n-1) {
						System.out.print("U");
					}
					else {
						System.out.print(" ");

					}
				}
				
				System.out.println();
			}
		}

}
