import com.matte.Calculator;
import com.matte.Ai;

public class LessonA2 {

    // complete this function
    public String up1(String yourName)
    {
        String hello = "Hello "+ yourName + " there";
        return hello;
    }

    public String up3(String myString, boolean x)
    {

    }

    public static void main(String args[]) {
        LessonA2 lesson = new LessonA2();

        // up1. Create a function with 1 string param. Name it to `yourName`
        // return string "Hello {yourName} there".
        // Then print that variable here
        String a = lesson.up1("Oai");
        System.out.println(a);


        // up2. Create a function return bool. Required 1 param as int
        // Return True if param is bigger than 10, else False


        // up3. Use returned value from up1. Create a function that take 2 params: myString, bool (True/False)
        // If param2 is True: Return length of param1 as String. Else return param1 as is
        lesson.up3(a, false);
    }

}
