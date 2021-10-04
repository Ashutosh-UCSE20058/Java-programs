import java.util.*;

class decimal_to_binary{
  public static void tobinary(int decimal)
	{
		int binary[] = new int[40];
		int index = 0;
		while(decimal>0)
		{
			binary[index++] = decimal%2;
			decimal = decimal/2;
		}
		for(int i = index-1;i>=0;i--)
		{
			System.out.print(binary[i]);
		}
		System.out.println();
	}
	public static void main(String args[]) throws Exception
	{
		System.out.println("Decimal of 10: ");
		tobinary(10);
		System.out.println("Decimal of 21 is: ");
		tobinary(21);
		System.out.println("Decimal of 31 is: " );
		tobinary(31);
		
	}
	
}
OUTPUT
Decimal of 10:
1010
Decimal of 21 is:
10101
Decimal of 31 is:
11111
