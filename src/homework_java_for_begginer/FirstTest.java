package homework_java_for_begginer;

public class FirstTest {

    public static void main(String[] args) {

        //proverte chislo
        //esli chislo nechetnoe i kratno 3
        //poschitayte rezult deleniya na 3
        //inache poschitayte rezult umnozheniya  na 3
        //esli chislo ne nechyotnoe poschitayte proizvedenie chisla na rez deleniya na 2

        // vivedite rez rabotu algoritma na pechat
        // nayti blok shemu v prezentacii sootvetstvuyushchuy

        //napisat tekst kotoriy proverit robotu koda i vivedit na pechatrez proverki
        //testovie danie 23, 44, 21

        //AAA


        int n = 23;
        int expectedResult = 69; // 23 * 3

        if (n % 2 != 0) {
            if (n % 3 == 0) {
                n = n / 3;
            } else {
                n = n * 3;
            }
        } else {
            n = n * (n / 2);
        }

        System.out.println(n);

        // Test
        if (expectedResult == n) {
            System.out.println("\u001B[32m" + "Pass");
        } else {
            System.out.println("\u001B[31m" + "Fail");
        }


    }

}

