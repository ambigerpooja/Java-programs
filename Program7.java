import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		double a=scan.nextDouble();
		System.out.println("enter second number");
		double b=scan.nextDouble();
		double res=division(a,b);
		System.out.println(res);
	}
	 public static double division(double a,double b)
	
	{
		 double c=a/b;
		 return c;
		
	}
}
