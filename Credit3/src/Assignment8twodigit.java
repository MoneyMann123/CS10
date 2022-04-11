import java.util.Scanner;

/*

Program: Assignment8twodigit.java          Date: 4/11/2022


Author: Please enter your first and last name here 
School: CHHS
Course: Computer Science 10
 

*/
public class Assignment8twodigit 
{ public static void main(String[] args)
	{System.out.println("Money Mann 4/11/2022 \n\n");
	
	Scanner userinput = new Scanner(System.in);
	
	System.out.println("Enter a two digit number: ");
	int number = userinput.nextInt();
	
	System.out.println("Your two digit number is: " + number + "\n" );
	
	System.out.println("The tens-place digit is: " + number/10 );
	System.out.println("The ones-place digit is: " + number % 10);
	
	
	
	}

}
/* Screen Dump

Money Mann 4/11/2022 


Enter a two digit number: 
54
Your two digit number is: 54

The tens-place digit is: 5
The ones-place digit is: 4
 */