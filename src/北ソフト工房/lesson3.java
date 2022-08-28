package 北ソフト工房;

import java.util.Scanner;

public class lesson3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//		int a = s.nextInt();
		System.out.println("練習問題3-1");
		int a = 10;
		int b = 5;
		if (a > b) {
			System.out.println("xはyより大きい。");
		}
		
		System.out.println("練習問題3-2");
		int c = s.nextInt();
		int d = s.nextInt();
		if (c > d) {
			System.out.println(c);
		} else if (c < d) {
			System.out.println(d);
		} else {
			System.out.println(c + "," + d);
		}
		
		System.out.println("練習問題3-3");
		int e = 11;
		int f = 11;
		if (e > f) {
			System.out.println("eはfより大きい");
		} else if (e < f) {
			System.out.println("eはfより小さい");
		} 
		
		System.out.println("練習問題3-4");
		int g = 12;
		int h = 21;
		if (g > h) {
			System.out.println("eはfより大きい");
		} else if (g < h) {
			System.out.println("eはfより小さい");
		} else {
			System.out.println("eとfは同じ数字です");
		}
		
		System.out.println("練習問題3-5");
		int i = 12;
		if (i % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
		
		System.out.println("練習問題3-6");
		int j = -12;
		if (j >= 0) {
			if (j % 2 == 0) {
				System.out.println("正の偶数");
			} else {
				System.out.println("正の奇数");
			}
		} else {
			if (j % 2 == 0) {
				System.out.println("負の偶数");
			} else {
				System.out.println("負の奇数");
			}
		}
		
		System.out.println("練習問題3-7");
//		ケース１
		int k = s.nextInt();
		
		if (60 <= k) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		
//		ケース２
		if (80 <= k) {
			System.out.println("たいへんよくできました");
		} else if (60 <= k) {
			System.out.println("よくできました");
		} else {
			System.out.println("ざんねんでした");
		}
		
//		ケース３
		if (80 <= k) {
			System.out.println("優");
		} else if (70 <= k) {
			System.out.println("良");
		} else if (60 <= k) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
		
		System.out.println("練習問題3-8");
		int l = 50;
		int m = 70;
		
		if (60 <= l && 60 <= m) {
			System.out.println("合格");
		} else if (130 <= l + m ) {
			System.out.println("合格");
		} else if ((100 <= l + m) && (90 <= m || 90 <= l)) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		
		
		System.out.println("練習問題3-9");
		
		
		
		System.out.println("練習問題3-10");
		int n = 12;
		int o = 14;
		
		if ((n < o) && (n % 2 == 0) && (o % 2 == 0)) {
			System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );
		} else if (n == o && n < 0) {
			System.out.println( "xとyは等しく、かつ、負の数である。" );
		} else if ((n < 0) || (n % 2 == 0)) {
			System.out.println( "xはyより小さい、または、xは偶数である。" );
		} else if ((n <= 10 || n >= 100) && (o >= 10 || o <= 100)) {
			System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );
		} else if (!(n < 0 && o < 0)) {
			System.out.println( "xもyも負の数である、ではない。" );
		}
		
		System.out.println("練習問題3-11");
		int p = 11;
		
		switch(p) {
		case 1:
			System.out.println("元日、成人の日");
			break;
		case 2:
			System.out.println("建国記念日");
			break;
		case 3:
			System.out.println("春分の日");
			break;
		case 4:
			System.out.println("昭和の日");
			break;
		case 5:
			System.out.println("憲法記念日、みどりの日、こどもの日");
			break;
		case 7:
			System.out.println("海の日");
			break;
		case 9:
			System.out.println("敬老の日、秋分の日");
			break;
		case 10:
			System.out.println("体育の日");
			break;
		case 11:
			System.out.println("文化の日、勤労感謝の日");
			break;
		case 12:
			System.out.println("天皇誕生日");
			break;
			
		}
		
		System.out.println("練習問題3-12");
		
		
		System.out.println("練習問題3-13");
		int x = s.nextInt();
		
		switch(x) {
		case 2:
			System.out.println("28日");
			break;
		case 1:
			System.out.println("31日");
			break;
		case 6:
			System.out.println("30日");
			break;
		default:
			System.out.println("入力が間違っています");
			break;
		}
		
		
		s.close();
		
	}
}
