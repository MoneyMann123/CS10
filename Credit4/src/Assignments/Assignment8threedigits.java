package Assignments;
import java.util.Scanner;

/*

Program: Assignment8threedigits.java          Date: 4/11/2022


Author: Money Mann
School: CHHS
Course: Computer Science 10
 

*/
public class Assignment8threedigits 
{ public static void main(String[] args)
	{System.out.println("Money Mann 4/11/2022 \n\n");
	
	Scanner userinput = new Scanner(System.in);
	
	System.out.println("Enter a three digit number: ");
	int number = userinput.nextInt();
	
	System.out.println("Your three digit number is: " + number + "\n" );
	
	System.out.println("The three-place digit is: " + number/100);
	System.out.println("The tens-place digit is: " + (number / 10)% 10);
	System.out.println("The ones-place digit is: " + number % 10);
	
	
	
	}

}
/* Screen Dump

Money Mann 4/11/2022 


Enter a three digit number: 
385
Your three digit number is: 385

The three-place digit is: 3
The tens-place digit is: 8
The ones-place digit is: 5

 */