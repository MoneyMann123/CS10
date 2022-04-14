package Assignments;
import java.util.Scanner;

/*

Program: Assignment10.java          Date: 4/14/2022


Author: Please enter your first and last name here 
School: CHHS
Course: Computer Science 10
 

*/

public class Assignment10
{	
	public static void main(String[] args)
	{	System.out.println("Money Mann 4/14/2022 \n\n");
	
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int num = userinput.nextInt();
		
		int intnum = (num / 2);
		
		if (intnum == 0) {
			System.out.println("The integer " + num + " is even");
			
		}
		
	}

}