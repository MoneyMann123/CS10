
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
	{ 
		System.out.println("Money Mann 4/1/2022 \n\n");//print first and last name with date
	
		Scanner input = new Scanner(System.in);// create a scanner object
		double userName;
    
		System.out.println("Enter the diameter of the pizza in inches:"); //user inputs diameter of the pizza in inches
		userName = input.nextDouble(); //the number the user enters is stored in a string  
       
		System.out.println("Diameter is: " + userName);//print and inform the user of the diameter they entered
		
		double Laborcost = 0.75;//labor cost
		int rentCost = 1;//rental cost
		double materialCost = 0.05 * userName * userName;//the total material cost
		
		double totalCost = materialCost + Laborcost + rentCost;//sum of all the services to determine the total price of the pizza
		
		String mytext = "The total cost of making the pizza is $";
		
		String newstring = mytext + totalCost;
		
		System.out.println(newstring);// let the user know how much their pizza costs
		
	}
}
/* Screen Dump

Money Mann 4/1/2022 


Enter the diameter of the pizza in inches:
10
Diameter is: 10.0
The total cost of making the pizza is $6.75



 */	
