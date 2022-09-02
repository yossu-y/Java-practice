package 一週間で身につくJava言語の基本;

public class Basic_Day5 {
	public static void main(String[] args) {
		int[] a = {5, 4, 3, 2, 1};
		String[] b = {"ABC", "DEF", "GHI"};
		
		for (int c = 0; c < a.length; c++) {
			System.out.print(a[c] + " ");
		}
		System.out.println();
		
		for (int c = 0; c < b.length; c++) {
			System.out.print(b[c] + " ");
		}
		
		int[][] d = new int[4][2];
		int m, n;
		for (m = 0; m < d.length; m++) {
			for (n = 0; n < d[m].length; n++) {
				d[m][n] = m + n;
			}
		}
		
		System.out.println();
		
		for (m = 0; m < d.length; m++) {
			for (n = 0; n < d[m].length; n++) {
				System.out.print(d[m][n] + " ");
			}
			System.out.println();
		}
		
		System.out.println("##############");
		
		int[][] e = {{0, 1}, {2}, {3, 4, 5, 6}};
		
		for (int f = 0; f < e.length; f++) {
			for (int g = 0; g < e[f].length; g++) {
				System.out.print(e[f][g] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
