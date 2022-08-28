package 北ソフト工房;
import java.util.Scanner;

public class lesson4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("練習問題4-1");
		String word = "SPAM";
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "." + word);
		}
//		int a = 1;
//		while (a <= 10) {
//			System.out.println("SPAM");
//			a++;
//		}
		
		System.out.println("練習問題4-2");
		for (int i = 1; i <= 9; i++) {
			System.out.println(3 * i);
		}
		
		System.out.println("練習問題4-3");
		int a = 1;
		for (int b = 1; b <= 8; b++) {
			a *= 2;
			System.out.println("2の" + b + "乗" + a);
		}
		
		System.out.println("練習問題4-4");
		int c = 1;
		for (int d = 2; d  <= 7; d++) {
			c *= d; 
			System.out.println(c);
		}
		
		System.out.println("練習問題4-5");
//		int numbers = s.nextInt();
//		int sum = 0;
//		
//		for (int i = 0; i < 10; i++ ) {
//			int num = s.nextInt();
//			sum += num;
//		}
//		System.out.println(sum / 10);
//		
//		System.out.println("練習問題4-6");
		int wins = 0;
		
		for (int i = 0; i < 10; i++) {
			int result = s.nextInt();
			if (result == 1) {
				wins += 1;
			}
		}
		System.out.println("勝ち" + wins + "回、負け" + ( 10 - wins ) + "回");
		
		System.out.println("練習問題4-7");
		
		
		
		System.out.println("練習問題4-8");
		System.out.println("練習問題4-9");
		System.out.println("練習問題4-10");
		System.out.println("練習問題4-11");
		System.out.println("練習問題4-12");
		System.out.println("練習問題4-13");
		System.out.println("練習問題4-14");
		System.out.println("練習問題4-15");
		System.out.println("練習問題4-16");
		System.out.println("練習問題4-17");
		System.out.println("練習問題4-18");
		System.out.println("練習問題4-19");
		System.out.println("練習問題4-20");
		System.out.println("練習問題4-21");
		System.out.println("練習問題4-22");
		
		
	}
}
