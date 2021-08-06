class FindElement{
	public static void main(String[] args){
		int[] Seq = {1,62,81,38,66,60,90,50,62,27};
		int i;
		for(i=0;i<10;i++){
			System.out.println("The element at index " + i + " is " + Seq[i]);
		}
		
		int searchItem = 90;
		int j;
		for(j=1;j<10;j++){
			if(Seq[j]==90)
				System.out.println("Index is: " + j);
		}
	}
}