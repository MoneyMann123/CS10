package Assignments;
import java.util.Scanner;

/*

Program: Assignment6.java          Date: 4/14/2022


Author: Money Mann 
School: CHHS
Course: Computer Science 10
 

*/

import java.util.*;

public class Assignment6 
{
	public static void main(String[] args)
	{ 
		System.out.println("Money Mann 4/6/2022 \n\n");//print first and last name with date
	
		Scanner input = new Scanner(System.in);//create scanner object
    
		String firstName;//create a string as a storage area for the users name
    
		System.out.println("Hello what is your firstname?"); //ask the user for his/her name
		firstName = input.next();  //assign the user input to the string  
       
		System.out.println("Your first name is " + firstName + "\n\n");// inform the user of their name
    
    
		String lastName;//create another string as a storage area for the users last name
    
		System.out.println("What is your lastname?:"); //ask the user for their last name
		lastName = input.next();   //assign the user input for their last name to the string
       
		System.out.println("Your last name is " + lastName + "\n\n");//inform the user of their last name
    
    
		String gradenum;//create another string as a storage area for the users grade
    
		System.out.println("What grade are you in?"); //ask the user what grade they're in
		gradenum = input.next();   //assign the user input for what grade they're in in to the string
    
		System.out.println("Your are in grade " + gradenum + "\n\n");//inform the user of their grade input
    
    
		String schoolName;//create another string as a storage area for the users school name
    
		System.out.println("What school do you attend?:"); //ask the user the school they attend
		schoolName = input.next();   //assign the user input in the string
       
		System.out.println("You attend " + schoolName + "\n\n");//inform the user the school they attend
    
    
		String hobby;//create another string as a storage area for the users hobby
    
		System.out.println("What is your favourite hobby?:"); //ask the user what is their favorite hobby
		hobby = input.next();   //assign the user input into a string
       
		System.out.println("You favourite hobby is " + hobby + "\n\n");//inform the user of their favorite hooby
    
    
		System.out.println("Hello, your name is " + firstName + " " + lastName + ", " + "you are currently in grade " + gradenum + " at " + schoolName + ". " + "Your favourite hobby is " + hobby + ".");// print the users first and last name, what grade they are in, what school they attend, and what their favorite hobby is
		
		
		
		
		
		
	}

}
/* Screen Dump

Money Mann 4/6/2022 


Hello what is your firstname?
Money
Your first name is Money


What is your lastname?:
Mann
Your last name is Mann


What grade are you in?
10
Your are in grade 10


What school do you attend?:
CHHS
You attend CHHS


What is your favourite hobby?:
Basketball
You favourite hobbie is Basketball


Hello, your name is Money Mann, you are currently in grade 10 at CHHS. Your favourite hobby is Basketball


 */