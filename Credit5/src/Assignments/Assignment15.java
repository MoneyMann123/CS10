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
		
		System.out.println("Enter a number from 1 to 4: ");
		int operator = userinput.nextInt();
		
		int firstnum = (int) (1 + (Math.random() * 10));
		int secondnum = (int) (1 + (Math.random() * 10));
		
		switch (operator) 
		{
		case 1: 
			System.out.println("What is " + firstnum + " * " + secondnum + "?: ");
			int answer1 = userinput.nextInt();
			
			if(answer1 == firstnum * secondnum) 
			{
				System.out.println("You got it right! Congratulation!!");
			}
			break;
			
		case 2:
			System.out.println("What is " + firstnum + " + " + secondnum + "?: ");
			int answer2 = userinput.nextInt();
			
			if(answer2 == firstnum + secondnum) 
			{
				System.out.println("You got it right! Congratulation!!");
			}
			break;
			
		case 3:
			System.out.println("What is " + firstnum + " - " + secondnum + "?: ");
			int answer3 = userinput.nextInt();
			
			if(answer3 == firstnum - secondnum) 
			{
				System.out.println("You got it right! Congratulation!!");
			}
			break;
			
		case 4:
			System.out.println("What is " + firstnum + " / " + secondnum + "?: ");
			int answer4 = userinput.nextInt();
			
			if(answer4 == firstnum / secondnum) 
			{
				System.out.println("You got it right! Congratulation!!");
			}
			break;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}