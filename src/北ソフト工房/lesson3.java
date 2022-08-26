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
		System.out.println("練習問題3-8");
		System.out.println("練習問題3-9");
		System.out.println("練習問題3-10");
		System.out.println("練習問題3-11");
		System.out.println("練習問題3-12");
	}
}
