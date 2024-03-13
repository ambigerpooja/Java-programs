package ArraysPrograms;

import java.util.Scanner;

public class Arrays6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number of fruits");
		int noFruits=scan.nextInt();
		String [] arr=new String[noFruits];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter a fruit name"+(i+1));
			arr[i]=scan.next();
			
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("the fruits names are:"+(i+1)+"is"+arr[i]);
		}

	}

}
