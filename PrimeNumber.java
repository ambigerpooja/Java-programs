import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		 int res=PrimeApp.prime(n);
		 if(res==-1)
		 {
			 System.out.println("not a prime number");
		 }
		 else
		 {
			 System.out.println("prime number");
		 }
	}

}
