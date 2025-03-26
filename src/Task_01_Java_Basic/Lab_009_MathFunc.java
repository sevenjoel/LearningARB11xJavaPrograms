package Task_01_Java_Basic;
import java.lang.System;

public class Lab_009_MathFunc {
    public static void main(String[] args){
        int x = 10;
        int y = 10;
        int z = 10;
        double output;

         output = Math.cbrt((Math.pow(x,2))+ (Math.pow(y,2)) -(Math.abs(z)));
        System.out.println(output);

    }
}
