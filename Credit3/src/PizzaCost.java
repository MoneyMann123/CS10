
/*

Program: PizzaCost.java          Date: April 1, 2022


Author: Money Mann
School: CHHS
Course: Computer Science 10
 

*/

import java.util.*;

public class PizzaCost 
{
	public static void main(String[] args)
	{ System.out.println("Money Mann 4/1/2022 \n\n");
	
	Scanner myObj = new Scanner(System.in);
    double userName;
    
    System.out.println("Enter the diameter of the pizza in inches:"); 
    userName = myObj.nextDouble();   
       
    System.out.println("Diameter is: " + userName);
		
		double Laborcost = 0.75;
		int rentCost = 1;
		double materialCost = 0.05 * userName * userName;
		
		double totalCost = materialCost + Laborcost + rentCost;
		
		String mytext = "The total cost of making the pizza is $";
		
		String newstring = mytext + totalCost;
		
		System.out.println(newstring);
		
	}
}
/* Screen Dump

Money Mann 4/1/2022 


Enter the diameter of the pizza in inches:
10
Diameter is: 10.0
The total cost of making the pizza is $6.75



 */	
