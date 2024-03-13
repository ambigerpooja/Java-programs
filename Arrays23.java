package ArraysPrograms;

import java.util.Scanner;

public class Arrays23 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of student");
		int n=scan.nextInt();
		//crate an arrays
		int []arr=new int[n];
		//Store the age of arrays
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the age of students");
			arr[i]=scan.nextInt();
		}
		int young=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			
            if(arr[i]<young)
        {
    	   young=arr[i];
       }
	}
		System.out.println("The smallest age of student is: "+young);

}
}
