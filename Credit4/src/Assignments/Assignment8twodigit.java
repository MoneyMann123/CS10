package Assignments;
import java.util.Scanner;

/*

Program: Assignment8twodigit.java          Date: 4/11/2022


Author: Money Mann  
School: CHHS
Course: Computer Science 10
 

*/
public class Assignment8twodigit 
{ public static void main(String[] args)
	{System.out.println("Money Mann 4/11/2022 \n\n");//print first and last name with date
	
	Scanner userinput = new Scanner(System.in);//create a scanner object
	
	System.out.println("Enter a two digit number: ");//ask user to input a 2 digit number
	int number = userinput.nextInt();//assign the user input to variable called number
	
	System.out.println("Your two digit number is: " + number + "\n" );//inform the user of their 2 digit number
	
	System.out.println("The tens-place digit is: " + number/10 );//calculate and print the tens place digit in the 2 digit number
	System.out.println("The ones-place digit is: " + number % 10);//calculate and print the ones place digit in the 2 digit number
	
	
	
	}

}
/* Screen Dump

Money Mnn 4/11/2022 


Enter a two digit number: 
54
Your two digit number is: 54

The tens-place digit is: 5
The ones-place digit is: 4
 */