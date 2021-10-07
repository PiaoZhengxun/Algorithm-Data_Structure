package chapter1;

import java.util.Scanner;

public class TriangleLB {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("왼쪽아래 직각인 삼각형 출력 ㄱ");
		
		do {
			System.out.print("몇 단 삼각형? 이등변 삼각형의 단 수를 입력 : ");
			n = sc.nextInt();
		}while(n <= 0);
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
