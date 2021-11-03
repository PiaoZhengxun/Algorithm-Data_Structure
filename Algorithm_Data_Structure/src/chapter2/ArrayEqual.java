package chapter2;

import java.util.Random;
import java.util.Scanner;

public class ArrayEqual {
	
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
	
	static void copy(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
	}
	
	static void reverse(int[] a, int[] b) {
		for(int i = 0; i < a.length / 2; i++) {
			swap(a, b, i, a.length-i-1);
		}
	}
	
	static void swap(int[] a, int[] b, int idx1, int idx2) {
		a[idx1] = b[idx2];
		a[idx2] = b[idx1];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int index = 1+rd.nextInt(10);
		
		int[] a = new int[index];
		int[] b = new int[index];
		
		for(int i = 0; i < a.length; i++) {
			a[i] =  rd.nextInt();
		}
		copy(a, b);
		System.out.println(equals(a, b) ? "ㅇㅇ 같음" : "ㄴㄴ 다름");
		reverse(a, b);
		System.out.println(equals(a, b) ? "ㅇㅇ 같음" : "ㄴㄴ 다름");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print("_______________________");
			System.out.println(b[i]);
		}
		
	}

}
