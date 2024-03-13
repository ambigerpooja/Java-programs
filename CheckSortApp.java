package ArraysPrograms;

import java.util.Scanner;

public class CheckSortApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the size of arrays");
	//Create an arrays
	int [] arr=new int[scan.nextInt()];
	//Store the element in arrays
	System.out.println("Enter the element"+arr.length+" to be stored in arrays");
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
	}
	//Call the CheckSort method
	CheckSort cs=new CheckSort();
	//invoking checkSort() and Storing its result in status
	boolean status=cs.checkSort(arr);
	//if status is true means array is sorted
	if(status==true)
	{
		System.out.println("Array is sorted");
	}
	else
	{
		System.out.println("Array is not sorted");
	}
	
	
	
	}

}
