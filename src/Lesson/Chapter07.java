package Lesson;

public record Chapter07() {
	public static void main(String[] args) {
		int number = 7;
		
		if (number < 5) {
			System.out.println(number + "は5未満です");
		} else if (number < 10) {
			System.out.println(number + "は10未満です");
		} else if (number < 15) {
			System.out.println(number + "は15未満です");
		} else {
			System.out.println(number + "は15未満ではないです");
		}
		
		
		int val = 2;
		
		switch (val) {
		case 3:
			System.out.println("よくできました！");
			break;
		case 2:
			System.out.println("ふつうでした！");
			break;
		default:
			System.out.println("がんばろう！");
		}
		
		if (val == 3) {
			System.out.println("よくできました！");
		} else if (val == 2) {
			System.out.println("ふつうでした！");
		} else {
			System.out.println("がんばろう！");
		}
		
		
		int distance = 10;
		
		if (distance <= 5) {
			System.out.println("とても近いです");
		} else if (distance <= 10) {
			System.out.println("近いです");
		} else if (distance <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}
		
		String color = "red";
		
		switch(color) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.println("黄色信号です");
			break;
		case "blue":
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
		
    }
	
}
