package com.array;

import java.util.Scanner;

public class MinArray {

	public static void main(String[] args) 
	{
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements "+arr.length);
		//input elements into array
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//Displaying array elements
		System.out.println("Array elements are");
		for(int i=0;i<5;i++) 
		{
			System.out.println(arr[i]);
		}
	
		int max=arr[0];{
		for(int i=1;i<arr.length;i++) 
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
			System.out.println("Maximum number is"+max);
		}
		
		int min=arr[0];
		for(int i=1;i<arr.length;i++) 
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			
			
		}
		System.out.println("Minimum number is"+min);


	}

}
