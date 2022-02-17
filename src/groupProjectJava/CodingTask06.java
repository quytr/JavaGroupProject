package groupProjectJava;

import java.util.Scanner;

public class CodingTask06 {

	public static void main(String[] args) {
		/*
		 * Coding Task 06: Ahmed Trabelsi / Clarence Vaughn
		 * 
		 * Write a java program to check whether a given number is prime or not
		 * 
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = s.nextInt();
		if (isPrime(n)) {
		System.out.println(n + " is a prime number");
		} else {
		System.out.println(n + " is not a prime number");
		}
		}

		public static boolean isPrime(int n) {
		if (n <= 1) {
		return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
		if (n % i == 0) {
		return false;
		}
		}
		return true;

	}

}
