package ArraysPrograms;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of the arrays");
	//Create an arrays
	int []arr=new int[scan.nextInt()];
	//Store the element 
	
	System.out.println("Enter the element to be serched");
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
	}
	//Perform the action by using switch
	System.out.println("Enter the operation to be performed"+"1.Check wheather array is sorted ro not"+"2.perform linear search");
	}

}
