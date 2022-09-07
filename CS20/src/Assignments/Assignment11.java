package Assignments;
import java.util.Scanner;

/*

Program: Assignment11.java          Date: 4/14/2022


Author: Money Mann  
School: CHHS
Course: Computer Science 10
 

*/

public class Assignment11
{	
	public static void main(String[] args)
	{	
		System.out.println("Money Mann 4/26/2022 \n\n");//print first and last name with date
	
		Scanner userinput = new Scanner(System.in);//create scanner object
		
		System.out.println("Please enter a three digit number: ");//ask user to input a three digit number
		int num = userinput.nextInt();//assign user input to variable int num
		
		int digit1 = (num / 100);//record digit1
		int digit2 = (num % 100) / 10;//record digit2
		int digit3 = (num % 10);//record digit3
		
		System.out.println("your first digit is: " + digit1);//input and display answer for user
		System.out.println("your second digit is: " + digit2);//input and display answer for user
		System.out.println("your third digit is: " + digit3 + "\n");//input and display answer for user
		
		int max, min = 0;//record max, min
		
		if(digit1 < digit2 && digit2 < digit3) //create if statement
		{
			max = digit3;// assign calculation to variable
			min = digit1;// assign calculation to variable
			
			System.out.println("The largest of the three digits is: " + digit3);//input and display answer for user
			System.out.println("The smallest of the three digits is: " + digit1);//input and display answer for user
		}
		else if(digit1 > digit2 && digit2 > digit3)//create else if statement
		{
			max = digit1;// assign calculation to variable
			min = digit3;// assign calculation to variable
			
			System.out.println("The largest of the three digits is: " + digit1);//input and display answer for user
			System.out.println("The smallest of the three digits is :" + digit3);//input and display answer for user
		} 
		else if(digit2 > digit1 && digit1 > digit3) //create else if statement
		{
			max = digit2;// assign calculation to variable
			min = digit3;// assign calculation to variable
			
			System.out.println("The largest of the three digits is: " + digit2);//input and display answer for user
			System.out.println("The smallest of the three digits is: " + digit3);//input and display answer for user
		} 
		else if(digit3 > digit2 && digit2 > digit1) //create else if statement
		{
			max = digit3;// assign calculation to variable
			min = digit1;// assign calculation to variable
		}
		else if(digit3 > digit1 && digit1 > digit2) //create else if statement
		{
			max = digit3;// assign calculation to variable
			min = digit2;// assign calculation to variable
			
			System.out.println("The largest of the three digits is: " + digit3);//input and display answer for user
			System.out.println("The smallest of the three digits is: " + digit2);//input and display answer for user
		}
		else //create else statement
		{
			System.out.println("WRONG INPUT, CANNOT HAVE SAME DIGITS, TRY AGAIN!");//display error for user
		}
		
		System.out.println("\n");//add space
		
		int sum = digit1 + digit2 + digit3;//create sum variable
		
		System.out.println("The sum of the three digits is: " + sum );//input and display answer for user
		
		int product = digit1 * digit2 * digit3;//create product variable
		
		System.out.println("The product of the three digits is: " + product);//input and display answer for user
		
		int average = (digit1 + digit2 + digit3) / 3;//create average variable
		
		System.out.println("The average of the three digits is: " + average);//input and display answer for user
		
	}
}
/* Screen Dump

Money Mann 4/26/2022 


Please enter a three digit number: 
123
your first digit is: 1
your second digit is: 2
your third digit is: 3

The largest of the three digits is: 3
The smallest of the three digits is: 1


The sum of the three digits is: 6
The product of the three digits is: 6
The average of the three digits is: 2

 */