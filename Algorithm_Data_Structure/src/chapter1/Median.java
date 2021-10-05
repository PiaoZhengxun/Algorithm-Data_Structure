package chapter1;

import java.util.Scanner;

public class Median {
	
	static int med3(int a, int b, int c) { // 4 , 5 , 2
		if(a >= b) { // 4 >= 5
			if(a > b) { 
				return b;  
			} else if(a <= c) { // c >= a >= b 
				return a; 
			} else { 
				return c; // a > c 
			}
			//a < b
		} else if(a > c) { // 4> 2
			return a;
			// c, a < b
		} else if(b > c) {
			return c;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int med = med3(a, b, c);
		System.out.println(med);

	}

}
