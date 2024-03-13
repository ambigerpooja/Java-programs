package ArraysPrograms;

import java.util.Scanner;

public class BinarySearchSortApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a size of arrays");
	//Create an arrays
	int []arr=new int[scan.nextInt(0)];
	//Store the element in the arrays
	System.out.println("Enter the element to be stored in the array");
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
	}
	//Displaying the arrays before sort
	System.out.println("the array element Before sort are: ");
	for(int x:arr)
	{
		System.out.println(x+" ");
	}
	//Asking the key to be searched
	System.out.println("Enter the key element to be searched");
	int key=scan.nextInt();
   //calling the sorting method
	int []sort=BinarySearchSort.sortArrays(arr);
  //calling the Binary search method
	int []binary=BinarySearchSort.binarySearch(arr);
	//Printing the element stored in arrays ofter swapping
	System.out.println("The array element after sorting are: ");
	for(int x:arr)
	{
		System.out.println(x+" ");
	}

	}

}
