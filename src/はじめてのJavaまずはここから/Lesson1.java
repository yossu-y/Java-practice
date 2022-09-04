package はじめてのJavaまずはここから;

public class Lesson1 {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int a = 10;
		int b = 20;
		
		b = a;
		a = 30;
		
		System.out.println(a);
		System.out.println(b);
		
		int[] rgb = {100, 200, 250};
		String[] color = {"赤色", "黄色", "青色"};
		
		for (int i = 0; i < rgb.length; i++) {
			System.out.println(color[i] + "." + rgb[i]);
		}
	}
}
