package ex_01_Java_Basic;

public class Lab_008_Printf {
    public static  void main(String[] args){
        int a = 20;
        int b = 10;

        System.out.printf("The answer for addition of 2 numbers is %d + %d = %d\n", a, b, a+b);
        System.out.printf("The answer for subtraction of 2 numbers is %d - %d = %d\n", a, b, a-b);
        System.out.printf("The answer for multiplication of 2 numbers is %d * %d = %d\n", a, b, a*b);
        System.out.printf("The answer for division of 2 numbers is %d / %d = %d\n", a, b, a/b);
        System.out.printf("The answer for modulus of 2 numbers is %d %% %d = %d\n", a, b, a%b);
    }
}
