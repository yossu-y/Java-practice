package 一週間で身につくJava言語の基本;

public class Basic_Day4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 3; j++) {
				int k = i + j;
				System.out.print(i + "+" + j + "=" + k + " ");
			}
			System.out.println();
		}
		
		for (int a = 1; a <= 3; a++) {
			for (int b = 1; b <= 3; b++) {
				for (int c = 1; c <= 3; c++) {
					System.out.print(a + "+" + b + "+" + c + "=" + (a + b + c) + " ");
				}
				System.out.println(" ");
			}
		}
		
		int d = 0;
		while (d <= 5) {
			System.out.print(d + " ");
			d++;
		}
		System.out.println();
		
		int num = (int)(Math.random() * 10) + 1;
		System.out.println(num);
		for (int e = 0 ; e < num ; e++) {
			System.out.print("■ ");
		}
		
		System.out.println();
		
		int f = 0;
		System.out.println(num);
		while (f < num) {
			System.out.print("■ ");
			f++;
		}
		
		System.out.println();
		
		int g = 0;
		while (g <= 3) {
			System.out.println("a = " + g);
			g++;
		}
		
		for (int h = 0; h <= 3; h++) {
			System.out.println("h = " + h);
		}
		
//		int i = 3;
//		while (i >= 0) {
//			System.out.println("i = " + i);
//			i--;
//		}
		
		for (int k = 3; k >= 0; k--) {
			System.out.println(k);
		}
		
		System.out.println("#############");
		
		while (true) {
			int number = (int)(Math.random() * 10) + 1;
			System.out.println(number);
			if (number == 10) {
				break;
			}
		}
		
		System.out.println("#############");
		
		while (true) {
			int k = (int)(Math.random() * 100) + 1;
			System.out.print(k + " ");
			if (k % 10 == 0) {
				break;
			}
		}
		
		System.out.println();
		System.out.println("###############");
		
		int max_value = 0;
		
		for (int m = 1; m <= 5; m++) {
			int l = (int)(Math.random() * 10) + 1;
			System.out.print(l + " ");
			if (m == 1) {
				max_value = l;
			} else {
				if (max_value < l) {
					max_value = l;
				}
			}
				
		}
		System.out.println("最大値：" + max_value);
		
		System.out.println("####################");
		
		int guusuu = 0;
		int kisuu = 0;
		
		for (int n = 1; n <= 10; n++) {
			int o = (int)(Math.random() * 10) + 1;
			System.out.print(o + " ");
			if (o % 2 == 0) {
				guusuu += 1;
			} else {
				kisuu += 1;
			}
		}
//		System.out.println();
//		for (int p = 0; p < guusuu; p++ ) {
//			System.out.print("★ ");
//		}
//		System.out.println();
//		for (int q = 0 ;q < kisuu; q++ ) {
//			System.out.print("☆ ");
//		}
//		System.out.println();
//		
//		for (int x = 1; x <= 9; x++) {
//			for (int y = 1; y <= 9; y++) {
//				System.out.printf(y + "*" + x + "=" + (y * x) + " ", " %2d");
//			}
//			System.out.println();
//		}
		System.out.println();
		
		for (int v = 0; v <= 10; v++) {
			System.out.print("□ ");
			for (int w = 1; w <= v; w++) {
				System.out.print("■ ");
			}
			System.out.println();
		}
		
		
	}
	
	
}
