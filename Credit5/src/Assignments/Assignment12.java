package Assignments;
import java.util.Scanner;

/*

Program: Assignment12.java          Date: 4/27/2022


Author: Money Mann  
School: CHHS
Course: Computer Science 10
 

*/

public class Assignment12 
{
	public static void main(String[] args) 
	{
		System.out.println("Money Mann 4/27/2022 \n\n");//print first and last name with date
		
		Scanner userinput = new Scanner(System.in);//create scanner object
		
		System.out.println("Please enter a grade percentage: ");//ask user to input grade percentage
		int percentage = userinput.nextInt();//assign user input to variable
		
		if(percentage < 50) 
		{
			System.out.println("F");
		}
		else switch (percentage) 
		{
		case 50:
		case 51:
		case 52:
		case 53:
		case 54:
			System.out.println("The corresponding letter grade is: D");
			break;
		case 55:
		case 56:
		case 57:
		case 58:
		case 59:
			System.out.println("The corresponding letter grade is: D+");
			break;
		case 60:
		case 61:
		case 62:
		case 63:
		case 64:
			System.out.println("The corresponding letter grade is: C");
			break;
		case 65:
		case 66:
		case 67:
		case 68:
		case 69:
			System.out.println("The corresponding letter grade is: C+");
			break;
		case 70:
		case 71:
		case 72:
		case 73:
		case 74:
			System.out.println("The corresponding letter grade is: B");
			break;
		case 75:
		case 76:
		case 77:
		case 78:
		case 79:
			System.out.println("The corresponding letter grade is: B+");
			break;
		case 80:
		case 81:
		case 82:
		case 83:
		case 84:
		case 85:
		case 86:
		case 87:
		case 88:
		case 89:
			System.out.println("The corresponding letter grade is: A");
			break;
		case 90:
		case 91:
		case 92:
		case 93:
		case 94:
		case 95:
		case 96:
		case 97:
		case 98:
		case 99:
		case 100:
			System.out.println("The corresponding letter grade is: A+");
			break;
			
		}		
	}
}
/* Screen Dump

Money Mann 4/27/2022 


Please enter a grade percentage: 
95
The corresponding letter grade is: A+

*/