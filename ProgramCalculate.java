
		import java.util.Scanner;

		public class ProgramCalculate {

			public static void main(String[] args) {
				
			 Scanner scan=new Scanner(System.in);
			 System.out.println("enter the side of square");
			 int side=scan.nextInt();
			 System.out.println("enter the length of rectangle");
			 int length=scan.nextInt();
			 System.out.println("enter the breadth of rectangle");
			 int breadth=scan.nextInt();
			 System.out.println("enter the radius of circle");
			 float radius =scan.nextFloat();
			 
			 
			 System.out.println("the side of the squre is:"+CalculateArea(side));
			 
			 System.out.println("the area of rectangle is:"+CalculateArea(length,breadth));
			 
			 System.out.println("the area of circle is:"+CalculateArea(radius));
			
			}
			public static int CalculateArea(int side)
			{
				return side*side;
			}
		    public static int CalculateArea(int length,int breadth )
		    {
		    	return length*breadth;
		    }
		    public static float CalculateArea(float radius)
		    {
		    	return 3.14F*radius*radius;
		    	
		    }
		

	

}
