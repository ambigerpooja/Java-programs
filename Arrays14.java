package ArraysPrograms;

import java.util.Scanner;

public class Arrays14 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	// Taking user input
	System.out.println("Enter the number of teams");
	int team=scan.nextInt();
	System.out.println("Enetr the number of employees");
	int employees=scan.nextInt();
	
	//Create an array
	String [][][]arr=new String[3][team][employees];
	
	//Storing the data in arrays
	scan.nextLine();
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				System.out.println("Enter the name of employees"+(i+1));
				arr[i][j][k]=scan.nextLine();
			}
		}
	}
	
	//Displaying data from arrays
	for(int i=0;i<=arr.length-1;i++) //number of branches
	{
		for(int j=0;j<=arr[i].length-1;j++)// number of teams
		{
			for(int k=0;k<=arr[i][j].length-1;k++)//number of employees
			{
				System.out.println(" The name of employees"+(i+1)+" team "+(j+1)+" branch "+(k+1)+" is "+arr[i][j][k]);
				
				
			}
		}
	}       
	}

}
