package Lesson;

public class Chapter09 {
	public static void main(String[] args ) {
		Chapter09_1 yamada = new Chapter09_1();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");
		
		Chapter09_1 sato = new Chapter09_1("佐藤", 25);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
	}
}
