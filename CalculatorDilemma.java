import java.util.Scanner;

public class CalculatorDilemma {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter first number");
	int a=scan.nextInt();
	System.out.println("enter seconf number");
	int b=scan.nextInt();
	System.out.println("enter the operation to be porformed");
	char c=scan.next().charAt(0);
	switch(c)
	{
	case '+':System.out.println("the addition result is:"+(a+b));
	break;
	
	case '-':System.out.println("the subtraction result is:"+(a-b));
	break;
	
	case '*':System.out.println("the multiplication result is:"+(a*b));
	break;
	
	case '/':System.out.println("the division result is:"+(a/b));
	break;
	
	default:System.out.println("invalide choice");
	}
	}
	

}
