package ArraysPrograms;

import java.util.Scanner;

public class Arrays22 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//create an arrays
		float [] arr=new float[7];
		//Store the data in the arrays
		System.out.println("enter the temp of 7 days");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		float sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		float avg=sum/7;
		System.out.println(avg);
	}

}
