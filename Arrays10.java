package ArraysPrograms;

import java.util.Scanner;

public class Arrays10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number of companies and employees");

		//create a array
		String [][]arr=new String[scan.nextInt()][];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the employees in each companies"+(i+1));
			arr[i]=new String[scan.nextInt()];
		}
		
		System.out.println("enter the names");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				arr[i][j]=scan.next();
			}
		}
		System.out.println("The names of employees are:");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();

	}

}
