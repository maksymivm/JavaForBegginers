package homework_java_for_begginer;

import java.math.BigDecimal;
import java.time.temporal.ValueRange;

public class HW6 {

    public static void task(int a){
        System.out.println("****************** Task # " + a + " ******************");
    }

    public static void zadanie10(double start, double end, double step) {

        for (start = start; start < end; start += step) {
            System.out.println(start);
        }
    }

    public static void seq10(double start, double end, double step){
        // increasing start < end, step > 0
        // decreasing start > end, step < 0
        // step mozhet bit otritsatelnim

        if (start < end && step > 0){
            for (start = start; start < end; start += step){
                System.out.println(start);
            }
        } else if (start > end && step < 0){
            for (start = start; start > end; start += step){
                System.out.println(start);
            }
        } else {
            System.out.println("INVALID DATA");
        }

    }

/*    public static void zadanie10_1(double start, double end, double step){
 /
        if (step == 0){
            System.out.println("Error");
        }
        if (start < end){
            for (start = start; start < end; start += step) {
                System.out.println(start);
        }
                }

        if (start > end) {
            for (start = start; start > end; start += step) {
                System.out.println(start);
            }
        }
    }
*/
    public static void seq11(){

    }

    public static void seq12(int n){
       for (int i = 1; i <= n; i++ ){
           System.out.println(String.format("2.0f", Math.pow(2, i)));
       }

    }

    public static void number16(int n, int m, int l){
        for (int i = n; i < l; i = i +m){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }


    public static void seq17(int n){
        int l = n + 5;
        for(; n < l; n++){
            System.out.println("[" + (n + 1) + "]" + " = " + (n + 2));
        }

        }

    public static void seq18(int n, int l) {
        if (n < l) {
            System.out.println("[" + n + "]" + " = " + n);
            for (; n < l; n++) {
                System.out.println("[" + (n + 1) + "]" + " = " + (2 * n));
            }
        }else {
            System.out.println("Invalid data");
        }
    }

    public static void seq20(double x){
        if (x > 1.5){
            System.out.println(2.5 * Math.pow(x, 3) + 6 * Math.pow(x, 2) - 30);
        }
        else if (x <= 1.5 && x >= 0){
            System.out.println(x + 1);
            }
        else {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        task(1);
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        task(2);
        for (int i = 10; i >= 0; i--){
            System.out.println(i);
        }

        task(3);
        for (int i = 50; i < 55; i+=2){
            System.out.println(i);
        }

        task(4);
        for (int i = 326; i > 300; i--){
            if (i % 7 == 0){
                System.out.println(i);
            }
        }

        task(5);
        for (double i = 12; i <= 13; i = i + 0.1){
            System.out.println(String.format("%.1f", i));
        }

        task(6);
        for (int i = 215; i <= 237; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        task(7);
        for (int i = 8; i < 14; i++){
            if (i % 7 == 0){
                System.out.println(i);
            } else {
                System.out.println("Chisel net");
            }
        }

        task(8);
        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++){
            if (i % 15001 == 0){
                System.out.println(i);
            }
        }

        task(9);
        //Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
        // Числа, кратные 11, должны быть распечатаны синим цветом.
        // Числа, кратные 12, должны быть распечатаны красным цветом. А ноль необходимо распечатать словом ZERO.

        for (int i = -10; i < 35; i++){
            if (i % 11 == 0){
                System.out.println("\u001B[34m" + i);
            }
            else if (i % 12 == 0){
                System.out.println("\u001B[31m" + i);
            }
            else if (i == 0){
                System.out.println("\u001B[33m" + "ZERO");
            }
        }

        task(10);
        //Написать метод, который принимает на вход параметры start,  end, step,
        // и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step.
        // Точка выхода из цикла - число end.


        zadanie10(0,50,2);

        // happy pass
        seq10(10.5, 20.75, 1.23);
        System.out.println("________________________");
        // happy pass
        seq10(15.9, 0, -1.45);
        System.out.println("________________________");
        // negative test
        seq10(76,56,0); //nekorectni dani
        seq10(67,0,6);  //
        seq10(-15,0,-1);//

        task(11);
        //Написать метод, который принимает параметр L и печатает  последовательность четных чисел от нуля.
        // Длина последовательности = L.

        task(12);

        seq12(2);


        task(13);
        for (int i = 1; i < 10; i++ ){

        }

        task(14);
        for (int i = 0, j = 1; i > -6 || j <= 5; i --, j++){
            if(j < 6){
                System.out.println(i + ", " + j + ", ");
                }

        }

        task(15);
        for (int i = 0; i <= 25; i++){
            if(i % 3 == 0 || i % 5 == 0){
                System.out.println(i + " ");
            }
        }

        task(16);
        number16(2,1,78);

        task(17);

        seq17(3);

        task(18);

        seq18(1,10);

        task(19);

        int des = 0;
        int ed = 0;
        for (int i = 10; i < 100; i++){
            des = i / 10;
            ed = i % 10;
            if (des - ed <= 3 && ed - des <= 3){
                System.out.print(i + " ");
            }
        }

        task(20);
        seq20(1);

    }

}
