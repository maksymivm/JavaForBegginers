package homework_java_for_begginer;

import com.sun.jdi.ByteType;
import com.sun.jdi.ByteValue;
import com.sun.jdi.Method;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class HW3Part2 {

    public static void main(String[] args) {

        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = -505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666D;
        Double t8 = -1000000.001D;
        Short t9 = 1010;

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t7);
        System.out.println(t8);
        System.out.println(t9);

        System.out.println("___________________________________________________________________________");
        System.out.println("Type" + "\t" + "Size in bits" + "\t" + "min" + "\t\t\t\t\t\t\t" + "max");
        System.out.println("___________________________________________________________________________");
        System.out.println("Byte" + "\t\t" + Byte.SIZE + "\t\t\t" + Byte.MIN_VALUE + "\t\t\t\t\t\t" + Byte.MAX_VALUE);
        System.out.println("Short" + "\t\t" + Short.SIZE + "\t\t\t" + Short.MIN_VALUE + "\t\t\t\t\t\t" + Short.MAX_VALUE);
        System.out.println("Int" + "\t\t\t" + Integer.SIZE + "\t\t\t" + Integer.MIN_VALUE + "\t\t\t\t\t" + Integer.MAX_VALUE);
        System.out.println("Long" + "\t\t" + Long.SIZE + "\t\t\t" + Long.MIN_VALUE + "\t\t" + Long.MAX_VALUE);
        System.out.println("Float" + "\t\t" + Float.SIZE + "\t\t\t" + Float.MIN_VALUE + "\t\t\t\t\t\t" + Float.MAX_VALUE);
        System.out.println("Double" + "\t\t" + Double.SIZE + "\t\t\t" + Double.MIN_VALUE + "\t\t\t\t\t" + Double.MAX_VALUE);
        System.out.println("___________________________________________________________________________");

        System.out.println("Task 13");
        Integer num1, num2;
        num1 = 10;
        num2 = 10;
        System.out.println("Esli num1 = num2, to rezultat sravneniya metodom .equal = "+ num1.equals(num2));
        num1 = 11;
        num2 = 10;
        System.out.println("Esli num1 != num2, to rezultat sravneniya metodom .equal = "+ num1.equals(num2));

        System.out.println("Task 14");
        int number1, number2;
        number1 = 3;
        number2 = 3;
        System.out.println("Esli number1 = number2 to rezultat sravneniya metodom COMPARE = "
                + Integer.compare(number1, number2));
        number1 = 2;
        number2 = 3;
        System.out.println("Esli number1 < number2 to rezultat sravneniya metodom COMPARE = "
                + Integer.compare(number1, number2));
        number1 = 4;
        number2 = 3;
        System.out.println("Esli number1 > number2 to rezultat sravneniya metodom COMPARE = "
                + Integer.compare(number1, number2));

        System.out.println("Task 15");
        Float F = 234.9999F;
        System.out.println(F.intValue());

        System.out.println("Task 16");
        double k = 34533D;
        double k2 = 8756D;
        System.out.println(Double.sum(k, k2));

        System.out.println("Task 17");
        Float F17 = 32.09F;
        Float F16 = 45.098F;
        System.out.println(Integer.sum(F17.intValue(), F16.intValue()));

        System.out.println("Task 18a");
        short s1 = 12000;
        short s2 = 12300;
        System.out.println("12000 - 12300 = " + Short.compare(s1, s2));

        System.out.println("Task 18b");
        s1 = 12500;
        s2 = 12300;
        System.out.println("12500 - 12300 = " + Short.compare(s1, s2));

        System.out.println("Task 19");
        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;
        Double doubRez = doub1 - doub2;

        System.out.println("doub1 - doub2 = " + doubRez);
        System.out.println(Double.valueOf(str1) - Double.valueOf(str2));

        System.out.println("Task 20");

       /* Byte Cat;
        Cat = Byte.MAX_VALUE;
        Cat = Byte.MIN_VALUE;
        System.out.println(Math.round((Byte.MAX_VALUE + Byte.MIN_VALUE) / 2));
        */

    // Double Cat;
    // Cat = 40.2;
    // Double avarage = Cat / 2;
    // Cat = 35.0;
    // avarage = avarage + Cat / 2;

        Float temp;
        temp = 37.3F;
        Float avarage;
        avarage = temp;
        temp = 35.6F;
        avarage = (avarage + temp) / 2;
        System.out.println("Srednyaya temperatura kota = " + Math.round(avarage));

        System.out.println("Task 21");

        Number n = Double.MAX_VALUE;
        n = 10;
        n = 10.999999999;
        System.out.println("Peremennaya N mozhet prinimat znacheniya: \nn = " + Double.MAX_VALUE
                + "\n" + "n = 10" + "\n"+ "n = " + n);
        System.out.println("Eto vozmozhno potomu, chto ona type double");

        System.out.println("Task 22");

        Integer numberInteger = 100;
        System.out.println(numberInteger.TYPE);
        System.out.println(numberInteger.getClass());
        // System.out.print(numberInteger.MAX_VALUE);
        numberInteger.toString();
        System.out.println(numberInteger.toString().getClass());
        //System.out.println(" Eto chislo clasa Integer potomu chto max dopustimoe sootvetstvuet etomu clasu");

        System.out.println("Task 23");

        double celsium = 36.6F;
        double Farengait;
        Farengait = 36.6 * 1.8 + 32;
        System.out.println(Farengait);

        double kg;
        double lbs;
        lbs = 50 / 2.20462;
        kg = 50 * 2.20462;
        System.out.println("50 kg = " + kg + " lbs" + "\n" + "50 lbs = " + lbs + " kg");














    }
}
