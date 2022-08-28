package Lesson;

public record Chapter05() {
	public static void main(String[] args) {
        String string1;
        string1 = "あいう";
        System.out.println(string1 + "の文字数" + string1.length());
        
        string1 = "";
        System.out.println(string1 + "の文字数" + string1.length());
        
//        string1 = null;
//        System.out.println(string1 + "の文字数" + string1.length());
        
//        int[] array1 = new int[3];
//        array1[0] = 60;
//        array1[1] = 20;
//        array1[2] = 20;
//        int int2 = array1[2];
//        
//        int array2[] = null;
//        System.out.println(int2);
        
        long l = 241113425;
        System.out.println(l);
        
        double d = 0.43135;
        System.out.println(d);
        
        boolean bool1 = true;
        System.out.println(bool1);
        
        Integer i = 100;
        System.out.println(i);
        
        Float f = 1.4144f;
        System.out.println(f);
        
//        Character c = "う";
//        System.out.println(c);
        
        int[] array = { 0, 10, 20, 30, 40 };
        System.out.println(array[2]);
        
    }
}
