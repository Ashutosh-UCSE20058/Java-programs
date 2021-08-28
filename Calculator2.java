import java.util.Scanner;

class Calculator2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = 25;
		int b = 5;
		
		while(true){
			System.out.println("Input the operator:");
			char operator;
			if(operator!="n"){
				operator =(char)System.in.read();
				break;
			}
		}
		if(operator=="+")
			System.out.println(" a + b : " + (a+b));
		if(operator=="-")
			System.out.println("a-b : " + (a-b));
		if(operator=="*")
			System.out.println("a*b: " + (a*b));
		if(operator=="/")
			System.out.println("a/b:" + (a/b));
		if(operator=="%")
			System.out.println("a%b:" + (a%b));
	}
}