package chapter1;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("a�� ��: ");
		a = sc.nextInt();
		
		do {
			System.out.print("b�� ��: ");
			b = sc.nextInt();
		}while(a >= b);
		
		System.out.println("b-a�� " + (b-a));
	}

}
