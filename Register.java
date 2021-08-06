import java.util.Arrays;

class Register{
	public static void main(String[] args){
		String students[] = {"Rohan","Sohan","Sam","Frank","Terry","Max","Sandra",
							"Cecil","John","Tommy","Thomas","Rain","Misery",
							"Oswald","Thorin"};
		System.out.println("Arrays: " + Arrays.toString(students));
		int i;
		for(i=0;i<students.length;i++){
			if(students[i]=="Tommy")
				System.out.println("Left the school");
			else if(students[i]=="Misery")
				System.out.println("Left the school");
			else
				System.out.println(students[i]);
		}
	}
}