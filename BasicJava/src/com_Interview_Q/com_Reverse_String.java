package com_Interview_Q;

import java.util.Scanner;

public class com_Reverse_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		
		String org_str=str;
		
		String  rev="";
		
	
		int len=org_str.length();//7
		//1.Using +String (contication) Operator
		/*for(int i=len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
			
		}
		System.out.println("The Revrse String is"+" "  +rev);*/
		
		/*2.By using StringBuffer
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());*/
		
		//3.Using Charater Array
		char a[]=str.toCharArray();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println(rev);
		
	}

}
