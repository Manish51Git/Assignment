package com.te.assignment;

import java.util.Scanner;

public class LargestSmallest {

	public static void main(String[] args) {
    int size;
    int smallestValue;
    int largestValue;
    int distance;
    Scanner scanner= new Scanner(System.in);
    System.out.println("inter array Size: ");
    size=scanner.nextInt();
    int [] arr = new int[size];
    System.out.println("Enter array elements: ");
    for (int i=0; i<arr.length;i++) {
    	(arr[i]>largestValue) {
    		largestValue=arr[i];
    	}
    	largestValue=arr[0];
    	smallestValue=arr[0];
    	for (int j=0;i<arr.length;i++) {
    		if (arr[i]>largestValue) 
    			largestValue=arr[i];
    		}
    		else  (arr[i]<smallestValue) {
    			smallestValue=arr[i];
            }
           distance= largestValue-smallestValue;
           System.out.println("the largest value is= "+largestValue);
           System.out.println("the largest value is= "+smallestValue);
           System.out.println("the difference is= "+distance);
    
    
    
	}

}
	}
