package com.te.assignment;

import java.util.Scanner;

public class Reverse {
	  public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter length of an array:");
			int n=sc.nextInt();
			System.out.println("Enter array elements:");
			int[] a= new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i]=sc.nextInt();
			}
			int b[]=new int[n];
			for (int i = b.length; i >0; i--) {
				b[i]=a[i];
				
			}
			for (int i = 0; i < b.length; i++) {
				System.out.println(a[i]);
			}
			sc.close();
		}
	}




