package Assignments;
import java.util.Scanner;

/*

Program: Assignment10.java          Date: 4/14/2022


Author: Money Mann  
School: CHHS
Course: Computer Science 10
 

*/

public class Assignment10
{	
	public static void main(String[] args)
	{	
		System.out.println("Money Mann 4/14/2022 \n\n");//print first and last name with date
	
		Scanner userinput = new Scanner(System.in);//create a scanner object
		
		System.out.println("Enter an integer: ");//ask user to enter an integer
		int num = userinput.nextInt();//assign the user input to variable called num
		
		int intnum = (num % 2);//record intnum
		
		if (intnum == 0) {
			System.out.println("The integer " + num + " is even");//print "num is even"
		} else {
			System.out.println("The integer " + num + " is odd");//print "num is odd"
		}
		
		System.out.println("\n" + "Enter an integer: ");//ask user to enter an integer
		int num2 = userinput.nextInt();//assign the user input to variable called num2
		
		int intnum2 = (num2 % 2);//record intnum2
		
		if (intnum2 == 0) {
			System.out.println("The integer " + num2 + " is even");//print "num2 is even"
		} else {
			System.out.println("The integer " + num2 + " is odd");//print "num2 is odd"
		}
		
		
	}

}
/* Screen Dump

Money Mann 4/14/2022 


Enter an integer: 
2
The integer 2 is even

Enter an integer: 
1
The integer 1 is odd

 */