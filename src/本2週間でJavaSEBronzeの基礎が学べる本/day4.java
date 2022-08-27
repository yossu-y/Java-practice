package 本2週間でJavaSEBronzeの基礎が学べる本;

public class day4 {
	public static void main(String[] args) {
//		int[] score = {80, 90, 85};
		
		int[] array = new int[3];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		
//		System.out.println(array[1]);
		
		for (int i = 0; i < array.length; i++) {
			int val = array[i];
			System.out.println(val);
		}
		
		int[] arrays = {10, 20, 30};
		
		for (int let: arrays) {
			System.out.println(let);
		}
		
		
	}

}
