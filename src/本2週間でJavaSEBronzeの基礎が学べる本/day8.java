package 本2週間でJavaSEBronzeの基礎が学べる本;

public class day8 {
	public static void main(String[] args) {
		int[] arrayA = {10, 20, 30};
		int[] arrayB = arrayA;
		
		arrayB[0] = 40;
		for (int val: arrayA) {
			System.out.println(val);
		}
		
		Sample[] samples = new Sample[3];
		sample[0] = new Sample();
		sample[1] = new Sample();
		sample[2] = new Sample();
		
		for (Sample sample: samples) {
			sample.hello();
		}
	}

}
