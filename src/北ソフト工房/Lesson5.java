package 北ソフト工房;
import java.util.Scanner;

public class Lesson5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("練習問題1");
		
//		int[] lists = new int[10];
//		
//		for (int i = 0; i < 10; i++) {
//			lists[i] = s.nextInt();
//		}
//		System.out.println();
//		for (int i = 0; i < 10; i++) {
//			System.out.println(lists[i] * 2);
//		}
		
		System.out.println("練習問題2");
//		int[] values = new int[10];
//		
//		for (int a = 0; a < 10; a++) {
//			values[a] = s.nextInt();
//		}
//		System.out.println();
//		for (int a = 9; a >= 0; a--) {
//			System.out.println(values[a]);
//		}
		
		System.out.println("練習問題3");
//		int[] counts = new int[10];
//		
//		for (int b = 0; b < 10; b++) {
//			counts[b] = s.nextInt();
//		}
//		
//		System.out.println("\n偶数");
//		for (int c: counts) {
//			if (c % 2 == 0) {
//				System.out.print(c + " ");
//			}
//		}
//		
//		System.out.println("\n奇数");
//		for (int c: counts) {
//			if (c % 2 != 0) {
//				System.out.print(c + " ");
//			}
//		}
		
		
		System.out.println("練習問題4");
		int[] values = new int[10];
		int cnt, sum;
		
		for (cnt = 0, sum = 0; cnt < 10 && sum <= 100; cnt++) {
			values[cnt] = s.nextInt();
			sum += values[cnt];
		}
		for (int i = 0; i < cnt; i++) {
			System.out.print("\n" + values[i]);
		}
		
	}
}
