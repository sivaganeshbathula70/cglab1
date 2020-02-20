package com.cag.lab1.basic;
import java.util.*;
public class second {
	 static boolean isPowerOfTwo (int n) 
	    { 
	      /* First x in the below expression is  
	        for the case when x is 0 */
	        return n!=0 && ((n&(n-1)) == 0); 
	          
	    } 
	      
	    // Driver method 
	    public static void main(String[] args)  
	    { 
	         System.out.println(isPowerOfTwo(31) ? "Yes" : "No"); 
	         System.out.println(isPowerOfTwo(64) ? "Yes" : "No"); 
	          
	    } 
	} 


