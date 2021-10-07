package chapter1;

import java.util.Scanner;

public class Q11 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Á¤ ¼ö ÀÔ·Â ÇÏ ¼À : ");
		int n;
		
		do {
			n = sc.nextInt();
		}while(n <= 0);
		
		int no = 0;
		while(n > 0) {
			n /= 10;
			no++;
		}
		
		System.out.println("ÀÚ¸´¼ö " + no);
		
	}

}
