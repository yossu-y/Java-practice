package 本2週間でJavaSEBronzeの基礎が学べる本;
import java.util.Scanner;

public class day3 {
	public static void main(String[] srgs) {
		Scanner s = new Scanner(System.in);
		
		
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i);
//		}
		
//		for (int i = 0; i <= 10; i += 2) {
//			System.out.println(i);
//		}
		
//		for (int j = 0; j < 3; j++) {
//			for (int i = 0; i < 3; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for (int a = 0; a < 3; a++) {
//			for (int b = 0; b < a + 1 ; b++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		int i = 0;
//		
//		while (i < 2) {
//			System.out.println("i = " + i);
//			i++;
//		}
//		
//		for (int d = 1; d < 5; d++) {
//			System.out.println(d);
//			if (d == 3) {
//				break;
//			}
//		}
		
//		for (int x = 0; x < 5; x++) {
//			for (int y = 0; y < 5; y++) {
//				System.out.print("*");
//				if (y == 2) {
//					break;
//				}
//			}
//			System.out.println();
//		}
		
//		int a = s.nextInt();
//		
//		while (a >= 0) {
//			System.out.println("*");
//			a--;
//			if (a == 0) {
//				break;
//			}
//		}
		
//		int ab = s.nextInt();
//		
//		for (int i = 0; i < ab; i++) {
//			for (int j = 0; j < ab + 1; j++) {
//				System.out.println("*");
//			}
//		}
		
		int o = 1;
		do {
			o += 1;
		} while (o < 10);
		System.out.println(o);
		
		
		int z = 0;
		for (int w = 0; w < 5; w++) {
			if (w % 2 == 0) {
				continue;
			}
			z += 1;
		}
		System.out.println(z);
		
		
		
	}
}
