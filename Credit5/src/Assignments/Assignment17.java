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
		
		System.out.println("Enter a GPA or -1 to quit the program: ");
		double gpa  = userinput.nextDouble();
		
		while(gpa != -1) 
		{
			if(gpa >= 3.8)
			{
				System.out.println("summa cum laude");
				System.out.println("Would you like to enter another GPA or quit: ");
				double gpa1 = userinput.nextDouble();
			}
			
			
		}
	}
}