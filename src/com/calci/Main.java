package com.calci;

import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
		Calculater calci=new CalciImplemetation();
		System.out.println("welcome to simple calculater");
		System.out.println("1.Addition\n2.subtraction\n3.multiplication\n4.division");
		System.out.print("choice any number for above operations:");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.print("Enter first number:");
			int a=sc.nextInt();
			System.out.print("Enter second number:");
			int b=sc.nextInt();
			System.out.println("Addition:"+calci.addition(a,b));
		}break;
		case 2:{
		
		}break;
		case 3:{
			System.out.print("Enter first number:");
			int a=sc.nextInt();
			System.out.print("Enter second number:");
			int b=sc.nextInt();
			System.out.println("multiplaction:"+calci.multiplication(a,b));

		}
		case 4:{
			System.out.print("Enter first number:");
			int a=sc.nextInt();
			System.out.print("Enter second number:");
			int b=sc.nextInt();
			System.out.println("Division:"+calci.division(a, b));
		}break;
		default:{
			System.out.println("Enter valid choice");
		}
		}
		
		
	}
}
