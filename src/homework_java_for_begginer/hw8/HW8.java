package homework_java_for_begginer.hw8;

import homework_java_for_begginer.HW7;
import homework_java_for_begginer.utils;

import java.util.Arrays;

public class HW8 {

    homework_java_for_begginer.utils utils = new utils();

    static Double catAges_2 = 2.0;
    static Integer catNumber_2 = 1;
    static String catName_2 = "Murchick";

    boolean isDoubleEquals = catAges_2.equals(HW8_1.catAges);
    boolean isIntegerEquals = catNumber_2.equals(HW8_1.catNumber);
    boolean isStringEquals = catName_2.equals(HW8_1.catName);

    public static int[] getFivesNumber(int a, int b, int c, int d, int e) {

        int[] array7 = new int[5];
        array7[0] = a;
        array7[1] = b;
        array7[2] = c;
        array7[3] = d;
        array7[4] = e;
        //System.out.println(Arrays.toString(array7));

        return array7;
    }

    //8
    // stvorue masiv bud yakoi dovzhinu znachen tipu double dlya zavdanya 8
    public static Object[] makeArrTask8(Object... v) {
        Object[] arr = new Object[v.length];

        for (int i = 0; i < v.length; i++) {
            arr[i] = v[i];
        }
        return arr;
    }

    //9
    public static String[] returnMasString(String str1, String str2, String str3, String str4, String str5) {

        return new String[]{str1, str2, str3, str4, str5};
    }

    //10
    public static double[] returnMasAndValue(int[] arr, int a) {
        if (arr.length > 0) {
            double[] result = new double[arr.length];

            for (int i = 5; i < arr.length; i++) {
                result[i] = (arr[i] * 2.5);
            }

            return result;
        }

        return new double[]{};
    }

    //11
    public static int countEvenElements(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    //12
    public static int[] returnMasOddElements(int[] A){

        int lengthOdd = 0;
        int j =0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                lengthOdd++;
            }
        }

        int [] B = new int[lengthOdd];

