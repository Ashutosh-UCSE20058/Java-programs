class DataTypeConvert{
	public static void main(String[] args){
		int i = 500;
		float f  = 3.8f;
		double d = 0.1234;
		byte b = 42;
		char c = 'a';
		short s = 1024;
		long l = 123_456_789L;
		boolean bool = true;
		
		short by = b;
		System.out.println("Automatic type casting is possible from byte to short: " + by);
		
		int integer = s;
		System.out.println("Automatic type casting is possible from short to int: " + integer);
		
		long LONG = i;
		System.out.println("Automatic type casting is possible from int to long: " + LONG);

		double Double = l;
		System.out.println("Automatic type casting is possible from long to double: " + Double);
	
		double Doub = f;
		System.out.println("Automatic type casting is possible from byte to short: " + Doub);
		
		int Long = i;
		System.out.println("Automatic type casting is possible from short: " + Long);
		
		/*short Short = i;
		System.out.println(Short);
		System.out.println("casting is possible from int to short: ");
		
		char Char = b;
		System.out.println(Char);
		System.out.println("casting is possible from byte to char: ");
		
		char CHAR = bool;
		System.out.println(CHAR);
		System.out.println("casting is possible from char to boolean: ");
		*/
	}
}