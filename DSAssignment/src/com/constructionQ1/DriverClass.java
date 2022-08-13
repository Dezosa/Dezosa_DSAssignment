package com.constructionQ1;
import java.util.Scanner;

import com.skyScraperQ1.*;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the total no of floors in the building:");
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	     {
	      System.out.println("Enter the floor size given on day:" + (i+1));
 	      a[i]=sc.nextInt();  
	      }
	     
	     sc.close(); 
	     OrderOfConstruction order=new OrderOfConstruction();
	     order.floor(a,n);
	}	               
}
	  