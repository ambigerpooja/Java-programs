import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.err.println("enter first number");
		int num1=scan.nextInt();
		System.out.println("enter second number");
		int num2=scan.nextInt();
		System.out.println("enter first number");
		double num3=scan.nextDouble();
		System.out.println("enter second number");
		double num4=scan.nextDouble();
		 
		int res=add(num1,num2);
		System.out.println("the addition of two number is:"+res);
		
		int res1=multiply(num1,num2);
		System.out.println("the multiplication of two number is:"+res1);
		
        int res2=sub(num1,num2);
        System.out.println(res2);
        
        int res3=rem(num1,num2);
        System.out.println(res3);
        
        double res4=div(num3,num4);
        System.out.println(res4);
         
	}
	public static int add(int num1,int num2)
	{
		return num1+num2;
		
	}
	public static int multiply(int num1,int num2)
	{
		return num1*num2;
	}
	public static int sub(int num1,int num2)
	{
		return num1-num2;
	}
	public static int rem(int num1,int num2)
	{
		return num1%num2;
	}
	public static double div(double num3,double num4)
	{
		return num3/num4;
	}

}
