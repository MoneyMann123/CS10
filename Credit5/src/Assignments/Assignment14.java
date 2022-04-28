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
		
		System.out.println("Your age is: " + age + "\n");//ask user to input their age
		
		if(age > 18) //if statement for if the user age is above 18
		{
			System.out.println("You are a Adult");//output of if statement, tell the user they're an adult
		}
		else if(age > 12 && age < 18) //else if statement for if the user age is above 12 and less than 18
		{
			System.out.println("You are a Teen");//output of else if statement, tell the user they're a teen
		}
		else if(age <= 12 && age > 10)// else if statement for if the user is less than or equal to 12 and is above 10
		{
			System.out.println("You are a Preteen");//output of else if statement, tell the user they're a preteen
		}
		else if(age <= 10 && age > 5) // else if statement for if the user is less than or equal to 10 and above 5
		{
			System.out.println("You are a Child");//output of else if statement, tell the user they're a child
		}
		else if(age <= 5 && age > 0) // else if statement for if the user is less than or equal to 5 and is above 0
		{
			System.out.println("You are a Toddler");//output of else if statement, tell the user they're a toddler 
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