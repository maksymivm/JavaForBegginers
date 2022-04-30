package homework_java_for_begginer;

import java.util.Arrays;

public class HW7 {

    static utils utilities = new utils();

    

    public static double midValue(int [] array) {

        double midValue = 0;
        for (int i = 0; i < array.length; i++) {
            midValue +=  array[i];
        }

        return midValue / array.length;
    }

    public static double[] minMaxAver (int [] minMaxAver){

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < minMaxAver.length; i ++){
            if (minMaxAver[i] < min){
                min = minMaxAver[i];
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < minMaxAver.length; i ++){
            if (minMaxAver[i] > max){
                max = minMaxAver[i];
            }
        }

        double averageAges = 0;
        for (int i = 0; i < minMaxAver.length; i ++){
            averageAges += minMaxAver[i];
            }
        double [] arr21 = {min + max + averageAges/minMaxAver.length};
        return arr21;
    }

    public static void main(String[] args) {

        String[] catsNames = new String[]{"vasya", "gavrilo", "rudik", "valik", "kotok", "myau", "den", "rex"};
        catsNames[4] = "rizhik";
        catsNames[1] = "chernish";

        String[] catsColors = new String[]{"grey", "black", "grey", "brown", "beige", "grey", "beige", "grey"};

        int[] catsAges = {2, 1, 4, 3, 5, 2, 2, 2};

        String[] isCatsRed = new String[]{"red", "red", "red", "red", "red", "red", "red", "red"};

        utilities.task(6);
        System.out.println(catsNames[6]);

        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 0) {
                System.out.println(catsNames[i]);
            }
        }

        for (int i = 0; i < catsNames.length; i++) {
            if (i % 4 == 0) {
                System.out.println(catsNames[i]);
            }
        }

        for (int i = 0; i < catsColors.length; i++) {
            if (i % 2 != 0) {
                System.out.println(catsColors[i]);
            }
        }

        for (int i = 0; i < catsColors.length; i++) {
            if (i % 3 == 0) {
                System.out.println(catsColors[i]);
            }
        }

        utils.task(7);
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i] == "grey") {               // if (cats.colors[i].equals("grey")); krashche cherez metod
                System.out.println("Cat wants to eat");
            }
        }

        utils.task(8);
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 0 || catsAges[i] > 50) {
                System.out.println("ERROR");
            } else if (catsAges[i] < 2) {
                System.out.println("Cats need vactination");
            } else System.out.println("Kot bude v doma");
        }

        utils.task(9);
        //int length = catsNames.length; est problema esli masiv pustoy


        System.out.println(catsNames[catsNames.length - 1]);
        System.out.println(catsColors[catsColors.length - 1]);
        System.out.println(catsAges[catsAges.length - 1]);

        utils.task(10);
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] > 2) {
                System.out.println(catsNames[i]);
            }
        }

        utils.task(11);
        //Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
        if (catsNames.length == isCatsRed.length && catsNames.length != 0) {
            for (int i = 0; i < catsNames.length; i++) {
                if (catsNames[i] == "rizhik" && isCatsRed[i] == "red") { // neponyatno
                    System.out.println("Cat wants to eat");
                }
            }
        }

        utils.task(12);
        //Распечатать средний возраст котов из массива catsAges
        double ages = 0;
        double serAges;
        int catsLength;
        for (int i = 0; i < catsAges.length; i++) {
            ages = ages + catsAges[i];
            //System.out.println(ages);
        }
        catsLength = catsAges.length;
        serAges = ages / catsLength;

        System.out.println(serAges);

        utils.task(13);
        //Распечатать возраст самого молодого кота
        double minAge = catsAges[0];
        for (int i = 0; i < catsAges.length; i++) {
            if (minAge > catsAges[i]) {
                minAge = catsAges[i];
            }
        }
        System.out.println(minAge);

        utils.task(14);
        //Распечатать возраст самого старого кота
        double maxAge = catsAges[0];
        for (int i = 0; i < catsAges.length; i++) {
            if (maxAge < catsAges[i]) {
                maxAge = catsAges[i];
            }
        }
        System.out.println(maxAge);

        utils.task(15);
        //Распечатать количество серых котов
        int greyCats = 0;
        if (catsColors.length != 0) {
            for (int i = 0; i < catsColors.length; i++) {
                if (catsColors[i].equals("grey")) {
                    greyCats++;
                }
            }
        }
        System.out.println(greyCats);

        utils.task(16);
        //Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет
        if (catsAges.length == catsNames.length && catsNames.length != 0) {
            for (int i = 0; i < catsAges.length; i++) {
                if (i % 2 == 0 && catsAges[i] <= 3) {
                    if (catsAges[i] == 1) {
                        System.out.println(catsNames[i] + catsAges[i]);
                    } else {
                        System.out.println(catsNames[i] + catsAges[i]);
                    }
                    //System.out.println(catsNames[i]);
                }
            }
        }

        utils.task(17);
        //Создать массив четных положительных чисел, значения которых не больше 10.
        //(заполняем значения с помощью цикла for)

        int count = 0;
        for (int i = 0; i <= 10; i += 2) {
            count++;
        }

        int[] array = new int[count];
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            value += 2;
            System.out.println(array[i]);
        }
        utils.task(18);
        //Написать метод, который принимает на вход массив int, и возвращает среднее значение.
        //Проверить работу метода тестом, если параметр - массив catsAges
        System.out.println(Arrays.toString(catsAges));
        System.out.println(midValue(catsAges));
        utils.verifyEquals(2.625, midValue(catsAges));

        utils.task(19);
        //Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900
        // snachala mozhno opredilit dlinu masiva, vishe v primerah!!!!!
        int[] array19 = new int[50];
        int value19 = -999;
        for (int i = 0; i < array19.length; i++) {
            array19[i] = value19;
            value19 += 2;
            System.out.println(array19[i]);
        }

        utils.task(20);
        //Создать массив из 10 случайных положительных целых чисел
        int[] array20 = new int[10];
        for (int i = 0; i < 10; i++) {
            array20[i] = ((int) (Math.random() * Integer.MAX_VALUE));
            System.out.println(array20[i]);

        }

        utils.task(21);
        /*
        Создать метод, который принимает на вход массив int,  и возвращает минимальное значение,
        максимальное значение и среднее значение всех чисел массива.
        Проверить работу метода на массиве из задания 20.
         */
        System.out.println();

        utils.task(22);
        //Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.

        utils.task(24);

        int [][] array24 = new int [4][8];
        System.out.println("2D masiv vupadkovih chisel vid 1 do 10, rozmirom 4 * 8");

        for (int i = 0; i < array24.length; i++){
            for (int j = 0; j < array24[i].length; j++){
                array24[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        System.out.println(Arrays.deepToString(array24));

        utils.task(25);

        int sum25 = 0;
        for (int i = 0; i < array24.length; i++){
            for (int j = 0; j < array24[i].length; j++){
                if (array24[i][j] % 2 == 0){
                    sum25 += array24[i][j];
                }
            }
        }
        System.out.println(sum25);

    }
}