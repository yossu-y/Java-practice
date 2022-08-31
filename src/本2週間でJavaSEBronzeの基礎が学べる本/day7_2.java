package 本2週間でJavaSEBronzeの基礎が学べる本;

public class day7_2 {
	public static void main(String[] args) {
		day7 a = new day7();
		day7 b = a;
		a.setName("A");
		b.setName("B");
		a.sayHello();
		b.sayHello();
	}
}
