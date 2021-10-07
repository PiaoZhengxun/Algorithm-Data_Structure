package chapter1;

import java.util.Scanner;

public class Q15 {
	
	static void triangleLB(int n) { //왼쪽 아래 직각
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n ) {
		//왼쪽 위가 직각
		for(int i = 1; i <= n; i++) {
			for(int j = n; j <= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		//오른쪽 위가 직각
	}
	
	static void triangleRB(int n) {
		//오른쪽 아래가 직각
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.print("단 수 입력: ");
			n = sc.nextInt();
		}while(n <= 0);
		
		triangleLB(n);
		triangleLU(n);
	}

}
