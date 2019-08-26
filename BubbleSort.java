package com.java8.samples;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {3,5,1,6,2};
		
		for (int i=0; i< (arr.length - 1); i++) {
			for (int j=0; j < (arr.length - i - 1); j++) {
				if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
			}
			
		}
		
		for (int i = 0; i< arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
