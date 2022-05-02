package Assignments;
import java.util.Scanner;

/*

Program: Assignment15.java          Date: 4/28/2022


Author: Money Mann  
School: CHHS
Course: Computer Science 10
 

*/

public class Assignment15
{
	public static void main (String[] args) 
	{
		System.out.println("Money Mann 4/27/2022 \n\n");//print first and last name with date
		
		Scanner userinput = new Scanner(System.in);//create scanner object
		
		System.out.println("Enter a number from 1 to 4: ");//ask user to enter a number from 1 - 4 which will determine the operator
		int operator = userinput.nextInt();//create an operator variable for the number the user inputs
		
		int firstnum = (int) (1 + (Math.random() * 10));//find first random number
		int secondnum = (int) (1 + (Math.random() * 10));//find second random number
		
		switch (operator)// create switch function depending on the operator the user got
		{
		case 1: //use this case if user entered 1
			System.out.println("What is " + firstnum + " * " + secondnum + "?: ");//multiply first random number to second random number
			int answer1 = userinput.nextInt();//assign user answer to variable int answer1
			
			if(answer1 == firstnum * secondnum)//check if the user got the question right by stating if statement
			{
				System.out.println("You got it right! Congratulation!!");//tell user if they are right
			}
			else //else statement
			{
				System.out.println("Try Again!");//print Try Again! if the user gets the question wrong
			}
			break;//break out of case
			
		case 2:
			System.out.println("What is " + firstnum + " + " + secondnum + "?: ");//add up first random number and second random number
			int answer2 = userinput.nextInt();//assign user answer to variable int answer2
			
			if(answer2 == firstnum + secondnum) ////check if the user got the question right by stating if statement
			{
				System.out.println("You got it right! Congratulation!!");//tell user if they are right
			}
			else //else statement
			{
				System.out.println("Try Again!");//print Try Again! if the user gets the question wrong
			}
			break;//break out of case
			
		case 3:
			System.out.println("What is " + firstnum + " - " + secondnum + "?: ");//Subtract second random number from first random number 
			int answer3 = userinput.nextInt();//assign user answer to variable int answer3
			
			if(answer3 == firstnum - secondnum) //check if the user got the question right by stating if statement
			{
				System.out.println("You got it right! Congratulation!!");//tell user if they are right
			}
			else //else statement
			{
				System.out.println("Try Again!");//print Try Again! if the user gets the question wrong
			}
			break;//break out of case
			
		case 4:
			System.out.println("What is " + firstnum + " / " + secondnum + "?: ");//
			int answer4 = userinput.nextInt();//assign user answer to variable int answer4
			
			if(answer4 == firstnum / secondnum)//check if the user got the question right by stating if statement
			{
				System.out.println("You got it right! Congratulation!!");//tell user if they are right
			}
			else //else statement
			{
				System.out.println("Try Again!");//print Try Again! if the user gets the question wrong
			}
			break;//break out of case
			
		}
	}
}
/* Screen Dump

Money Mann 4/27/2022 


Enter a number from 1 to 4: 
2
What is 7 + 7?: 
14
You got it right! Congratulation!!

*/