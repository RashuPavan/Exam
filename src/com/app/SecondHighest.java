package com.app;

public class SecondHighest {

	public static void main(String args[])
	{
		int arr[]= {100,14,46,47,94,94,52,86,36,94,89};
		int max=arr[0];
	
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1]>max)
				max=arr[i];
		}
		
		System.out.println("max is=" +max);
	}
}
