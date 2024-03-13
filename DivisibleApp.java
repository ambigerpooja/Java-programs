
public class DivisibleApp {
	public static void divisible(int n)
	{
		System.out.println("the number divisible by 2");
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	

	for(int i=1; i<=n; i++)
		if(i%3==0)
		{
			System.out.println(i);
		}
	for(int i=1;i<=n; i++)
		if(i%5==0)
		{
			System.out.println(i);
		}
	for(int i=1;i<=n;i++)
		if(i%2==0&&i%5==0)
		{
			System.out.println(i);
		}
	for(int i=1;i<=n;i++)
		if(i%2==0&&i%3==0)
		{
			System.out.println(i);
		}
	for(int i=1;i<=n;i++)
		if(i%1==0&&i%5==0)
		{
			System.out.println(i);
		}
	for(int i=2;i<n;i++)
		if(n%i==0)
		{
			System.out.println(i);
		}
	
	}
}
