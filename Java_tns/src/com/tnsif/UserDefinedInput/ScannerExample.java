package com.tnsif.UserDefinedInput;

import java.util.Scanner;

public class ScannerExample {
  
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name:");
		String n= input.nextLine();
		System.out.println("Hello"+n);
}
}