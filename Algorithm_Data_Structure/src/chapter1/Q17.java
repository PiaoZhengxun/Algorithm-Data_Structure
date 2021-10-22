package chapter1;

import java.util.Scanner;

public class Q17 {
	
	static void npira(int n ) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i+1; j++) {
				System.out.print(" ");
			}
			for(int q = 1; q <= (i-1)*2+1; q++) {
				System.out.print(i%10);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("단수입력");
			n = sc.nextInt();
		}while(n <= 0);
		
		npira(n);

	}

}
