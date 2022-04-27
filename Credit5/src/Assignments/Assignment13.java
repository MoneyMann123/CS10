package Assignments;
import java.util.Scanner;

/*

Program: Assignment13.java          Date: 4/27/2022


Author: Money Mann  
School: CHHS
Course: Computer Science 10
 

*/

public class Assignment13 
{
	public static void main(String[] args) 
	{
		System.out.println("Money Mann 4/27/2022 \n\n");//print first and last name with date
		
		Scanner userinput = new Scanner(System.in);//create scanner object
		
		System.out.println("Enter the number of copies to be printed: ");
		int num = userinput.nextInt();//assign user input to variable num
		
		if(num < 100) 
		{
			System.out.println("Price per copy is: $0.30" + "\n");
			System.out.println("Total cost is: $" + num * 0.30);
		}
		else if(num > 100 && num < 499) 
		{
			System.out.println("Price per copy is: $0.28" + "\n");
			System.out.println("Total cost is: $" + num * 0.28);
		}
		else if(num > 500 && num < 749) 
		{
			System.out.println("Price per copy is: $0.27" + "\n");
			System.out.println("Total cost is: $" + num * 0.27);
		}
		
		
		
		
		
		
		
		
	}
}
