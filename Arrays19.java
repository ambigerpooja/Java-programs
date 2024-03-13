package ArraysPrograms;

import java.util.Scanner;

public class Arrays19 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	//create an arrays
	System.out.println("enter the length of first array");
	int []arr1=new int[scan.nextInt()];
	System.out.println("enter the length of second array");
	int [] arr2=new int[scan.nextInt()];
	
	//Store the data in arrays
	System.out.println("enter element to be stored in first array");
	for(int i=0;i<=arr1.length-1;i++)
	{
		
		arr1[i]=scan.nextInt();		
	}
	//Storing second arrays
	System.out.println("enter element to be stored in second  array");
	for(int i=0;i<=arr2.length-1;i++)
	{	  
		arr2[i]=scan.nextInt();
	}
	
	int []arr3=new int[(arr1.length+arr2.length)];
	for(int i=0;i<=arr1.length-1;i++)
	{
		arr3[i]=arr1[i];
	}
	//Copying 2nd array element to the 3rd arrays
	int j=0;
	for(int i=arr1.length;i<=arr3.length-1;i++)
	{
		arr3[i]=arr2[j];
		j++;
	}
	
	//Displaying using advanced for each loop
	System.out.println("First array elements are: ");
	for(int x:arr1)
	{
		System.out.println(x+" ");
	}
	System.out.println("second array elements are: ");
	for(int x:arr2)
	{
		System.out.println(x+" ");
	}
	System.out.println("Marged  array elements are: ");
	for(int x:arr3)
	{
		System.out.println(x+" ");
	}
	
	

	}

}
