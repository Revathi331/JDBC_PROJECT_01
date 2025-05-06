package com.Test;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Square of a number "+a+" = "+(a*a));
	}
}
