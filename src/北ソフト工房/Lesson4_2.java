package 北ソフト工房;
import java.util.Scanner;

public class Lesson4_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("練習問題4-1");
		for (int i = 0; i < 10; i++) {
			System.out.println("SPAM");
		}
		
		System.out.println("練習問題4-2");
		for (int a = 1; a < 10; a++) {
			System.out.print(3 * a);
			if (a == 9) {
				break;
			} else {
				System.out.print(".");
			}
			
		}
		System.out.println("");
		
		System.out.println("練習問題4-3");
		
		
		System.out.println("練習問題4-4");
		System.out.println("練習問題4-5");
		
//		int sum = 0;
//		for (int c = 0; c < 10; c++) {
//			int num = s.nextInt();
//			sum += num;
//		}
//		System.out.println(sum / 10);
		
		System.out.println("練習問題4-6");
//		int win = 0;
//		int lose = 0;
//		
//		System.out.println("勝ちは'1'、負けは'0'を入力");
//		for (int d = 0; d < 10; d++) {
//			int math = s.nextInt();
//			if (math == 1) {
//				win += 1;
//			} else {
//				lose += 1;
//			}
//		}
//		System.out.println("勝ち=" + win + "負け=" + lose);
		
		
		System.out.println("練習問題4-7");
		System.out.println("練習問題4-8");
//		int max_value = 0;
//		
//		for (int i = 0; i < 10; i++) {
//			int num = s.nextInt();
//			if (i == 0) {
//				max_value = num;
//			} else if (num > max_value) {
//				max_value = num;
//			}
//		}
//		System.out.println(max_value);
		
		System.out.println("練習問題4-9");
//		int max_value = 0;
//		int min_value = 0;
//		
//		for (int i = 0; i < 10; i++) {
//			int num = s.nextInt();
//			if (i == 0) {
//				max_value = num;
//				min_value = num;
//			} else if (num > max_value) {
//				max_value = num;
//			} else if (num < min_value) {
//				min_value = num;
//			}
//		}
//		System.out.println(max_value);
//		System.out.println(min_value);
		
		
		System.out.println("練習問題4-10");
//		int x = s.nextInt();
//		for (int i =0; i < x; i++) {
//			System.out.print("*");
//		}
//		
//		System.out.println("");
		
		System.out.println("練習問題4-11");
		System.out.println("練習問題4-12");
//		int value = 0;
//		for (int i = 0; value <= 100; i++) {
//			int num = s.nextInt();
//			value += num;
//		}
//		System.out.println(value);
		
		System.out.println("練習問題4-13");
//		int strike = 0;
//		int ball = 0;
//		
//		while (strike < 3 && ball < 4) {
//			System.out.println("ストライク＝１、ボール＝２");
//			int num = s.nextInt();
//			if (num == 1) {
//				strike ++;
//			} else if (num == 2) {
//				ball ++;
//			}	
//		}
		
		System.out.println("練習問題4-14");
		System.out.println("練習問題4-15");
		System.out.println("練習問題4-16");
		System.out.println("練習問題4-17");
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf(" %2d", i * j);
//			}
//			System.out.println("");
//		}
		
		System.out.println("練習問題4-18");
//		int sum = 0;
//		for ( ; ; ) {
//			int value = s.nextInt();
//			if (value == 0) {
//				break;
//			}
//			sum += value;
//		}
//		System.out.println(sum);
		
		System.out.println("練習問題4-19");
		System.out.println("練習問題4-20");
//		int size = s.nextInt();
//		
//		for (int i = 0; i < size; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("#");
//			}
//			System.out.println("");
//		}
//		
//		for (int i = 0; i < size; i++) {
//			for (int j = size; j > i; j--) {
//				System.out.print("#");
//			}
//			System.out.println("");
//		}
		
		System.out.println("練習問題4-21");
		System.out.println("練習問題4-22");
		int x = 0;
		int y = 1;
		int z = x + y;
		
		while (x <= 1000) {
			System.out.print(x + ",");
			x = y;
			y = z;
			z = x + y;
		}
		
	}

}
