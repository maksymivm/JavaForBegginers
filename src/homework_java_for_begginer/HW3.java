package homework_java_for_begginer;

import java.util.SortedMap;

public class HW3 {

    public static void main(String[] args){

        byte a, b;
        a = 45;
        b = -56;

        short s, t;
        //s = Short.MAX_VALUE;
        //t = Short.MAX_VALUE - 60000;
        s = -30000;
        t = 30000;

        System.out.println("Task 4");
        int i = -2147483648;              //i = Integer.MIN_VALUE;
        System.out.println("int min = " + i);
        i = 2147483647;                   //i = Integer.MAX_VALUE;
        System.out.println("int max =  " + i);

        //System.out.println("Task 5");
        long phoneNumber = 14126305645L;

        System.out.println("Task 6");
        float f = 100.101101F;
        double d = 100.101101D;
        System.out.println("Float f = 100.101101 " + f);
        System.out.println("Double d = 100.101101 " + d);

        //System.out.println("Task 7");
        double dd = 10.09999D + 20.099999D;
        float ff = 10.09999F + 20.099999F;
        System.out.println("Double dd = " + dd);
        System.out.println("Float ff = " + ff);

        System.out.println("Task 8");
        double result = 10/3;
        System.out.println(result);

        System.out.println("Task 9");
        double reminder = f % d;
        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        System.out.println("sum = " + sum);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
        System.out.println("reminder = " + reminder);

        System.out.println("Task 10");

        System.out.println("..  ..  .....  ..      ......  ......");
        System.out.println("..  ..  ..     ..      ......  ......");
        System.out.println("......  .....  ..      ..  ..  ..  ..");
        System.out.println("......  .....  ..      ..  ..  ..  ..");
        System.out.println("..  ..  ..     ......  ......  ......");
        System.out.println("..  ..  .....  ......  ......  ......");


    }



    }

