package com.cag.lab1.basic;
import java.util.*;
public class Sum
{
	static int calculateSum(int n)
	{
		int sum=0;
		for(int iteration=1; iteration<=n; iteration ++)
		{
			if(iteration%3==0 || iteration%5==0)
			{
			sum=sum+iteration;
			}
		}
		return sum;
		
	}
	public static void main(String arg[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = reader.nextInt();
		reader.close();
        System.out.println(calculateSum(n));			
	}
}