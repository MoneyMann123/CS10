package Assignments;
import java.util.Scanner;

public class Assignment11
{	
	public static void main(String[] args)
	{	System.out.println("Money Mann 4/14/2022 \n\n");
	
		Scanner userinput = new Scanner(System.in);
		
		System.out.println(" Please enter a three digit number: ");
		int num = userinput.nextInt();
		
		int digit1 = (num / 100);
		int digit2 = (num % 100) / 10;
		int digit3 = (num % 10);
		
		System.out.println("your first digit is: " + digit1);
		System.out.println("your second digit is: " + digit2);
		System.out.println("your third digit is: " + digit3);
		
		
	}
}