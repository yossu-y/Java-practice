package 一週間で身につくJava言語の基本;

public class Basic_Day1 {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
//		数字の表示
		System.out.print(123);
		System.out.println(456);
		
//		文字列の表示
		System.out.print("ABC");
		System.out.println("DEF");
		
		System.out.println("####################");
		
		System.out.println("名前");
		
		System.out.print("ABC");
		System.out.print("DEF");
		System.out.println("GHI");
		
		System.out.println(1 + "+" + 1 + "=" + (1 + 1));
		System.out.println(2 + "+" + 3 + "=" + (2 + 3));
		System.out.println(1 + "+" + 2 + "+" + 3 + "+" + "=" + (1 + 2 + 3));
		
		int a = 1,b = 2,c = 3,d = 4,e = 5;
        a = a + 2;  //  aに2を加える
        b = b - 1;  //  bから1を引く
        c = c * 3;  //  cに3をかける
        d = d / 2;  //  dを2で割る
        e = e % 2;  //  eに、eを2で割った余りを代入する
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
		
	}
}
