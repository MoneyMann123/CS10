package Assignments;
import java.util.Scanner;

/*

Program: Assignment9.java          Date: 4/11/2022


Author: Money Mann  
School: CHHS
Course: Computer Science 10
 

*/
public class Assignment9 
{ public static void main(String[] args)
	{System.out.println("Money Mann 4/11/2022 \n\n");
	
	Scanner userinput = new Scanner(System.in);
	
	System.out.println("Enter an integer: ");
	int number = userinput.nextInt();
	
	System.out.println("Enter a second integer: ");
	int othernumber = userinput.nextInt();
	
	int firstanswer = number / othernumber;
	int secondanswer = number % othernumber;
	
	int thirdanswer = othernumber / number;
	int fourthanswer = othernumber % number;
	
	System.out.println("\n" + number + " / " + othernumber + " = " + firstanswer);
	System.out.println("\n" + number + " % " + othernumber + " = " + secondanswer);
	
	System.out.println("\n" + othernumber + " / " + number + " = " + thirdanswer);
	System.out.println("\n" + othernumber + " % " + number + " = " + fourthanswer);
	
	
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