package chapter1;

import java.util.Scanner;

public class Digits {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		
		System.out.println("2자리 이상 정수 입력");
		
		do {
			System.out.print("입력 :");
			no = sc.nextInt();
		}while(no < 10 || no > 99);
		
		System.out.println("no값은" + no);
	}

}
