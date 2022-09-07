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
		
		System.out.println("Enter the number of copies to be printed: ");//ask user to input number of copies
		int num = userinput.nextInt();//assign user input to variable int num
		
		if(num < 100) //if statement for if the user input is less than 100
		{
			System.out.println("Price per copy is: $0.30" + "\n");//print price of each copy
			System.out.println("Total cost is: $" + num * 0.30);//print total price for all copies
		}
		else if(num > 100 && num < 499) //else if statement for if the user input is less than 499 and greater than 100
		{
			System.out.println("Price per copy is: $0.28" + "\n");//print price for each copy 
			System.out.println("Total cost is: $" + num * 0.28);//print total price for all copies
		}
		else if(num > 500 && num < 749) //else if statement for if the user input is greater than 500 and less than 749
		{
			System.out.println("Price per copy is: $0.27" + "\n");//print price for each copy
			System.out.println("Total cost is: $" + num * 0.27);//print total price for all copies
		}
		else if (num > 750 && num < 1000)//else if statement for if the user input is greater than 750 and less than 1000
		{
			System.out.println("Price per copy is: $0.26" + "\n");//print price for each copy
			System.out.println("Total cost is: $" + num * 0.26);//print total price for all copies
		}
		else if(num > 1000)//else if statement for if the user input is greater than 1000
		{
			System.out.println("Price per copy is: $0.25" + "\n");//print price for each copy
			System.out.println("Total price is: $" + num * 0.25);//print total cost for all copies
			
		}
	}
}

/* Screen Dump

Money Mann 4/27/2022 


Enter the number of copies to be printed: 
1234
Price per copy is: $0.25

Total price is: $308.5

*/