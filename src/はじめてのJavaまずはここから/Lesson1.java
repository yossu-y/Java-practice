package はじめてのJavaまずはここから;
import java.io.File;

public class Lesson1 {
	public static void main(String[] args) {
//		System.out.println("Hello World");
//		
//		int a = 10;
//		int b = 20;
//		
//		b = a;
//		a = 30;
//		
//		System.out.println(a);
//		System.out.println(b);
//		
//		int[] rgb = {100, 200, 250};
//		String[] color = {"赤色", "黄色", "青色"};
//		
//		for (int i = 0; i < rgb.length; i++) {
//			System.out.println(color[i] + "." + rgb[i]);
//		}
//		Fileクラスの宣言
		File file = new File("files");
		
//		フォルダ内にあるファイル名をすべて取得する
		String[] files = file.list();
		
//		配列filesの要素を取得して、全て表示
		for (String fileName: files) {
			System.out.println(fileName);
		}
		
		
	}
}
