package Lesson;

public class Chapter08 {
	public static void main(String[] args) {
       int number = 1;
       
       while (number < 50) {
    	   number *= 2;
    	   System.out.println("while01 =" + number);
       }
       
       System.out.println("#######################");
       
       int number1 = 1;
       do {
    	   number1 *= 2;
    	   System.out.println("DoWhile01=" + number1);
       } while (number1 < 50);
       
       
       for (int number2 = 1; number2 <= 5; number2++) {
    	   System.out.println("For1=" + number2);
       }
       
       int[] array = {1, 2, 3, 4, 5};
       for (int number3: array) {
    	   System.out.println("For02=" + number3);
       }
       
       
       for (int count = 0; count < 5; count++) {
    	   if (count == 2) {
    		   break;
    	   }
    	   System.out.println("Break01=" + count);
       }
       
       
       for (int count01 = 0; count01 < 5; count01++ ) {
    	   if (count01 == 2) {
    		   continue;
    	   }
    	   System.out.println("Continue01=" + count01);
       }
       
       int num = 1;
    		   
       while (num < 5) {
    	   System.out.println(num * num);
    	   num++;
       }
       
       int arry[] = {1, 2, 8, 13};
       for (int i = 0; i < arry.length; i++) {
           System.out.println(arry[i]);
       }
       
       for (int val : array) {
           if (val % 2 == 0) {
               continue;
           }
           System.out.println(val);
       }
    }
}
