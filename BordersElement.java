package learn.com.arrays;

import java.util.Scanner;

public class BordersElement {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number of rows");
	int n=scan.nextInt();
	System.out.println("Enter the number of columns");
	int m=scan.nextInt();
	//Create an arrays
	int [][]arr=new int[n][m];
	//Store the elements in arrays
	
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			arr[i][j]=scan.nextInt();
		}
	}
	//Display the elements of arrays
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			if(i==0||i==arr.length-1||j==0||j==arr[i].length-1)
			{
			System.out.println(arr[i][j]+ " ");
			}
			else
			{
				System.out.print("   ");
			}
		}
	}
	System.out.println();
	
	}

}
