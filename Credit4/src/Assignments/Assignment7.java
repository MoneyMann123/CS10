package Assignments;
import java.util.Scanner;

/*

Program: Assignment7.java          Date: 4/11/2022


Author: Money Mann
School: CHHS
Course: Computer Science 10
 

*/
public class Assignment7 
{
	public static void main(String[] args)
	{
		System.out.println("Money Mann 4/11/2022 \n\n");//print first and last name with date
	
		Scanner userinput = new Scanner(System.in);//create a scanner object
	
		System.out.println("Enter the change in cents: ");//ask the user to enter the change in cents
		int change = userinput.nextInt();//assign the user input of change in cents to a variable called change
	
		int quarters = change / 25;//record quarters
		int dimes = (change % 25) / 10;//record dimes
		int nickels = ((change % 25) %10) /5;//record nickels
	
		System.out.println("The change you provided is: " + change + "\n");//inform the user of the change they provided
		System.out.println("Quarters: " + quarters);//input number of quarters
		System.out.println("Dimes: " + dimes);//input number of dimes
		System.out.println("Nickels: " + nickels);//input number of nickels
	
	}

}
/* Screen Dump

Money Mann 4/11/2022 


Enter the change in cents: 
212
The change you provided is: 212

Quarters: 8
Dimes: 1
Nickels: 0



 */