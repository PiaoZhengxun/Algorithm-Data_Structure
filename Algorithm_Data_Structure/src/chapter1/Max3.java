package chapter1;

import java.util.Scanner;

public class Max3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� ū ���� ���� ����");
		System.out.print("a : ");
		int a = scanner.nextInt();
		System.out.print("b : ");
		int b = scanner.nextInt();
		System.out.print("c : ");
		int c = scanner.nextInt();
		
		
		//���μ����� ���������� ����Ǵ� ���� : concatenation
		int max = a;
		
		if( b > max ) max = b;
		if( c > max ) max = c;
		
		System.out.println("�ִ밪" + max);
	}

}
