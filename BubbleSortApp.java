package ArraysPrograms;

import java.util.Scanner;

public class BubbleSortApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a size of arrays");
	//Create an arrays
	int []arr=new int[scan.nextInt()];
	
	//Store the element in the arrays before swapping
	System.out.println("enter the element to be stored in arrays");
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
		
	}
	//Displaying the arrays before swapping
	System.out.println("The array element before sorting are:");
	for(int x:arr)
	{
		System.out.println(x+" ");
	}
    System.out.println();
	
	
    //Calling bubble sort method for sorting an arrays
    int []sortedArray=BubbleSort.bubbleSort(arr);
    //Printing the element stored in array after swapping
    System.out.println("The array element after sorting are: ");
    for(int x:sortedArray)
    {
    	System.out.println(x+" ");
    }

	}
}

