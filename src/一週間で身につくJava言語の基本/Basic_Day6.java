package 一週間で身につくJava言語の基本;

public class Basic_Day6 {
	public static void main(String[] args) {
		Basic_Day6_1 s = new Basic_Day6_1();
		s.n = 100;
		s.s = "Hello";
		
		int ans = s.add(1, 2);
		String str = s.add("World");
		System.out.println(ans);
		System.out.println(str);
		s.showNum();
	}

}
