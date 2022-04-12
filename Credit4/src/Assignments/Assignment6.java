package Assignments;
import java.util.Scanner;

/*
Program: Assignment6.java          Date: April 6, 2022


Author: Money Mann
School: CHHS
Course: Computer Science 10
 */

import java.util.*;

public class Assignment6 
{
	public static void main(String[] args)
	{ System.out.println("Money Mann 4/6/2022 \n\n");
	
	Scanner input = new Scanner(System.in);
    
	String firstName;
    
    System.out.println("Hello what is your firstname?"); 
    firstName = input.next();   
       
    System.out.println("Your first name is " + firstName + "\n\n");
    
    
    String lastName;
    
    System.out.println("What is your lastname?:"); 
    lastName = input.next();   
       
    System.out.println("Your last name is " + lastName + "\n\n");
    
    
    String gradenum;
    
    System.out.println("What grade are you in?"); 
    gradenum = input.next();   
       
    System.out.println("Your are in grade " + gradenum + "\n\n");
    
    
    String schoolName;
    
    System.out.println("What school do you attend?:"); 
    schoolName = input.next();   
       
    System.out.println("You attend " + schoolName + "\n\n");
    
    
    String hobby;
    
    System.out.println("What is your favourite hobby?:"); 
    hobby = input.next();   
       
    System.out.println("You favourite hobby is " + hobby + "\n\n");
    
    
    System.out.println("Hello, your name is " + firstName + " " + lastName + ", " + "you are currently in grade " + gradenum + " at " + schoolName + ". " + "Your favourite hobby is " + hobby + ".");
		
		
		
		
		
		
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