package LearningJava;

import java.util.Scanner;

public class ForLoopStatement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // System.in is a standard input stream
		System.out.print("Enter Total number- ");
		int n = sc.nextInt();
		System.out.println("System Displays the list of even numbers....");

		for (int i = 1; i < n; i++) {
			// System.out.println("Hi");
			if (i % 2 == 0) {
				System.out.println(i); // plus to concentate
			}
		}
		System.out.print("Enter Total number- ");
		Scanner sc1 = new Scanner(System.in);
		int m = sc.nextInt();
		int j=1;
		System.out.println("System Displays the list of odd numbers....");
		while (j <= m) {
			if (j % 2 != 0) {
				System.out.println(j);
				j=j+2;
			}

		}
	}
}
