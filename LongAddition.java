import java.util.Scanner;

public class LongAddition {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your first number");
		long num1=scan.nextLong();
		System.out.println("enter your second number");
		long num2=scan.nextLong();

		long res=LongAddition(num1,num2);
		System.out.println(res);
	}
	public static long LongAddition(long num1,long num2)
	{
		long num3=num1+num2;
		return num3;
	}

}
