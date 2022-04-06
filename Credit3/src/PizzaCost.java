
/*

Program: PizzaCost.java          Date: April 1, 2022


Author: Money Mann
School: CHHS
Course: Computer Science 10
 

*/
public class 
PizzaCost 
{
	public static void main(String[] args)
	{ System.out.println("Money Mann 4/1/2022 \n\n");
		
		double Laborcost = 0.75;
		int rentCost = 1;
		double materialCost = 0.05 * 10 * 10;
		
		double totalCost = materialCost + Laborcost + rentCost;
		
		String mytext = "The total cost of making the pizza is $";
		
		String TotalCost = mytext + totalCost;
		
		System.out.println("Enter the diameter of the pizza in inches: 10 \n");
		
		System.out.println(TotalCost);





	}
}
