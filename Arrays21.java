package ArraysPrograms;

import java.util.Scanner;

public class Arrays21 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Create a two arrays
		System.out.println("enter first array size");
		int[]arr1=new int[scan.nextInt()];
		System.out.println("enter second array size");
		int[]arr2=new int[arr1.length];
		//Store the elements of first arrays
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.println("enter the element to be store");
			arr1[i]=scan.nextInt();
		}
		//Store the element of second arrays
		for(int i=0;i<=arr2.length-1;i++)
		{
			System.out.println("enter the element to be stored");
			arr2[i]=scan.nextInt();
		}
		//Create a 3rd arrays
		int[]arr3=new int[arr1.length];
		for(int i=0;i<=arr3.length-1;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
		}
		//Displaying the data
		for(int x:arr3)
		{
			System.out.println("addition of two arrys"+x);
		}
		

	}

}
