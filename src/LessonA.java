import com.matte.Calculator;
import com.matte.Ai;

public class LessonA {
    String x ="Hello World";
    int num = 100;

    String[] fruits = {"apple", "pear", "banana", "orange"};

/*
    int[] values = new int[4];

    values[0] = 10;
    values[1] = 20;
    values[2] = 30;
    values[3] = 40;
    values[4] = 50;
*/
    int[] values = {10, 20, 30, 40 ,50};

    Object[] mix = new Object[] {"apple", "pear", "banana", "orange", 10};
   // Object[] mix = new Object[] {fruits, 10};    ??????
  // Object[] mix = new Object[] {fruits, values[0}; ???????



    public String up1()
    {
       // String x = "Hello world";
        return x;
    }

    public int  up2() {
        return num;
    }

    public void up3() {
        System.out.println(x + " " + num);
    }

    public void up4() {
       /* System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
        System.out.println(fruits[4]);
*/
       for(String fruit: fruits) {
           System.out.println(fruit);
       }
    }

    public void up5() {
        /*
         for (int i=0; i<values.length; i++) {
            System.out.println(values[i]);
         }
         */
        for (int value: values) {
            System.out.println(value);
        }
    }

    public void up6() {
        for (Object a: mix) {
            System.out.println(a);
        }
    }

    public static void main(String args[]) {
        LessonA lessonA = new LessonA();

        // up1. create a function return string "Hello world". Then print that variable
        String a = lessonA.up1();
        System.out.println(a);

        // up2. create a function return int 100. Then print that variable

        int b = lessonA.up2();
        System.out.println(b);

        // up3. concat up1 variable with up2 variable

        lessonA.up3();

        // up4. create array of string with 4 index. Add some fruits

        lessonA.up4();

        // up5. create array of int. Add 5 random numbers

        lessonA.up5();

        // up6. create mixed type of array. Add 5 items

        lessonA.up6();
    }


}
