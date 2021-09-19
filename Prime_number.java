import java.util.Scanner;

class exercise{
	public static void main(String args[])
	{
		int i,m=0,flag=0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=in.nextInt();
		m = n/2;
		if(n==0 || n==1)
		{
			System.out.println(n + " is not prime number" );
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(n + " is a prime number");
			}
		}
	
	}	
}

OUTPUT:-
Enter the number: 43
43 is a prime number
