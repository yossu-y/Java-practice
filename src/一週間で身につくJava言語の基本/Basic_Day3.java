package 一週間で身につくJava言語の基本;

public class Basic_Day3 {
	public static void main(String[] args) {
		int a = -10;
		System.out.println("a = " + a);
		if (a > 0) {
			System.out.println("aは正の数です");
		} else {
			System.out.println("aは負の数です");
		}
		
		int num = 1;
		if (num == 1) {
			System.out.println("one");
		} else if (num == 2) {
			System.out.println("two");
		} else if (num == 3) {
			System.out.println("three");
		} else {
			System.out.println("不適切な値です");
		}
		
		int dice = (int)(Math.random() * 7) + 1;
        System.out.println("さいころの目:"+ dice);
        if(1 <= dice && dice <= 6) {
            if(dice % 2 == 0){
                System.out.println("丁（チョウ）です。");
            } else {
                System.out.println("半（ハン）です。");
            }
        } else {
            System.out.println("範囲外の数値です。");
        }
		
        int number = 1;
        switch(number) {
        case 1:
        	System.out.println("one");
        	break;
        case 2:
        	System.out.println("two");
        	break;
        case 3:
        	System.out.println("three");
        	break;
        default:
        	System.out.println("不適切な値です");
        	break;
        }
        
        int b = (int)(Math.random() * 10) + 1;
        System.out.println("b = " + b);
        if (b >= 5) {
        	System.out.println("5以上です");
        } else {
        	System.out.println("5未満です");
        }
        
        int c = (int)(Math.random() * 10) + 1;
        System.out.println("c = " + c);
        if (c != 1) {
        	System.out.println("cは1ではありません");
        } else {
        	System.out.println(c);
        }
        
        int d = (int)(Math.random() * 100) + 1;
        System.out.println("d = " + d);
        
        if (d < 50) {
        	System.out.println("dは50未満です");
        } else {
        	System.out.println(d);
        }
        
        int e = (int)(Math.random() * 100) + 1;
        System.out.println("e = " + e);
        if (e <= 10 || e >= 90) {
        	System.out.println("10以下か90以上の値です");
        } else {
        	System.out.println(e);
        }
        
        int f = (int)(Math.random() * 100) + 1;
        System.out.println("f = " + f);
        if (f >= 20 && f <= 80) {
        	System.out.println("20以上80未満です");
        } else {
        	System.out.println(f);
        }
        
        int g = (int)(Math.random() * 6) + 1;
        System.out.println("数値：" + g);
        if (g >= 3) {
        	System.out.println("3以上です");
        } else {
        	System.out.println(g);
        }
        
        int h = (int)(Math.random() * 3) + 1;
        System.out.println("数値：" + h);
        
        switch(h) {
        case 1:
        	System.out.println("グー");
        	break;
        case 2:
        	System.out.println("チョキ");
        	break;
        case 3:
        	System.out.println("パー");
        	break;
        default:
        	System.out.println("それ以外");
        	break;
        }
        
        int j = (int)(Math.random() * 100) + 1;
        System.out.println("数値：" + j);
        if (j % 2 == 0 && j % 3 == 0) {
        	System.out.println("2と3の公倍数です。");
        } else if (j % 2 == 0) {
        	System.out.println("2の倍数です。");
        } else if (j % 3 == 0) {
        	System.out.println("3の倍数です。");
        } else {
        	System.out.println(j);
        }
        
        int k = (int)(Math.random() * 100) + 1;
        System.out.println("数値：" + k);
        if (k <= 50 && k % 2 == 0) {
        	System.out.println("50以下の偶数です。");
        } else if (k <= 50) {
        	System.out.println("50以下の数字です");
        } else if (k % 2 == 0) {
        	System.out.println("偶数です");    	
        } else {
        	System.out.println(k);
        }
        
        
        
        
	}

}
