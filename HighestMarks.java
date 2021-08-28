import java.util.Arrays;

class HighestMarks{
	public static void main(String[] args){
		int array[] = {56,67,89,90,94,86};
		String subject[] = {"English","Mathematics","CS","Hindi","Social Science","Physics"};
		
		
		int highest_marks = array[0];
		
		for(int i:array){
			if(i>highest_marks){
				highest_marks = i;
			}
		}
		
		System.out.println("Array: " + Arrays.toString(array));
		System.out.println("Subject: " + Arrays.toString(subject));
		System.out.println("Highest marks: " + highest_marks);
		
		//from the program highest marks is 94
		//from the array the 94 is at index position 4
		//accessing the subject the respective of index 4 from the subject array
		System.out.println("Respective subject of highest marks: " + subject[4]);
	}
}
