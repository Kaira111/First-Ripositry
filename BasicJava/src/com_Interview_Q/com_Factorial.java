package com_Interview_Q;

public class com_Factorial {

	public static void main(String[] args) {
		int num=7;
		long fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			System.out.println("thae factorial num is "+fact);
		}
		System.out.println("------------------------------");
		System.out.println("thae factorial num is "+fact);
       System.out.println("------------------------------");
       
       int n=9;
       long Fact=1;
       for(int j=n;j>=1;j--) {
    	   Fact=Fact*j;
    	   System.out.println("the factorial num is"+Fact);
       }
       System.out.println("------------------------------");
       
       System.out.println("the factorial num is"+Fact);
	}

}
