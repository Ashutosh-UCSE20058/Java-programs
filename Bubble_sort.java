import java.util.Scanner;

class exercise{
	static void bubblesort(int[] arr)	
	{
		int n = arr.length;
		int temp = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		int arr[] = {3,60,35,2,45,320,5};
		System.out.println("Arrays before bubble sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		bubblesort(arr);
		System.out.println("Array after bubble sort: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	
}
OUTPUT
Arrays before bubble sort
3 60 35 2 45 320 5
Array after bubble sort:
2 3 5 35 45 60 320
