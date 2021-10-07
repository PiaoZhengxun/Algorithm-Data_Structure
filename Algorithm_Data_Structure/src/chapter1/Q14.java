package chapter1;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("╪Ж ют╥б : ");
		
		int n;
		
		do {
			n = sc.nextInt();
		}while(n <= 0);
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
