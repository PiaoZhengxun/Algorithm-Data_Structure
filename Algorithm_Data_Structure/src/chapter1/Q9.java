package chapter1;

import java.util.Scanner;

public class Q9 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = 0;
		
		if(a > b) {
			for(int i = b; i <= a; i++) {
				sum += i;
			}
		} else if(a < b) {
			for(int i = a; i < b; i++) {
				sum += i;
			}
		}else {
			System.out.println(a+b);
		}
		
		System.out.println(sum);
	}

}
