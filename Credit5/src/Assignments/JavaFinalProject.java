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
		
		System.out.println("Enter 1 if you would like to travel to a province or enter 2 if you would like to travel to a territory (this application is only applicable if you live in Calgary): ");
		int travelling = userinput.nextInt();
		
		switch (travelling) 
		{
		case 1:
			System.out.println("Enter full name of the province you would you like to visit?: ");
			int province = userinput.nextInt();
			
			
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
			
			if(province == British Columbia) 
			{
				System.out.println("The fligth cost to travel to British Columbia is $255.");
			}
			
			
			
			
			
			
		}
		
	}
}