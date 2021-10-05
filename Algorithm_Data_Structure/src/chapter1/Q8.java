package chapter1;

import java.util.Scanner;

public class Q8 {
	
	// 가우스의 덧셈 (이게뭐냐면 10같은경우 1 + 10 하고 5개 곱하는 그 천재어린이 방법
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int times = n/2;
		
		int ans = (1 + n) * times + (n % 2 == 1 ? (n +1)/2 : 0);
		
		System.out.println(ans);
	}

}
