package homework_java_for_begginer;

public class Lesson3 {

    static int a;
    static Integer A;
    static double d;
    static Double D;
    static String S;

    public static void main(String[] args) {

    int a = 10;
    Integer A = 15;
        A.toString();

        System.out.println(a);
        System.out.println(A);
        System.out.println(d);
        System.out.println(D);
        System.out.println(S);

        System.out.println(A + A); //dva chisla dodayutsa
        System.out.println(A.toString() + A); //dva chisla vmeste

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Integer.sum(5,10);
        System.out.println(Integer.sum(5, 10));

        int c = 5;
        Integer.valueOf(c);
        System.out.println(Integer.valueOf(c));

        }


    }

