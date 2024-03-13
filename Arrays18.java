package ArraysPrograms;

import java.util.Scanner;

public class Arrays18 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter lenght and elements");
		
		//create an array
		int [] arr=new int [scan.nextInt()];
		
		//Store the data in arrays
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter a number"+(i+1));
			arr[i]=scan.nextInt();
		}
		
		//Displyaying data from arrys
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i%2==0)
			{
				System.out.println("the even numbers are: "+i);
			}
			
		}
	}

}
