package groupProjectJava;

public class CodingTask07 {

	public static void main(String[] args) {
		/*
		 * Coding Task 07: Quy Truong
		 * 
		 * Write a Java Program to print the first 10 numbers of Fibonacci series
		 */
		
		int firstNum = 0;
		int secondNum = 1;
		int thirdNum;
		int i = 0;



		for(int x = 0; x < 10; x ++) {
		System.out.print(firstNum + " ");

		thirdNum = firstNum + secondNum;
		firstNum = secondNum;
		secondNum = thirdNum;

		}

	}

}
