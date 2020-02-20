package com.cag.lab1.basic;
import java.util.*;
public class Increasing {
	public static boolean checkNow(int n)
	{
		int r= String.valueOf(n).length();
		for(int i=1;i<r;i++)
		{
			int x=n%10;
			n=n/10;
			int x1=n%10;
			if(x1>x)
			{
				//System.out.println("no");
				return false;
			}
			
		}
	      //System.out.println("yes");
	      return true;
	}
public static void main(String...rk)
{
	
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	System.out.println(checkNow(n));
	sc.close();
}


}
