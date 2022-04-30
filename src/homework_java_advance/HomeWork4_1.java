package homework_java_advance;

import java.util.Arrays;

public class HomeWork4_1 {

    public static void main(String[] args) {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        System.out.println("Summa chisel masiva = " + Arrays.stream(array).sum()); //summ
        int sum = 0;
        for (int i = 0; i < array.length; i = i + 1) {
            sum = sum + array[i];
        }
        System.out.println("Summa chisel masiva = " + sum); // sum ver 2

        int max = array[0]; // max chislo v masive
        //int max = Integer.MIN_VALUE; variant kogda masive imeet otricatelnie chisla
        for (int i = 0; i < array.length; i = i + 1) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Max chislo masiva = "+ max); // max chislo masiva ver 2

        System.out.println(Arrays.stream(array).max()); //max chislo masiva ver 2

        System.out.println(Arrays.stream(array).min()); // min chislo

        double summ = 0;
        for (int i = 0; i < array.length; i = i + 1) {
            summ = summ + array[i];
        }
        System.out.println(summ / array.length); // serednie arifmetichne
        System.out.println(Arrays.stream(array).sum() / array.length); //serednie arifmetichne ver2

    }
}
