package ArraysPrograms;

import java.util.Scanner;

public class Arrays7 {

	public static void main(String[] args) {
		
		//Taking user input for number of players
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of players");
		int noPlayers=scan.nextInt();
		
		//Create a array
		float [] arr=new float[(int) noPlayers];
		
		//Storing the content in array
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the height of the players:"+(i+1));
			arr[i]=scan.nextFloat();
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("The players height"+(i+1)+" is:"+arr[i]);
		}
		

	}

}
