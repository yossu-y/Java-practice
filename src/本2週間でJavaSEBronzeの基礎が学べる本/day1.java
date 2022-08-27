package 本2週間でJavaSEBronzeの基礎が学べる本;

public class day1 {
	public static void main(String[] args) {
		System.out.println("Hello World");
	/*
	 * コメント
	 * コメント
	 * 
	 */		
		
		int num;
		num = 10;
		System.out.println(num);
		
		String str = "Hello World";
		System.out.println(str);
		
//		final int number = 15;
		
		int a = 1;
		int b = 2;
		int c = 3;
		int d = a + b + c;
		int e = (a + b) * c;
		int f = a + b * c;
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		String aa = "Hello ";
		String bb = "World";
		String result = aa + bb + "!";
		System.out.println(result);
		
//		aaa + 10が先に実行されるから$:1010の結果になる
		String aaa = "$:";
		System.out.println(aaa + 10 + 10);
		
//		10 + 10が先に実行されるから20yenの結果になる
		String bbb = "yen";
		System.out.println(10 + 10 + bbb);
		
		int x = 10;
		int y = 10;
		x++;
		y--;
		System.out.println(x);
		System.out.println(y);
		
		int xx = 10;
		int yy = xx++;
		int zz = ++xx;
		System.out.println(yy);
		System.out.println(zz);
		
		int ab = 10;
		long ac = 15;
		int acc = (int)ac;
		long results = ab + ac;
		
		System.out.println(acc);
		System.out.println(results);
		
	}
}
