package ArraysPrograms;

import java.util.Scanner;

public class Arrays8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no of companies");
		int companies=scan.nextInt();
		System.out.println("enter the no of employees");
		int employees=scan.nextInt();
		//Create an arrays
		String [] [] arr=new String [companies][employees];
		
		//Stroing tha data from array
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the name of company"+(i+1)+"employees"+(j+1));
				arr[i][j]=scan.next();
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("the name of company"+(i+1)+"employees"+(j+1)+"is"+arr[i][j]);
			}
		}

	}

}
