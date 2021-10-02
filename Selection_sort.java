import java.util.Scanner;

class Selection_sort{
	public static void selectionsort(int[] arr)	
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[index])
				{
					index = j;
				}
			}
			int smaller = arr[index];
			arr[index] = arr[i];
			arr[i] = smaller;
		}
	}
	
	public static void main(String args[])
	{
		int[] arr1 = {9,14,3,2,4,3,11,58,22};
		System.out.println("Before selection sort");
		for(int i:arr1)
		{
			System.out.print(i+ " ");
		}
		selectionsort(arr1);
		System.out.println("\n");
		System.out.println("After selction sort");
		for(int i:arr1)
		{
			System.out.print(i+ " ");
		}
			
	}
	
}

//OUTPUT
Before selection sort
9 14 3 2 4 3 11 58 22

After selction sort
2 3 3 4 9 11 14 22 58
