package Assignments;
import java.util.Scanner;

/*

Program: Assignment14.java          Date: 4/28/2022


Author: Money Mann  
School: CHHS
Course: Computer Science 10
 

*/

public class Assignment14 
{
	public static void main (String[] args) 
	{
		System.out.println("Money Mann 4/27/2022 \n\n");//print first and last name with date
		
		Scanner userinput = new Scanner(System.in);//create scanner object
		
		System.out.println("Enter your age: ");//ask user to input their age
		int age = userinput.nextInt();//assign user age to int age
		
		System.out.println("Your age is: " + age + "\n");
		
		if(age > 18) 
		{
			System.out.println("You are a Adult");
		}
		else if(age > 12 && age < 18) 
		{
			System.out.println("You are a Teen");
		}
		else if(age <= 12 && age > 10) 
		{
			System.out.println("You are a Preteen");
		}
		else if(age <= 10 && age > 5) 
		{
			System.out.println("You are a Child");
		}
		else if(age <= 5 && age > 0) 
		{
			System.out.println("You are a Toddler");
		}
	}
}

/* Screen Dump

Money Mann 4/27/2022 


Enter your age: 
16
Your age is: 16

You are a Teen

*/