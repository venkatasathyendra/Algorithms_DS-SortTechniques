package com.java8.samples;

public class BubbleSortSingleLoop {
	
public static void main(String arr[]) {
	int arr1[] = {3,5,1,6,2};
	int len = arr1.length;
	boolean valuesSwitched = false;
	for(int i = 1; i <= len; i++)
	{
	    if(i == len)
	    {
	        if(!valuesSwitched) break;

	        valuesSwitched = false;
	        i = 1;
	    }
	    if(arr1[i - 1] > arr1[i])
	    {
	        int temp = arr1[i - 1];
	        arr1[i - 1] = arr1[i];
	        arr1[i] = temp;
	        valuesSwitched = true;
	    }
	}
	
	for (int j = 0; j<arr1.length;j++) {
		System.out.println(arr1[j]);
	}
}

}
