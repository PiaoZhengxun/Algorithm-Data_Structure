package chapter1;

import java.util.Scanner;

public class Max3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가장 큰 정수 값을 구함");
		System.out.print("a : ");
		int a = scanner.nextInt();
		System.out.print("b : ");
		int b = scanner.nextInt();
		System.out.print("c : ");
		int c = scanner.nextInt();
		
		
		//프로세스가 순차적으로 진행되는 구조 : concatenation
		int max = a;
		
		if( b > max ) max = b;
		if( c > max ) max = c;
		
		System.out.println("최대값" + max);
	}

}
