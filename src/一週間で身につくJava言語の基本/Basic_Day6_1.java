package 一週間で身につくJava言語の基本;

public class Basic_Day6_1 {
	int n = 10;
	String s = "friend";
	
	int add (int a, int b) {
		return a + b;
	}
	
	String add (String s) {
		return this.s + s;
	}
	void showNum() {
		System.out.println("n = " + n);
	}
}