        for(int i = 0; i < A.length; i++){
            if (A.length != 0 && A[lengthOdd] >= 0){
                if(A[i] % 2 != 0){
                    B[j] = A[i];
                    j++;
                }
            } else {
                System.out.println("ERROR");
            }
        }
        System.out.println(Arrays.toString(B));
        return B;
    }

    //13
    //Написать метод, который принимает на вход массив целых чисел,
    //и возвращает массив значений true или false, если числа больше 10

    public static boolean[] returnMasTrueFalse(int[] array){
        boolean[] arrayBoolean = new boolean[array.length];
        if(array == null || array.length == 0){
            return null;
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] > 10){
                arrayBoolean[i] = true;
            }
            else {
                arrayBoolean[i] = false;
            }
        }
        System.out.println(Arrays.toString(array));
        return arrayBoolean;
    }

    //14
    //Написать метод, который принимает на вход массив слов,
    // и возвращает строку, состоящую из этих слов

    public static String createSentence(String[] words){
        String sentence = "";
        for (int i = 0; i < words.length; i++){
            sentence += words[i] + " ";
        }
        return sentence;
    }

    //15
    //Написать метод, который принимает массив целых чисел и
    // считает сумму чисел во второй половине массива

    public static int task15(int[] task15){

        int firstSum = 0;

        if (task15.length > 0){
            for (int i = task15.length / 2; i < task15.length; i++){ //pereviryatu na parnist chu neparnist chusel masuvu
                firstSum += task15[i];
            }
        } else {
            System.out.println("Array is empty");
        }
        return firstSum;
    }

    //16
    //Написать метод, который принимает на вход целое положительные число в пределах
    // от 1 до 10 исключительно, и возвращает таблицу умножения на это число в виде массива
    //Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}

    public static int[] array16(int number){
        if (number <= 0 || number > 10){
            return new int[]{};
        } else {
            int [] arrayOfMultByNumber = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //maviv dlya mnozhenya
            for (int i = 0; i < arrayOfMultByNumber.length; i++){
                arrayOfMultByNumber[i] = arrayOfMultByNumber[i] * number;
            }
            return arrayOfMultByNumber;
        }
    }

    //17
    //Написать метод, который принимает массив целых чисел и возвращает массив четных чисел,
    // если четных чисел больше, или массив нечетных чисел, если нечетных чисел больше.

    public static int[] createArrayEvenOrOdd (int[] array){
        int even = 0;
        int odd = 0;
        int[] array17;
        int[] arrEven = new int[array.length];
        int[] arrOdd = new int[array.length];

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                arrEven[even] = array[i];
                even++;
            } else {
                arrOdd[odd] = array[i];
                odd++;
            }
        }
        if (even > odd){
            return array17 = Arrays.copyOf(arrEven, even);
        } else if (even < odd){
            return array17 = Arrays.copyOf(arrOdd,odd);
        } else {
            return new int[0];
        }
    }

    //18
    //Написать метод, который принимает на вход длину массива и генерирует
    // массив случайных положительных чисел от 0 до 100 исключительно.

    public static int[] method18(int l){
        if( l <= 0){
            return null;
        }
        int [] random = new int[l];
        for(int i = 0; i < l; i++){
            random[i] = 1 + (int) (Math.random() * 99) + 1; //potribno rozibratusya z mathrandom
        }

        return random;
    }

    //19
    //Написать метод, который принимает на вход длину массива l
    // и количество знаков d (однозначные, двузначные, трехзначные и тд числа),
    // и генерирует массив случайных целых положительных чисел длины l,
    // в котором все числа имеют количество знаков d

    public static int[] createRandomArrayLToD(int l, int d){
        double[] array = new double[l];

        for(int i = 0; i < l; i++){
            array[i] = Math.random() * 0.9 + 0.1;
            }

        for(int i = 0; i < l; i++){
            for (int j = 0; j < d;j++){
                array[i] *= 10;
            }
        }
        int[] vozvrat = new int [l];
        for (int i = 0; i < l; i++){
            vozvrat[i] = (int) array[i];
        }
        return vozvrat;
    }

    //20
    //Написать метод, который принимает на вход массив целых положительных чисел,
    // и возвращает массив только двузначных чисел.
    // ПРоверить работу метода на массиве из задания 18.

    public static int[] DvoznChislaArray(int[] array){
        int count = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] > 9 && array[i] < 100){
                count++;
            }
        }
        int[] newArray = new int[count];

        for (int i = 0;i < array.length; i++){
            if (array[i] > 9 && array[i] < 100){
                newArray[newArray.length - count] = array[i];
                count--;
            }
        }

        return newArray;
    }

    //21
    //Написать метод, который принимает на вход массив целых положительных двузначных чисел,
    // и возвращает массив разниц между десятками и единицами

    public static int[] raznitsaDesEden(int [] array){
        int [] arr = new int[array.length];
        for (int i = 0; i < array.length; i++){
            arr[i] = array[i] / 10 * 10 - array[i] % 10;
            //arr[i] = Math.abs(array[i] / 10 - array[i] % 10);
        }
        System.out.println(Arrays.toString(array));

        return arr;
    }

    //22
    //Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9,
    // и возвращает массив, который содержит номер телефона, состоящий из этих чисел,
    // и название страны, которой номер принадлежит.
    // Например: method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}

    public static String[] selectCountry(int[] array){
        if(array == null || array.length == 0){
            return null;
            }

        String[] arrayPhoneNumber = new String[2];
        for (int i = 0; i < array.length; i++){
            if (array[i] >= 0){
                arrayPhoneNumber[0] = "\"" + array[0] + array[1] + array[2] + array[3] + ")" + array[4]
                        + array[5] + array[6] + "-" + array[7] + array[8] + "-" + array[9] + array[10] + "\"";
                if (array[0] == 1){
                    arrayPhoneNumber[1] = "\"USA\"";
                } else if(array[0] == 2){
                    arrayPhoneNumber[1] = "\"CANADA\"";
                } else {
                    arrayPhoneNumber[1] = "UNDEFINED NUMBER";
                }
            }
        }
        return arrayPhoneNumber;
    }

    //23
    //Написать метод, который принимает массив целых положительных чисел больше 0,
    // и возвращает массив уникальных чисел.

    public static int[] unikalChisla(int[] array){ // {10, 5, 2, 4, 5, 10, 1, 5, 10}  array: [10, 5, 2, 4, 0, 0, 1, 0, 0]
        int[] unikal = {};
        int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1;j < array.length;j++){
                if (array[i] == array[j]){
                    array[j] = 0;
                }
            }
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0){
                count++;
            }
        }
        unikal = new int[array.length - count];
        count = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i] != 0){
                unikal[count] = array[i];
                count++;
            }
        }
        return unikal;
    }

    //24
    //Написать метод, который принимает на вход массив целых положительных чисел,
    // и возвращает количество уникальных и неуникальных элементов в этом массиве

    public static int[] countUniqueNonUnique(int[] array){
        int n = 0;

        if (array.length > 0){
            for (int i = 0; i < array.length; i++){
                if (array[i] >= 0){
                    for (int j = i + 1; j < array.length; j++){
                        if (array[i] == array[j]){
                            array[j] = -1;
                            n++;
                        }
                    }
                }
            }
            return new int[]{array.length - n, n};// kilkist unikal i ne unikal elementiv
        }
        return new int[]{};
    }

    //25
    //Написать метод, который принимает на вход массив целых положительных чисел,
    // и 2 целых положительных числа (значения индексов). Метод возвращает массив,
    // который содержит только числа из первого массива в промежутке между индексами.
    //Например: method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}

    public static int[] arrayNumberBetweenIndex(int [] arrayInt, int indexStart, int indexEnd){
        if(indexStart >= 0 && indexEnd >= 0){
            if(indexStart <= arrayInt.length - 1 && indexEnd <= arrayInt.length - 1 && indexStart <= indexEnd){
                int[] array = new int[indexEnd - indexStart + 1];
                for (int i = 0; i < array.length; i++){
                    if (array[i] >= 0){
                        array[i] = arrayInt[indexStart];
                        indexStart++;
                    } else {
                        System.out.println("ERROR - Elementu masiva mayut buty tcili chisla");
                        return new int[0];
                    }
                }
                return array;
            } else {
                System.out.println("ERROR - Znachenya indeksiv mayut butu ne bilshi dovzhinu masivu");
                return new int[0];
            }
        }
        System.out.println("ERROR - Indeksu povunni bytu cili chisla");
            return new int[0];
        }


    //26
    //Написать метод, который принимает на вход 2 массива int[]
    // и возвращает объединенный массив уникальных неповторяющихся элементов

    public static int[] getUniqueElement(int[] array, int[] array1){
        if (array == null || array1 == null || array.length == 0 && array1.length == 0){
            return null;
        } else {
            int[] arrayUnique = new int[array.length + array1.length];
            for (int i = 0; i < array.length; i++){
                arrayUnique[i] = array[i];
            }
            for (int i = 0; i < array1.length; i++){
                arrayUnique[array.length + i] = array[i];
            }
            return countUniqueNonUnique(arrayUnique); // metod task 24
        }
    }

    public static void main(String[] args) {

        homework_java_for_begginer.utils.task(6);

        System.out.println(catAges_2.equals(HW8_1.catAges));
        System.out.println(catName_2.equals(HW8_1.catName));
        System.out.println(catNumber_2.equals(HW8_1.catNumber));

        homework_java_for_begginer.utils.task(7);
        getFivesNumber(4, 3, 5, 7, 8);
        System.out.println(Arrays.toString(getFivesNumber(3, 6, 8, 4, 7)));


        homework_java_for_begginer.utils.task(8);
        makeArrTask8(4.0, 5.7, 76);
        System.out.println(Arrays.toString(makeArrTask8(4.0, 5.7, 76)));

        homework_java_for_begginer.utils.task(9);
        returnMasString("wer", "res", "erty", "qwerty", "ytre");
        System.out.println(Arrays.toString(returnMasString("wer", "res", "erty", "qwerty", "ytre")));

        homework_java_for_begginer.utils.task(10);
        //System.out.println(Arrays.toString(returnMasAndValue()));

        homework_java_for_begginer.utils.task(11);
        //countEvenElements();

        homework_java_for_begginer.utils.task(12);
        // taka sama yak poperednya
        //returnMasOddElements();

        homework_java_for_begginer.utils.task(13);
        //returnMasTrueFalse();

        homework_java_for_begginer.utils.task(14);
        //System.out.println(createSentence());

        homework_java_for_begginer.utils.task(15);
        //task15();

        homework_java_for_begginer.utils.task(16);
        int number= 5;
        System.out.println("Number = " + number);
        System.out.println(Arrays.toString(array16(5)));

        homework_java_for_begginer.utils.task(17);
        //createArrayEvenOrOdd();

        homework_java_for_begginer.utils.task(18);
        method18(7);
        System.out.println(Arrays.toString(method18(10)));

        homework_java_for_begginer.utils.task(19);
        createRandomArrayLToD(10,3);
        System.out.println(Arrays.toString(createRandomArrayLToD(5,3)));

        homework_java_for_begginer.utils.task(20);
        //int[] exempl = new int[]{4, 67, 89, 65, 78};
        //DvoznChislaArray();

        homework_java_for_begginer.utils.task(21);
        //raznitsaDesEden();

        homework_java_for_begginer.utils.task(22);
        //selectCountry();

        homework_java_for_begginer.utils.task(23);

        homework_java_for_begginer.utils.task(24);
        //countUniqueNonUnique();

        homework_java_for_begginer.utils.task(25);
        //arrayNumberBetweenIndex();

        homework_java_for_begginer.utils.task(26);


    }
}
