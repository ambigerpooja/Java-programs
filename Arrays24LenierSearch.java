package ArraysPrograms;

import java.util.Scanner;

public class Arrays24LenierSearch {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the size of arrays");
	//create an arrays 
	boolean []arr=new boolean[scan.nextInt()];
	System.out.println("enter the element to be stored");
	
	//Store the element in the arrays
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextBoolean();
	}
	//taking the key element to be searched by user
	System.out.println("enter a key element to be searched");
	boolean key=scan.nextBoolean();
	//searching the key element in the arrays in the linear search approach
	for(int i=0;i<=arr.length-1;i++)
	{
		//checking if key is present in the array
		if(key==arr[i])
		{
			System.out.println("key found at index "+i);
			//System.exit(0);
			return;
			
		}
		
	}
	
	System.out.println("key not found");
	}

}
