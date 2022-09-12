package com.te.assignment;

import java.util.Scanner;

public class NumberAdd {
public static void main(String[] args) {
	int sum=0;
	Scanner scanner=new Scanner(System.in);
	System.out.println("How many numbers you want to add:");
	int n = scanner.nextInt();
	int a[]= new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=scanner.nextInt();
	}
	for (int i = 0; i <a.length; i++) {
		sum=sum+a[i];
	}
	System.out.println(sum);
	scanner.close();
}
}
