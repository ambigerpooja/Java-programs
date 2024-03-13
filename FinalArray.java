package ArraysPrograms;

import java.util.Scanner;

public class FinalArray {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the size of array");
	//Create an arrays
	int [] arr=new int[scan.nextInt()];
	//Store the elements in the arrays
	System.out.println("enter the element to be stored in the arrays");
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
	}
	//Printing the arrays before sorting 
	for(int x:arr)
	{
		System.out.println(x+" ");
	}
	
	}

}
