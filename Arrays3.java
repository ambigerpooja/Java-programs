package ArraysPrograms;

public class Arrays3 {

	public static void main(String[] args) {
		// create an array
				float [] arr=new float[10];
				
				// Storing a data in array
				arr[0]=81.25f;
				arr[1]=85.71f;
				arr[2]=89.65f;
				arr[3]=82.98f;
				arr[4]=80.98f;
				arr[5]=99.78f;
				arr[6]=95.56f;
				arr[7]=77.25f;
				arr[8]=88.69f;
				arr[9]=65.25f;
				
				// Displaying the data present in the array
				int i=0;
				while(i<=9)
				{
					System.out.println(arr[i]);
					i++;
				}
	}

}
