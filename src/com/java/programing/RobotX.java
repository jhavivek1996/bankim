package com.java.programing;

public class RobotX {
	public static void main(String[] args) {
		int n=11;
		 for (int i = 0; i <n; i++) {
			 for (int j = 0; j <n; j++) {
				 if (i<=n||j<=n) {
					 System.out.print(" ");
				}				
			}
			 for (int j = 0; j <n; j++) {
				 if (j>=n/2-i&&j<=n/2+i&&j>=i-n/2&&j<=n+n/2-1-i&&j>=n/4) {
					 System.out.print("*");
				}
				 else {
					System.out.print(" ");
				}
			}
		System.out.println();
			
		}
	}

}
