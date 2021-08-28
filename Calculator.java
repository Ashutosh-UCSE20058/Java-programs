import java.util.Scanner;
import java.util.*;
class Calculator{
	public static void main(String[] args){
		
		int a = 25;
		int b = 5;
		
		Scanner in = new Scanner(System.in);
		
		while(true){
			System.out.println("Input the operator:");
			Char ch;
			if(ch=='n'){
				
				break;
			}
			else{
				ch = (char)System.in.read();
			}
		
		switch(ch){
			case 1:
				System.out.println("a" + " + " + "b" + "=" + (a+b));
				break;
			case 2:
				System.out.println("a" + " - " + "b" + "=" + (a-b));
				break;
			case 3:
				System.out.println("a" + " * " + "b" + "=" + (a*b));
				break;
			case 4:
				System.out.println("a" + " / " + "b" + "=" + (a/b));
				break;
			case 5:
				System.out.println("a" + " % " + "b" + "=" + (a%b));
				break;
			}	
		}
	}
}