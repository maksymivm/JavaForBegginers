package homework_java_for_begginer;

public class Lesson7 {

    public static void main(String[] args) {

        // obiekt tipa String
        String catName = "Rizhik";

        // yacheyka pamyati tipa String-masiv
        String[] catsNames;

        // obiekt tipa String-masiv iz 8 yacheyek
        catsNames = new String[8];
        catsNames[4] = "Rizhik";
        catsNames[1] = "Gavrilo";
        catsNames[6] = "Rizhik";

        // obiekt tipa int masive
        int[] catsAges = new int[8];

        System.out.println(catName);
        System.out.println(catsNames); // ne korektno

        System.out.println(catsNames[0]);
        System.out.println(catsNames[7]);
        System.out.println(catsAges[2]);

        for (int i = 0; i <= 7; i++){
            System.out.println(catsNames[i]);
        }

        for (int i = 0; i < 8; i++){
            if (catsNames[i] == "Rizhik"){
                System.out.println(catsNames[i]);
            }
        }

        for (int i = 0; i < 8; i++){
            if (catsNames[i] == "Rizhik"){
                System.out.println(i);
            }
        }

        System.out.println(catsNames.length); // dlina masiva


    }
}
