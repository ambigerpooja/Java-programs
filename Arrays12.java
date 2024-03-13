package ArraysPrograms;

import java.util.Scanner;

public class Arrays12 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//create the 3D arrays
		int [][][]arr=new int[2][3][5];
		
		//Store the data in 3D arrays
		for(int i=0;i<=arr.length-1;i++) // college
		{
			for(int j=0;j<=arr[i].length-1;j++) // class
			{
				for(int k=0;k<=arr[i][j].length-1;k++) // Students
				{
					System.out.println("enter the ages of the college: " +(i+1)+" class "+(j+1)  +" student "  +(k+1));
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		
		//Display the data in the array
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("the age of coolege"+(i+1)+"class"+(i+j)+"student"+(k+1)+arr[i][j][k]);
				}
		

	}
		}
	}
}


