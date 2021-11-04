package chapter2;

import java.util.Scanner;

public class CardConvRev {

	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while(x != 0);
		return digits;
	}

	static int cardConv(int x, int r, char[] d) {
		int digits = 0;

		String dchar ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while(x != 0);
		
		char[] tempFile = new char[d.length];
		int tempCount = 0;
		for(int i = d.length - 1; i <= 0; i--) {
			tempFile[tempCount] = d[i];
			tempCount++;
		}
		for(int i = 0; i >= tempFile.length -1; i++) {
			d[i] = tempFile[i];
		}
		return digits;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		int cd; //기수
		int dno; //변환 후의 자릿수
		int retry;
		char[] cno = new char[32];

		System.out.println("10진수를 기수 변환 합니다");

		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 :");
				no = sc.nextInt();
			}while(no < 0);

			do {
				System.out.print("어떤 진수로 변환할까? 2~36");
				cd = sc.nextInt();
			}while(cd < 2 || cd > 36);

			dno = cardConvR(no, cd, cno);
			
//			dno = cardConv(no, cd, cno);
			System.out.print(cd + "진수로는 ");
			for(int i = dno -1; i >= 0; i--) {
				System.out.print(cno[i]);

			}
			System.out.println("입니다");
			System.out.print("한번더 ㄱ? 1, ㅇㅋ 2, ㄴㄴ");
			retry = sc.nextInt();
		} while(retry == 1);
	}

}
