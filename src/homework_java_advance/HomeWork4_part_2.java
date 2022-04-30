package homework_java_advance;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HomeWork4_part_2 {

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum = 0;
        int max = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j]; // suma vsih elementiv masiva

                if (array[i][j] > max) { // znahodzhenya maximalnogo znachenya elementa v masive
                    max = array[i][j];
                }
                count++; // Kilkist elementiv v masive
                // count = count + array[i].length; no togda ne nuzhno vtorogo tsikla po j!!!!
            }
        }
        System.out.println("Suma elementiv masiva = " + sum);
        System.out.println("Maksimalne znachenya elenta v masive = " + max);
        System.out.println("Kilkist elementiv v masive = " + count);
    }
}
