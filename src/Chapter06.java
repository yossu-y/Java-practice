public class Chapter06 {
	public static void main(String[] args) {
		int a = 15;
		int c;
		c = a + 3;
		c = a - 5;
		c = a * 2;
		c = a / 6;
		c = a % 4;
		
		System.out.println(c);
		
		int z = 10;
		z++;
		System.out.println(z);
	
		z = 10;
		z--;
		System.out.println(z);
		
		String m = "100";
		String n = "200";
		String o;
		o = m + n;
		System.out.println(o);
		
		o = "あ" + "い";
		System.out.println(o);
		
		
		int val = 2 + 5;
		System.out.println(val);
		
		val++;
		System.out.println(val);
		
		val *= 5;
		System.out.println(val);
		
		boolean bool = (val == 50);
		System.out.println(bool);
		
		bool = (val < 50) && (val % 10 == 0);
		System.out.println(bool);
		
	}
}
