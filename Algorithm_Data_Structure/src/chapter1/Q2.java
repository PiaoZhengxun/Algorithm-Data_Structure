package chapter1;

import java.util.Scanner;

public class Q2 {
	
	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		
		return min;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int min = min3(a, b, c);
		
		System.out.println(min);

	}

}
