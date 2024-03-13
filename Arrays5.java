package ArraysPrograms;

import java.util.Scanner;

public class Arrays5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
	//create a array
		float []arr=new float[10];
		for(int i=0;i<=9;i++)
		{
			System.out.println("enter percentage of the student"+(i+1));
			arr[i]=scan.nextFloat();
		}
		for(int i=0;i<=9;i++)
		{
			System.out.println("the percentage of student"+(i+1)+"is"+arr[i]);
		}
	}

}
