package ArraysPrograms;

public class BinarySearchSort {
  
	public static int[] sortArrays(int []arr)
	{
		int temp;
		//Traversing though entire array
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-i-2;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
		public static int [] binarySearch(int []arr1)
		
		{
			int key = 0;
			int low=0,high=arr1.length-1;
			int mid=(low+high)/2;
			//Seraching for key until low>=high
			while(low<=high)
			{
				if(key==arr1[mid])
				{
					System.out.println("key found");
					return arr1;
				}s
				else if(key>arr1[mid])
				{
					low=mid+1;
					high=high;
					mid=(low+high)/2;
				}
			}
			return arr1;
		}
	}

