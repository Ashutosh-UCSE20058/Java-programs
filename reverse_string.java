
import java.util.*;
import java.lang.*;

class reverse_string{
		
	public static void main(String args[])
	{
		String string = "Dream big";
		String reversedstr = "";
		for(int i=string.length()-1;i>=0;i--)
		{
			reversedstr = reversedstr + string.charAt(i);
		}
		System.out.println("Original string: " + string);
		System.out.println("Reverse of given string: " + reversedstr);
	}
	
}

OUTPUT
Original string: Dream big
Reverse of given string: gib maerD
