package ArraysPrograms;

import java.util.Scanner;

public class Arrays20 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the n size of array");
		int n=scan.nextInt();
		//create an arrays
		int []arr=new int[n];
		//Store the element in arrays
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter a element to be store");
			arr[i]=scan.nextInt();
		}
		//Displaying original arrays
		for(int x:arr)
		{
			
			System.out.println("The original arrys is:"+arr);
		}
			
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%3==0)
			{
				arr[i]=-1;
			}
			
		}
		//displaying  replace value
		for(int x:arr)
		{
			
			System.out.println("The modified arrys is:"+arr);
		}
		

}
}
