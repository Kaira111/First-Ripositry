/**
 * 
 */
package com_Interview_Q;

import java.util.Scanner;

/**
 * @author admin
 * 
 * A palindrome number is a number that remanis same when its digits are reversed.Like 12321
 *
 */
public class com_Palindrome_Number {

	/**
	 * Scanner means User can give any number like 12321
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num=sc.nextInt();
		
		int org_num=num;
		
		int rev=0;
		
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
				
		}
		System.out.println(rev);
		
		if(org_num==rev) {
			System.out.println("The given number is Polyndrome:"+rev);
		}
		else {
			System.out.println("The given number is not Polymdrome:"+rev);
		}
	}

}
