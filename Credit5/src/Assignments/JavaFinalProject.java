package Assignments;
import java.util.Scanner;

/*

Program: JavaFinalProject.java          Date: 5/3/2022


Author: Money Mann  
School: CHHS
Course: Computer Science 10
 

*/

public class JavaFinalProject
{
	public static void main (String[] args) 
	{
		Scanner userinput = new Scanner(System.in);//create scanner object
		
		System.out.println("Would you like to travel to another province? Enter 1 for yes or Enter 2 for no: ");
		int travel = userinput.nextInt();
		userinput.nextLine();
		switch (travel) 
		{
		case 1:
			System.out.println("Enter full name of the province you would you like to visit?: ");
			String travelling = userinput.nextLine();
			
			int BritishColumbia = 255;
			int Yukon = 675;
			int NorthwestTerritory = 497;
			int Saskatchewan = 406;
			int Manitoba = 448;
			int Ontario = 283;
			int Quebec = 425;
			int NewFoundland = 966;
			int NewBrunswick = 1041;
			int NovaScotia = 726;
			int PrinceEdwardIsland = 649;
			int Nunavaut = 370;
			
			if(travelling.equalsIgnoreCase("British Columbia")) 
			{
				System.out.println("The price to travel to British Columbia from Calgary is: $" + BritishColumbia);
			}
			else if(travelling.equalsIgnoreCase("Yukon")) 
			{
				System.out.println("The price to travel to Yukon from Calgary is: $" + Yukon);
			}
			else if(travelling.equalsIgnoreCase("Northwest Territory")) 
			{
				System.out.println("The price to travel to Northwest Territory from Calgary is: $" + NorthwestTerritory);
			}
			else if(travelling.equalsIgnoreCase("Saskatchewan")) 
			{
				System.out.println("The price to travel to Saskatchewan from Calgary is: $" + Saskatchewan);
			}
			else if(travelling.equalsIgnoreCase("Manitoba")) 
			{
				System.out.println("The price to travel to Manitoba from Calgary is: $" + Manitoba);
			}
			else if(travelling.equalsIgnoreCase("Ontario")) 
			{
				System.out.println("The price to travel to Ontario from Calgary is: $" + Ontario);
			}
			else if(travelling.equalsIgnoreCase("Quebec")) 
			{
				System.out.println("The price to travel to Quebec from Calgary is: $" + Quebec);
			}
			else if(travelling.equalsIgnoreCase("NewFoundland")) 
			{
				System.out.println("The price to travel to NewFoundland from Calgary is: $" + NewFoundland);
			}
		
		
		
		
		
		}
	}
}