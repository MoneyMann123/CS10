package Assignments;
import java.util.Scanner;

/*

Program: Assignment9.java          Date: 4/11/2022


Author: Money Mann  
School: CHHS
Course: Computer Science 10
 

*/
public class Assignment9 
{ 
	public static void main(String[] args)
	{
		System.out.println("Money Mann 4/11/2022 \n\n");//print first and last name with date
	
		Scanner userinput = new Scanner(System.in);//create a scanner object
	
		System.out.println("Enter an integer: ");//ask user to input an integer
		int number = userinput.nextInt();//assign the user input to variable called number
	
		System.out.println("Enter a second integer: ");//ask the user to input another integer
		int othernumber = userinput.nextInt();//assign the user input to variable called othernumber
	
		int firstanswer = number / othernumber; // record firstanswer
		int secondanswer = number % othernumber;//record secondanswer
	
		int thirdanswer = othernumber / number;//record thirdanswer
		int fourthanswer = othernumber % number;//record fourthanswer
	
		System.out.println("\n" + number + " / " + othernumber + " = " + firstanswer);//print answer to user
		System.out.println("\n" + number + " % " + othernumber + " = " + secondanswer);//print answer to user
	
		System.out.println("\n" + othernumber + " / " + number + " = " + thirdanswer);//print answer to user
		System.out.println("\n" + othernumber + " % " + number + " = " + fourthanswer);//print answer to user
	
	
	}

}
/* Screen Dump

Money Mann 4/11/2022 


Enter an integer: 
14
Enter a second integer: 
4

14 / 4 = 3

14 % 4 = 2

4 / 14 = 0

4 % 14 = 4

 */