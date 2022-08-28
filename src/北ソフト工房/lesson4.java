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
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(3 * i);
//		}
		
		System.out.println("練習問題4-3");
//		int a = 1;
//		for (int b = 1; b <= 8; b++) {
//			a *= 2;
//			System.out.println("2の" + b + "乗" + a);
//		}
//		
//		System.out.println("練習問題4-4");
//		int c = 1;
//		for (int d = 2; d  <= 7; d++) {
//			c *= d; 
//			System.out.println(c);
//		}
		
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
//		int wins = 0;
//		
//		for (int i = 0; i < 10; i++) {
//			int result = s.nextInt();
//			if (result == 1) {
//				wins += 1;
//			}
//		}
//		System.out.println("勝ち" + wins + "回、負け" + ( 10 - wins ) + "回");
//		
		System.out.println("練習問題4-7");
//		int tigers = 0;
//		int giants = 0;
//		
//		for (int game = 1; game <= 9; game++) {
//			System.out.println(game + "回表、阪神の得点は？");
//			tigers += s.nextInt();
//			
//			System.out.println(game + "回裏、巨人の得点は？");
//			giants += s.nextInt();
//		}
//		System.out.println("阪神" + tigers + "点、巨人" + giants + "点");
//		
//		if (tigers > giants) {
//			System.out.println("阪神の勝ち");
//		} else if (tigers < giants) {
//			System.out.println("巨人の勝ち");
//		} else {
//			System.out.println("引き分け");
//		}
//		
//		System.out.println("練習問題4-8");
//		int max_value = 0;
//		for (int i = 0; i < 10; i++) {
//			int value = s.nextInt();
//			if (value > max_value) {
//				max_value = value;
//			}
//		}
//		System.out.println("最大値" + max_value);
		
		System.out.println("練習問題4-9");
		
//		int max_values = 0;
//		int min_values = 0;
//		for (int i = 0; i < 10; i++) {
//			int valu = s.nextInt();
//			if (i == 0) {
//				max_values = valu;
//				min_values = valu;
//			} else {
//				if (valu > max_values) {
//					max_values = valu;
//				} else if (valu < min_values) {
//					min_values = valu;
//				}
//			}
//		}
//		System.out.println("最大値＝" + max_values + "最小値＝" + min_values);
		
		System.out.println("練習問題4-10");
//		int num = s.nextInt();
//		
//		for (int i = 0; i < num; i++) {
//			System.out.println("*");
//		}
		
		System.out.println("練習問題4-11");
//		int count = s.nextInt();
//		for (int i = 0, out = 0; i < count; i++) {
//			System.out.println(out++);
//			
//			if (out > 9) {
//				out = 0;
//			}
//		}
		
//		System.out.println("練習問題4-12");
//		int sum = 0;
//		while (sum <= 100) {
//			sum += s.nextInt();
//		}
//		System.out.println("合計は" + sum);
		
		System.out.println("練習問題4-13");
//		int strike = 0;
//		int ball = 0;
//		
//		while (strike < 3 && ball < 4) {
//			System.out.println("ストライク=1 or ボール=2 ？");
//			int judge = s.nextInt();
//			
//			if (judge == 1) {
//				strike++;
//			} else if (judge == 2) {
//				ball++;
//			}
//		}
//		System.out.println(ball + "ボール、" + strike + "ストライク");
//		
		System.out.println("練習問題4-14");
		
		System.out.println("練習問題4-15");
		System.out.println("練習問題4-16");
		System.out.println("練習問題4-17");
		for (int p = 1; p <= 9; p++) {
			System.out.println(p + "の段");
			for (int q = 1; q <= 9; q++) {
				System.out.printf(" %2d", p * q);
			}
			System.out.println();
		}
		
		System.out.println("練習問題4-18");
		System.out.println("練習問題4-19");
		System.out.println("練習問題4-20");
		int size = s.nextInt();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		
		System.out.println("練習問題4-21");
		System.out.println("練習問題4-22");
		
		
	}
}
