package chapter1;

import java.util.Scanner;

public class Q8 {
	
	// ���콺�� ���� (�̰Թ��ĸ� 10������� 1 + 10 �ϰ� 5�� ���ϴ� �� õ���� ���
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int times = n/2;
		
		int ans = (1 + n) * times + (n % 2 == 1 ? (n +1)/2 : 0);
		
		System.out.println(ans);
	}

}
