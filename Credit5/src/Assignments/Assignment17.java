package Assignments;
import java.util.Scanner;

/*

Program: Assignment17.java          Date: 5/3/2022


Author: Money Mann  
School: CHHS
Course: Computer Science 10
 

*/

public class Assignment17
{
	public static void main (String[] args) 
	{
		Scanner userinput = new Scanner(System.in);//create scanner object
		
		System.out.println("Enter a GPA or -1 to quit the program: ");//ask user to enter GPA or enter -1 to end application
		double gpa  = userinput.nextDouble();//assign user input to variable gpa
		
		while(gpa != -1) //create while loop for when user does not enter -1
		{
			if(gpa >= 3.8)//if statement for if the users GPA is greater than or equal to 3.8
			{
				System.out.println("summa cum laude\n");//print this if the if statement is true
				
			}
			else if(gpa > 3.65 && gpa < 3.8) //create an else if statement for if the users input is greater than 3.65 and less than 3.8
			{
				System.out.println("magna cum laude\n");//print this if the else if statement is true
			}
			else if(gpa > 3.5 && gpa < 3.65) //create an else if statement for if the users input is greater than 3.5 and less than 3.65
			{
				System.out.println("cum laude\n");//print this if the else if statement is true
			}
			else //create else statement for if the users GPA doesn't meet the requirements
			{
				System.out.println("Sorry, at this you did not qualify for an honors distinction. \n");//tell the user they did not meet the requirements for the honors distinction
			}
			
			System.out.println("Would you like to enter another GPA or you can enter -1 to quit the application: ");//ask user if they would like to enter another GPA
			 gpa = userinput.nextDouble();
		}
		
		System.out.println("Thank you for using our program, have a great day!");//saying thank you to the user for using the application
		
	}
}