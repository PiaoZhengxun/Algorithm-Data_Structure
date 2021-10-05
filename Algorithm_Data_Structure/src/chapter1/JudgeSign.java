package chapter1;

import java.util.Scanner;

public class JudgeSign { //조건 판단 분기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력");
		int n = sc.nextInt();
		
		if(n > 0) {
			System.out.println("+");
		}else if(n < 0) {
			System.out.println("-");
		}else {
			System.out.println("0");
		}
	}

}
