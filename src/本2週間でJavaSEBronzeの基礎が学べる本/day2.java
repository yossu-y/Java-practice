package 本2週間でJavaSEBronzeの基礎が学べる本;
import java.util.Scanner;

public class day2 {
	public static void main(String[] args) throws Exception {
		System.out.println("数字を入力してください");
		Scanner s = new Scanner(System.in);
//		int a = s.nextInt();
//		int x = s.nextInt();
		
		
		
//		if (true) {
//			System.out.println("Hello.");
//		}
//		if (false) {
//			System.out.println("World");
//		}
		
//		if (10 < a) {
//			System.out.println("大きい");
//		}
		
//		if (10 < a) {
//			System.out.println("大きい");
//		} else if (a < 0) {
//			System.out.println("エラー");
//		} else {
//			System.out.println("小さい");
//		}
		
//		if (0 <= a && a <= 100) {
//			System.out.println("範囲内です");
//		} else {
//			System.out.println("範囲外です");
//		}
		
//		int b = 1;
//		int c = 4;
//	
//		if (b == 1 || c++ < 5) {
//			
//		}
//		System.out.println(c);
//		
//		if (a < 0 || a >= 100) {
//			System.out.println("不正な値です。");
//			System.out.println("0〜100の数を入力してください");
//		} else if (80 <= a) {
//			System.out.println("A判定");
//		} else if (60 <= a) {
//			System.out.println("B判定");
//		} else if (40 <= a) {
//			System.out.println("C判定");
//		} else {
//			System.out.println("E判定");
//		}
//		
//		switch(x) {
//		case 1:
//			System.out.println("one");
//			break;
//		case 2:
//			System.out.println("two");
//			break;
//		default:
//			System.out.println("other");
//			break;
//		}
		
		int result = s.nextInt();
		
		if (result < 0 || result > 100) {
			System.out.println("不正な数値です");
		} else if (result < 50) {
			System.out.println("努力が必要です");
		} else if (result < 70) {
			System.out.println("普通です");
		} else {
			System.out.println("優秀です");
		}
		
		int val = 10;
		
		if (0 < val) {
			if (val < 100) {
				System.out.println("A");
			}
			System.out.println("B");
		} else if (10 <= val) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		System.out.println("E");
		
		
		
		
		
		
		
		
		
	}
}
