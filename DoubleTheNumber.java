import java.util.Scanner;

public class DoubleTheNumber {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int a=scan.nextInt();
	int res=doublethenumber(a);
	System.out.println("the doubled number is:"+res);
	}
  public static int doublethenumber(int a)
  {
	return a*2;  
  }
}
