package Collection.learn.java;

import java.util.*;

public class Collection1 {

	public static void main(String[] args)
	{
	    LinkedList ll=new LinkedList();
		try {
			
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a intger data");
		ll.add(scan.nextInt());
		 Thread.sleep(3000);
		System.out.println("Enter second integer data");
	    ll.add(scan.nextInt());
	    Thread.sleep(3000);
	    System.out.println("Enter String type value");
	     ll.add(scan.next());
	     Thread.sleep(3000);
	    System.out.println("Enter a float type data");
	     ll.add(scan.nextFloat());
	     Thread.sleep(3000);
	    System.out.println("Enter boolean type data");
	    ll.add(scan.nextBoolean());
	    Thread.sleep(3000);
	    System.out.println("Enter char type data");
	    ll.add(scan.next().charAt(0));
	    Thread.sleep(3000);
	    System.out.println(ll);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("it is working as required");
		}
	

}
}
