package com.java.programing;

public class Patterns3 {
		public static void main(String[] args) {
			int n= 10;
			for (int i = 0; i <n; i++) {
				for (int j = 0; j < n; j++) {
					if (i==0||j==0||i==n/2||j==n-1||i==n-1) {
						
						System.out.print("B");
					}
					else {
						System.out.print(" ");

					}
					
					
				}
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
					if (j==0||j==n-1||i==j) {
						System.out.print("N");
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
				
				System.out.print("");
				for (int j = 0; j < n; j++) {
					if (j==0) {
						System.out.print("II");
					}
					else {
						System.out.print(" ");

					}
				}
				System.out.print("");
				for (int j = 0; j < n; j++) {
					if (j==0||j==n-1||i==j&&i<=n/2||i+j==n-1&&i<=n/2) {
						System.out.print("M");
					}
					else {
						System.out.print(" ");

					}
				}
				
				System.out.println();
			}
		}

}
