package ArraysPrograms;

public class CheckSort {

	public boolean checkSort(int   []arr)
	{
		for(int i=0;i<=arr.length-2;i++)
		{
		if(arr[i]>arr[i+1])
		{
			return false;
		}
		
	}
		return true;
	} 
	
}
