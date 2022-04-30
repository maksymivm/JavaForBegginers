package homework_java_for_begginer;

import java.util.Arrays;
import java.util.Locale;

public class StringForTryLesson {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "is";
        String str3 = "fun";
        String space = " ";
        System.out.println(str1 + space+ str2+ space + str3);

        String str4 = str1 + space+ str2+ space + str3;
        System.out.println(str4);

        char a = 'a';
        Character aa = 'a';
        //Character aaa = new Character('a');

        System.out.println(a == aa);
        //System.out.println(aa == aaa);
        //System.out.println(aa.equals(aaa));
        System.out.println(str4.charAt(0)); //druk sumvola po nomeru
        System.out.println(str4.charAt(4)); //tam probil
        //System.out.println(str1.charAt(4)); pomilka, 4 simvola ne isnue v slovi "Java" String index out of range: 4
        String strA = "a";
        //System.out.println(a == strA); string i char ne rivnyayutsya!!!

        for (int i = 0; i <= 4; i++){
            System.out.println(str4.charAt(i));
        }

        for (int i = 0; i < str4.length(); i++){
            if(str4.charAt(i) == 'a'){                    //array[i] - tak bulo v masivah chisel
                System.out.println(str4.charAt(i));       // druk bukvu
                System.out.println(i);                    // nomer indeksa na yakomu 'a'
            } else {
                System.out.println("Letter is not a");
            }
        }

        for (int i = 0; i < str4.length(); i++){
            if(str4.charAt(i) >= 'i'){               // porivnyana yde po tabluci ASCII
                System.out.println(str4.charAt(i));

            } else {
                System.out.println("< i");
            }
        }

        System.out.println('i' -1); // otrumaemo ASCII nomer pered 'i'
        System.out.println('i');
        System.out.println('i' +1);
        System.out.println(Character.toString('i' - 1)); // vuvid bukvu pered 'i'


        // pereveli stroku v masi bukv!!!!
        String[] arrayStr = new String[str4.length()];
        for (int i = 0; i < str4.length(); i++){
            arrayStr[i] = Character.toString(str4.charAt(i)); // stvorutu masin bukv
        }

        System.out.println(Arrays.toString(arrayStr)); //pechat masiva

        System.out.println(str4.toCharArray()); // perevelu stroku do masiv sumvoliv

        System.out.println(Arrays.toString(str4.toCharArray())); //pechat masiva

        char[] arrayChar = str4.toCharArray();
        System.out.println(arrayStr[0].equals(arrayChar[0]));
        System.out.println(arrayStr[0].compareTo(Character.toString(arrayChar[0]))); // yaksho rivno - povernenya 0 inakshe 1 abo -1

        if (arrayStr[0].compareTo(Character.toString(arrayChar[0])) == 0){
        }

        str4.toLowerCase(); //perevestu strichku v mali bukvu
        str4.toUpperCase(); // veluki bukvi

        String str5 = str4.toUpperCase();
        System.out.println(str4.compareToIgnoreCase(str5)); // ignorui mali chu veluki bukvi


    }
}
