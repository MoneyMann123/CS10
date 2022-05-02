package Assignments;
import java.util.Scanner;

/*

Program: Assignment16.java          Date: 5/2/2022


Author: Money Mann  
School: CHHS
Course: Computer Science 10
 

*/

public class Assignment16
{
	public static void main (String[] args) 
	{
		System.out.println("Money Mann 4/27/2022 \n\n");//print first and last name with date
		
		Scanner userinput = new Scanner(System.in);//create scanner object
		
		int secretnum = (int) (1 + (Math.random() * 20));//find secret random number between 1 - 20
		
		System.out.println("Enter a number between 1 and 20: ");
		int userans = userinput.nextInt();
		
		System.out.println("Computer's Number is: " + secretnum + "\n");
		System.out.println("Player's Number is: " + userans + "\n");
		
		if(userans == secretnum)
		{
			System.out.println("You Won!");
		}
		else 
		{
			System.out.println("Better luck next time.");
		}
	}
}
/*
Money Mann 4/27/2022 


Enter a number between 1 and 20: 
6
Computer's Number is: 7

Player's Number is: 6

Better luck next time.
*/