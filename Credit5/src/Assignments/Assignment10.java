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
	{	System.out.println("Money Mann 4/14/2022 \n\n");https:
	
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int num = userinput.nextInt();
		
		int intnum = (num % 2);
		
		if (intnum == 0) {
			System.out.println("The integer " + num + " is even");
		} else {
			System.out.println("The integer " + num + " is odd");
		}
		
		System.out.println("\n" + "Enter an integer: ");
		int num2 = userinput.nextInt();
		
		int intnum2 = (num2 % 2);
		
		if (intnum2 == 0) {
			System.out.println("The integer " + num2 + " is even");
		} else {
			System.out.println("The integer " + num2 + " is odd");
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