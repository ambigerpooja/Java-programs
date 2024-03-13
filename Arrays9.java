package ArraysPrograms;

import java.util.Scanner;

public class Arrays9 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Eneter number of class");
		
		//create an array
		float [][]arr=new float[scan.nextInt()][];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter number of student in class-"+(i+1));
			arr[i]=new float[scan.nextInt()];
		}
		//Storing the data in the array
		System.out.println("enter percentage");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				arr[i][j]=scan.nextFloat();
			}
		}
		
		System.out.println("the percentage is:");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
	}

}
