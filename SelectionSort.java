package ArraysPrograms;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the size of arrays");
	 //Create an array
	 int [] arr=new int[scan.nextInt()];
	 //Store the element in arrays
	 System.out.println("Enter the element to be stored");
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 arr[i]=scan.nextInt();
		 
	 }
	 //Displaying the element before sort
	 System.out.println("elements before sorting are: ");
	 for(int x:arr)
	 {
		 System.out.print(x+" ");
	 }
	 //Perform sorting using Selection sort algorithm
	 for(int i=0;i<=arr.length-2;i++)
	 {
		 int pos=i;
			int min=arr[pos];
		 for(int j=i+1;j<=arr.length-1;j++)
		 {
			
			if(arr[j]<min)
			{
				min=arr[j];
				pos=j;
			}
		 }
		 int temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
	 }
	 //Printing element after swapping
	 System.out.println("Ofter swapping the elements are: ");
	 for(int x:arr)
	 {
		 System.out.print(x+" ");
	 }
	 
	}

}
