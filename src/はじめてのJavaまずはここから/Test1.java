package はじめてのJavaまずはここから;
import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		File file = new File("files");
		
		String[] files = file.list();
		
		for (String fileName: files) {
			System.out.println(fileName);
			
		}
	}
}
