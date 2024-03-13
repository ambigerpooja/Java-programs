import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
        int a=scan.nextInt();
        System.out.println("enter second number");
        int b=scan.nextInt();
        
        int res1=add(a,b);
        System.out.println("addition of a and b is:"+res1);
        
        int res2=sub(a,b);
        System.out.println("subtraction of a and b is:" +res2);
        
        int res3=div(a,b);
        System.out.println("division of a and b is:" +res3);
        
        int res4=rem(a,b);
        System.out.println("remainder of a and b is:" +res4);
        
        int res5=multiply(a,b);
        System.out.println("multiply of a and b is:" +res5);
        
	}
		public static int add(int a,int b)
		{
			int c=a+b;
			return c;
		}
		public static int sub(int a,int b)
		{
			 int c=a-b;
			 return c;
		
		}
		public static int div(int a,int b)
		{
			int c=a/b;
			return c;
		}
		public static int rem(int a,int b)
		{
			int c=a%b;
			return c;
		}
		public static int multiply(int a,int b)
		{
			int c=a*b;
			return c;
		}

}
