package ArraysPrograms;



public class ArraysAdavanced {

	public static void main(String[] args) {
	
	
	//Create an arrays
	 int [] arr= {10,20,30,40,50};
     
	 System.out.println("the elements are:");
	 //Store the data in arrays
	 for(int x:arr)
	 {
		 System.err.println(x+" ");
	 }
	 System.out.println();
	 
	 int mul=1;
	 //Store the in arrays
	 for(int x:arr)
	 {
		 mul=mul*x;
	 }
	 System.out.println("The multiplication is:"+mul);
	}

   
}

