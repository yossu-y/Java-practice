package 北ソフト工房;

public class lesson3 {
	public static void main(String[] args) {
		int x = 15;
		int y = 14;
		
		if (x > y) {
			System.out.println("xはyより大きい");
		} else if (x == y) {
			System.out.println("xとyは等しい");
		} else {
			System.out.println("yはxより大きい");
		}
		
		
		int a = 13;
		
		if (a % 2 == 0) {
			System.out.println("aは偶数です");
		} else {
			System.out.println("aは奇数です");
		}
		
		
		int z = 80;
		
		if (z >= 80) {
			System.out.println("優");
		} else if (z >= 70) {
			System.out.println("良");
		} else if (z >= 60) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
	}
}
