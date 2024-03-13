package ArraysPrograms;

import java.util.Scanner;

public class Arrays16 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");

	//create an arrays
	int [] arr=new int[scan.nextInt()];
	
	//Storing the data in arrays
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("enter a number to be multiply");
		arr[i]=scan.nextInt();
	}
	
    //displaying data from arrays
	int mul=1;
	for(int i=0;i<=arr.length-1;i++)
	{
		mul=mul*arr[i];
		
	}
	System.out.println("the multiple of value is:"+mul);
	
	}

}
