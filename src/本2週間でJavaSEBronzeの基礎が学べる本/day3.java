package 本2週間でJavaSEBronzeの基礎が学べる本;

public class day3 {
	public static void main(String[] srgs) {
		
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
		
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < a + 1 ; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int i = 0;
		
		while (i < 2) {
			System.out.println("i = " + i);
			i++;
		}
		
	}
}
