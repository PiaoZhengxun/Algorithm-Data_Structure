package chapter1;

import java.util.Scanner;

public class Q15 {
	
	static void triangleLB(int n) { //���� �Ʒ� ����
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n ) {
		//���� ���� ����
		for(int i = 1; i <= n; i++) {
			for(int j = n; j <= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		//������ ���� ����
	}
	
	static void triangleRB(int n) {
		//������ �Ʒ��� ����
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.print("�� �� �Է�: ");
			n = sc.nextInt();
		}while(n <= 0);
		
		triangleLB(n);
		triangleLU(n);
	}

}
