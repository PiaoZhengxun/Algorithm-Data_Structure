package chapter2;

import java.util.Random;

public class Q2 {

	static void swap(int[] a, int idx1, int idx2) {
		
		System.out.println("a["+idx1+"] 과 a["+idx2+"]를 교환합니다");
		int t = a[idx2];
		a[idx2] = a[idx1];
		a[idx1] = t;
	}

	static void reverse(int[] a) {
		for(int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i -1);
		}
	}
	
	public static void main(String[] args) {
		Random rd = new Random();
		int ri = 1+rd.nextInt(10);
		System.out.println("인덱스 개수 : " + ri);
		int[] x = new int[ri];
		
		for(int i = 0; i < ri; i++) {
			x[i] = rd.nextInt();
			System.out.println("x["+i+"] : "+x[i]);
		}
		reverse(x);
		System.out.println("역순 정렬을 마쳤습니다.");
		
		System.out.println("____________________________");
		for(int i = 0; i < x.length; i++) {
			System.out.println("x["+i+"] : "+x[i]);
		}
	}

}
