package com.cag.lab1.basic;
import java.util.*;
public class Diff {
	static int calDiff(int n)
	{ 

	int l, k, m; 
		l = (n * (n + 1) * (2 * n + 1)) / 6; 
		k = (n * (n + 1)) / 2;
		k = k * k; 
		m = Math.abs(l - k); 
		return m; 
	} 
	public static void main(String s[]) 
	{ 
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = reader.nextInt();
		System.out.println(calDiff(n));	 
	}
	}


