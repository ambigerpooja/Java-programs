package ArraysPrograms;

import java.util.Scanner;

public class Arrays11 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number of clases ");
	
			
	//create arrays
	String [][]arr=new String[scan.nextInt()][];
	
	//create jagged arrays
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("enter no of student");
		arr[i]=new String[scan.nextInt()];
	}
	//Stroring the data in array
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("whether class"+(i+1)+"student"+(j+1)+"has complitted the project?");
			boolean status=scan.nextBoolean();
			if(status==true)
			{
				arr[i][j]="YES";
			}
			else
			{
				arr[i][j]="NO";
			}
			
		}
	}
		
		//Displaying the data in the arrays
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				System.out.print(arr[i][j] +" ");
			}
		}
		System.out.println();
	}
	
	}


