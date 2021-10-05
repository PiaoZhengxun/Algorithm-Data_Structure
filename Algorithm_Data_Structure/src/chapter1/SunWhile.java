package chapter1;

import java.util.Scanner;

public class SunWhile {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			System.out.println(i);
			sum += i;
			i++;
			System.out.println(i);
		}
		
		System.out.println("¼ö" + n + "//// " + sum);
	}
}
