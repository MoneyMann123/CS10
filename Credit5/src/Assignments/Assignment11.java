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
	{	System.out.println("Money Mann 4/14/2022 \n\n");
	
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Please enter a three digit number: ");
		int num = userinput.nextInt();
		
		int digit1 = (num / 100);
		int digit2 = (num % 100) / 10;
		int digit3 = (num % 10);
		
		System.out.println("your first digit is: " + digit1);
		System.out.println("your second digit is: " + digit2);
		System.out.println("your third digit is: " + digit3 + "\n");
		
		int max, min = 0;
		
		if(digit1 < digit2 && digit2 < digit3) 
		{
			max = digit3;
			min = digit1;
			
			System.out.println("The largest of the three digits is: " + digit3);
			System.out.println("The smalles of the three sigits is: " + digit1);
		}
		else if(digit1 > digit2 && digit2 > digit3) 
		{
			max = digit1;
			min = digit3;
			
			System.out.println("The largest of the three digits is: " + digit1);
			System.out.println("The smallest of the three digits is :" + digit3);
			else if()
		}
		
		
	}
}