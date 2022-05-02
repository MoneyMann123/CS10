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
		
		System.out.println("Enter a number between 1 and 20: ");//ask user to input a number 1 through 20
		int userans = userinput.nextInt();//assign the number the user input to a variable called userans
		
		System.out.println("Computer's Number is: " + secretnum + "\n");//print the number the computer picked from 1 - 20
		System.out.println("Player's Number is: " + userans + "\n");//print the number the player picked from 1 - 20
		
		if(userans == secretnum)//if statement for if the player number is equal to the computer number
		{
			System.out.println("You Won!");//print You Won! if the user was right
		}
		else //else statement for if the player did not guess the computer number correctly
		{
			System.out.println("Better luck next time.");//print Better luck next time. if the user was wrong
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