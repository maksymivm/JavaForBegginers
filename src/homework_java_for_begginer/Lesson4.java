package homework_java_for_begginer;

public class Lesson4 {

    public static void main(String[] args) {

        // kvadrat eto !krug

        String square = "kvadrat";
        String circle = "krug";

        System.out.println(square != circle);

        // Esli segodnya subota zavtra nedelya
        // Variant 1
        String today = "Segodnya Subota";

        if (today == "Segodnya Subota" ){
            String tomorrow = "Nedelya";
            }

        //Variant 2

        String tomorrow = "Nedelya";

        if (today == "Segodnya Subota" ){
            System.out.println(tomorrow);
        }

        //Variant 3

        String tomorrown;

        if (today == "Segodnya Subota" ){
            tomorrown = "Nedelya";
        }

        // esli a>b i b<c, to a prisvoit 7 i slozhit b i c inache prisvoit a 10

        int a = 9;
        int b = 12;
        int c = 13;


        if (a > b || b < c){
            a = 7;
            int sum = b + c;
            System.out.println(a + " " + sum);

            } else {
            a = 10;
            System.out.println(a);
                    }

    }
}
