package 北ソフト工房;

public class lesson3 {
	public static void main(String[] args) {
		
		System.out.println("練習問題3-1");
		int a = 12;
		int b = 4;

		if( a > b )
		    System.out.println( "xはyより大きい。" );
		
		System.out.println("練習問題3-2");
		int c = 11;
		int d = 16;
		if (c > d) {
			System.out.println(c);
		} else {
			System.out.println(d);
		}
		
		System.out.println("練習問題3-3");
		if (c > d)
			System.out.println("cはdより大きい");
		else
			System.out.println("cはdより小さい");
		
		System.out.println("練習問題3-4");
		int e = 12;
		int g = 42;
		
		if (e > g) {
			System.out.println("eはgより大きい");
		} else if (e == g) {
			System.out.println("eとgは等しい");
		} else {
			System.out.println("eはgより小さい");
		}
		
		System.out.println("練習問題3-5");
		int h = 31;
		if (h % 2 == 0) {
			System.out.println(h + "は偶数です");
		} else {
			System.out.println(h + "は奇数です");
		}
		
		System.out.println("練習問題3-6");
		int i = -11;
		
		if (i % 2 == 0) {
			if (i >= 0) {
				System.out.println("正の偶数");
			} else {
				System.out.println("負の偶数");
			}
		} else {
			if (i >= 0) {
				System.out.println("正の奇数");
			} else {
				System.out.println("負の奇数");
			}
		}
		
		System.out.println("練習問題3-7");
		int j = 80;
		
		if (j > 60) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		
		if (j > 80) {
			System.out.println("たいへんよくできました");
		} else if (j > 70) {
			System.out.println("よくできました");
		} else {
			System.out.println("残念でした");
		}
		
		if (j > 80) {
			System.out.println("優");
		} else if (j > 70) {
			System.out.println("良");
		} else if (j > 60) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
				
		System.out.println("練習問題3-8");
		int k = 60;
		int l = 60;
		
		if (k >= 60 && l >= 60) {
			System.out.println("合格");
		} else if (k + l >= 130) {
			System.out.println("合格");
		} else if ((k + l >= 100) && (k >= 90 || l >= 90)) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		
		System.out.println("練習問題3-9");
		
		
		System.out.println("練習問題3-10");
		int m = 13;
		int n = 8;
		
		if ((m < n) && (m % 2 == 0 || n % 2 == 0)) {
			System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );
		} else if ((m == n) && (m < 0) && (n < 0)) {
			System.out.println( "xとyは等しく、かつ、負の数である。" );
		} else if ((m < n) || (m % 2 == 0)) {
			System.out.println( "xはyより小さい、または、xは偶数である。" );
		} else if ((m < 10 || m >= 100) && (n < 10 || n >= 100)) {
			System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );
		} else if ((m < 0 && n < 0) || (m > 0 && n > 0)) {
			System.out.println( "xもyも負の数である、ではない。" );
		}		
		
		System.out.println("練習問題3-11");
		int s = 1;
		
		switch(s) {
		case 1:
			System.out.println("元日、成人の日");
			break;
		case 2:
			System.out.println("建国記念の日");
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
		default:
			System.out.println("祝日はありません");
			break;
		}		
		
		System.out.println("練習問題3-12");
		
	}
}
