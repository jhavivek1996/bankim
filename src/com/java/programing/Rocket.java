package com.java.programing;

public class Rocket {
	public static void main(String[] args) {
		int n =9;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n; j++) {
				if (i<=n||j<=n) {
					System.out.print(" ");
				}
				
			}
			for (int j = 0; j < n; j++) {
				if (j>=n/2-i&&j<=n/2+i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
					
				}
				
			}
			System.out.println();
		}//end of first set
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n; j++) {
				if (i<=n||j<=n) {
					System.out.print(" ");
				}
				
			}
			for (int j = 0; j < n; j++) {
				if (i<=n||j<=n) {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}//end of second set
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n; j++) {
				if (j>=n-1-i) {
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			for (int j = 0; j < n; j++) {
				if (i<=n||j<=n) {
					System.out.print("*");
				}
				
			}
			for (int j = 0; j < n; j++) {
				if (j<=i) {
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}//end of third set
	}

}
