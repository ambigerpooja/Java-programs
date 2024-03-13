import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=scan.nextInt();
		System.out.println("enter the second number");
		int b=scan.nextInt();
	     int  res=add(a,b);
	     System.out.println(res);
	}
	public static int add(int a,int b)
	{
	int c=a+b;
	return c;
		
	}
}
	
	


