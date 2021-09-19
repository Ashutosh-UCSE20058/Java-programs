import java.util.Scanner;
class exercise{
	public static void main(String args[])
	{
		int r,sum=0,temp;
    
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = in.nextInt();
    
    temp = n;
		while(n>0)
		{
			r = n%10;
			sum=(sum*10) + r;
			n = n/10;
		}
		if(temp==sum)
			System.out.println("palindrome number");
		else
			System.out.println("not a palindrome number");
	
	}	
}

OUTPUT:-
Enter the number: 43
  not a palindrome number
  
Enter the number : 44
  palindrome number
