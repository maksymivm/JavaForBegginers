package homework_java_for_begginer;

import java.util.Arrays;
import java.util.Locale;

public class HW10_2 {

    // task 1
    public static String checkSpace(String str) {

        if (str.length() != 0) {

            int count = str.length();
            str = str.trim();
            int countNew = str.length();

            if (count == countNew) {
                System.out.println("Probelov nebelo");
            } else {

                return "Probelu udalenu";
            }
        }

        return "";
    }

    //task2
    public static String removeAlla(String str) {

        if (!str.isEmpty()) {
            str = str.replace("a", "");

            return str;
        }

        return "Stroka pustaya";
    }

    //task 3
    public static String removeAllZeros(String str) {
        if (str != null) {
            if (str.length() > 0) {
                str = str.trim();
                str = str.replace("0", " ");
                str = str.replace(" ", "");

                return str;
            }
        }

        return "";
    }

    //task 4
    public static String removeAllSpaces(String str) {
        if (str != null) {
            if (str.length() != 0) {
                str = str.trim().replace(" ", "");
                }
            return str;
        }

        return "";
    }

    //task 5
    public static int howLettersA(String str){
        int count = 0;
        if (str != null && str.length() != 0){
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == 'a'){
                    count++;
                }
            }

            return count;
        }

        return 0;
    }

    //task 8
    public static String capitalizeFirstLetter(String income){
        if (income != null){
            income = income.trim();
            if (income.length() != 0){
                return income.substring(0, 1).toUpperCase().concat(income.substring(1).toLowerCase());
            }
        }

        return income;
    }


    //task9
    public static String returnSubString(String str, String parameter){

        return str.substring(str.indexOf(parameter), str.lastIndexOf(parameter) + 1);
    }

    //task10
    public static boolean isEqualStartEndLetter(String str){
        if (str != null){
            str = str.trim().toLowerCase();

            return str.substring(0, 1).equals(str.substring((str.length() - 1)));
        }

        return false;
    }

    //task 11
    public static String[] changeStringToArray(String str){
        if (str != null){
            if(!str.isEmpty()){

                return str.split(" ");
            }

            return new String[]{};
        }

        return new String[]{};
    }




    public static void main(String[] args) {

        utils.task(1);
        System.out.println(checkSpace(" jh  "));

        utils.task(2);
        System.out.println(removeAlla("yguyfytzewajhghdwa"));

        utils.task(3);
        System.out.println(removeAllZeros("500 67 3 42 0 0 0 1"));
        System.out.println(removeAllSpaces(null));

        utils.task(4);
        System.out.println(removeAllSpaces("Qa  4 Ever io ne"));
        System.out.println(removeAllSpaces(null));

        utils.task(5);
        System.out.println(howLettersA("adfhnnjkkjgrdv"));

        utils.task(8);
        System.out.println(capitalizeFirstLetter("chikago"));

        utils.task(9);
        System.out.println(returnSubString("abrakadabra", "b"));

        utils.task(10);
        System.out.println(isEqualStartEndLetter("feretf"));

        utils.task(11);
        System.out.println(Arrays.toString(changeStringToArray("QA for Everyone")));

    }


}