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
		
		System.out.println("Enetr a number between 1 and 20: \n");
		int userans = userinput.nextInt();
		
		System.out.println("Computer's Number is: \n" + secretnum);
		System.out.println("Player's Number is: \n" + userans);
		
		if(userans == secretnum)
		{
			System.out.println("You Won");
		}
		
		
		
		
		

	}
}
