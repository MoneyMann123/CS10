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
		
		System.out.println("Would you like to travel to another province or territory? Enter 1 for yes or Enter 2 for no: ");
		int travel = userinput.nextInt();
		userinput.nextLine();
		switch (travel) 
		{
		case 1:
			System.out.println("Enter full name of the province or territory you would you like to visit?: ");
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
				System.out.println("The price to travel to British Columbia from Calgary is $\n" + BritishColumbia);
			}
			else if(travelling.equalsIgnoreCase("Yukon")) 
			{
				System.out.println("The price to travel to Yukon from Calgary is $\n" + Yukon);
			}
			else if(travelling.equalsIgnoreCase("Northwest Territory")) 
			{
				System.out.println("The price to travel to Northwest Territory from Calgary is $\n" + NorthwestTerritory);
			}
			else if(travelling.equalsIgnoreCase("Saskatchewan")) 
			{
				System.out.println("The price to travel to Saskatchewan from Calgary is $\n" + Saskatchewan);
			}
			else if(travelling.equalsIgnoreCase("Manitoba")) 
			{
				System.out.println("The price to travel to Manitoba from Calgary is $\n" + Manitoba);
			}
			else if(travelling.equalsIgnoreCase("Ontario")) 
			{
				System.out.println("The price to travel to Ontario from Calgary is $\n" + Ontario);
			}
			else if(travelling.equalsIgnoreCase("Quebec")) 
			{
				System.out.println("The price to travel to Quebec from Calgary is $\n" + Quebec);
			}
			else if(travelling.equalsIgnoreCase("Newfoundland and Labrador")) 
			{
				System.out.println("The price to travel to NewFoundland and Labrador from Calgary is $\n" + NewFoundland);
			}
			else if(travelling.equalsIgnoreCase("NewBrunswick")) 
			{
				System.out.println("The price to travel to NewBrunswick from Calgary is $\n" + NewBrunswick);
			}
			else if(travelling.equalsIgnoreCase("NovaScotia")) 
			{
				System.out.println("The price to travel to NovaScotia from Calgary is $\n" + NovaScotia);
			}
			else if(travelling.equalsIgnoreCase("PrinceEdwardIsland")) 
			{
				System.out.println("The price to travel to PrinceEdwardIsland(PEI) from Calgary is $\n" + PrinceEdwardIsland);
			}
			else if(travelling.equalsIgnoreCase("Nunavaut")) 
			{
				System.out.println("The price to travel to Nunavaut from Calgary is $\n" + Nunavaut);
			}
			else 
			{
				System.out.println("Please try again, and make sure the spelling is correct.\n");
			}
		case 2:
			System.out.println("Sorry, this application is not meant for international travel.");
		
		
	
		}
	}
}