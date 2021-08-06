class MaxOne{
	public static int findrow(int arr[][])
	{
		int row=-1;
		int i=0;
		int j = arr[0].length-1;
		while(i<=arr.length-1 && j>=0)
		{
			if(arr[i][j]==1)
			{
				j--;
				row=i;
			}
			else{
				i++;
			}
		}
		return row+1;
	}
	
	public static void main(String[] args){
		int[][] arr = {{0,1,1,1},{0,0,1,1},{1,1,1,1},{0,0,0,0}};
		int rowindex = findrow(arr);
		if(rowindex!=0)
			System.out.println("The maximum numbers of 1s: " + rowindex);
	
	}
}