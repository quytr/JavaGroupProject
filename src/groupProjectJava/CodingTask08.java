package groupProjectJava;

public class CodingTask08 {

	public static void main(String[] args) {
		/*
		 * Coding Task 08: Elena Volcov / Svetlana / Khadija Ghayur
		 * 
		 * Maximum and minimum number in the array
		 */
		
		int num [] = { 5, 17, 9, 2, 35, 4} ;

		int min = num[0];
		int max = num[0];

		for (int i=0; i<num.length; i++) {

		if (num[i]<min) {
		min=num[i];
		}
		if (num[i]>max) {
		max=num[i];

		}}
		System.out.println("The maximum number in the array is "+max);
		System.out.println("The minimun number in the array is "+min);

	}

}
