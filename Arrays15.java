package ArraysPrograms;

import java.util.Scanner;

public class Arrays15 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of teams");
		int team=scan.nextInt();
		System.out.println("enter number of employess");
		int employees=scan.nextInt();
		
		//create a arrays
		String [][][]arr=new String[3][][];
		
		//create 3D jagged arrays
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=new String[team][];
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				arr[i][j]=new String[employees];
			}
		}
		
		//Storing data in arrays
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
		//Displying data from arrays
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
