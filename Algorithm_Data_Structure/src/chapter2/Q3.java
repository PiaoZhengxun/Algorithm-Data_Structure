package chapter2;

import java.util.Random;

public class Q3 {
	
	static int sumOf(int[] a) {
		int sum =0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
		return sum;
	}
	
	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] x = new int[1+rd.nextInt(10)];
		
		for(int i = 0; i < x.length; i++) {
			x[i] = rd.nextInt();
		}
		sumOf(x);
	}

}
