package 北ソフト工房;
import java.util.Scanner;

public class Lesson6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("練習問題1");
		System.out.println("3の2乗=" + pow2( 3 ));
		
		System.out.println("練習問題2");
		System.out.println("平均値は" + average(4, 9));
		
		System.out.println("練習問題3");
		int c = s.nextInt();
		int d = s.nextInt();
		int e = s.nextInt();
		
		System.out.println(Value(c, Value(d, e)));
		
		System.out.println("練習問題");
		System.out.println("練習問題");
	}
	
//	1
	public static int pow2(int n) {
		return n * n;
	}
	
//	2
	public static int average(int a, int b) {
		return (a + b) / 2;
	}
	
//	3
	public static int Value(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}
	}

}
