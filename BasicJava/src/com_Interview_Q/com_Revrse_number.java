/**
 * 
 */
package com_Interview_Q;

import java.util.Scanner;

/**
 * @author admin
 *
 */
public class com_Revrse_number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int num=sc.nextInt();//num is taken given through Scanner like 1234;
		
		//1.Using algorithm
		
		/*int rev=0;
		while(num!=0) {
			//% it will give Last digit
			rev=rev*10 +num%10;//0*10+1234%10=0+4=4; 40+3=43; 430+2=432; 4320+1=4321
			num=num/10;//1234/10=123 ; 123/10=12 ;In will eleminate the Last number
		}*/
		
		//2.Using StringBuffer Class
		
		/*StringBuffer rev;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		
		rev=sb.reverse();
		System.out.println("The Revrse Number is"+rev);*/
		
		//3.Using StringBuilder class
		StringBuilder sb1=new StringBuilder();
		
		sb1.append(num);
		StringBuilder rev=sb1.reverse();
		
		
		System.out.println("The Revrse Number is"+rev);
		
		
	}

}
