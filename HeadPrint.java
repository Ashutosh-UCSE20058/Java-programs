import java.util.Arrays;

class HeadPrint{
	public static void main(String[] args){
		String names[] = {"Rohan","Sohan","Sam","Frank","Terry","Max","Sandra",
							"Cecil","John","Tommy"};
							
		System.out.println("Array: " + Arrays.toString(names));
		int i;				
		for(i=0;i<names.length;i++){
			if(i<5){
				System.out.println("First Five Names: " + names[i]);
				continue;
			}
		}
	}
}