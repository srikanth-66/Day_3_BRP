package com.home;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Stats5 
{
	public static void main(String[] args)
	{
		double total=0;
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		double arr []=new double[size];
		Random rd=new Random();
		try
		{
			for(int i=0;i<arr.length;i++)
			{
				double num=Math.random();
				arr[i]=num;
			}
			System.out.println("Displaying the random values into the array");

			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
				total=total+arr[i];

			}
			System.out.println("average is:" +total);
			Arrays.sort(arr);
			System.out.println("MIN values is:"+arr[0]);
			System.out.println("MAX values is:"+arr[arr.length-1]);			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}