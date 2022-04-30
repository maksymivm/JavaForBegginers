package homework_java_for_begginer;

public class Lesson5 {

    public static int returnMinOfThree(int a, int b, int c){ // mozhno pisat - number 1, number 2, number 3
        int min;

        if (a < b){
           min = a;
        } else {
            min = b;
        }
        if (min < c){

            return min;
            }
        else {
            min = c;

            return min;
        }
    }

    public static double average(int a, int b, int c){

        return ((double) a + b + c) / 3; // perevod a v tip double
    }

    public static double returnsAbs(double number){ //perevod chisla v polozhitelnoe
        if (number < 0){
            number = (-1) * number;
        }

        return number;
    }

    public static double countDifferenceBetweenMinAndAverage(int a, int b, int c){

        int min = returnMinOfThree( a, b, c);
        double average = average(a, b, c);

        double difference = min - average;

        if (difference < 0){
            difference = (-1) * difference;
        }

        return difference;

       // returnsAbs(min - average); perevod chisla v polozhitelnoe
    }

    public static String displayMassage(int a, int b, int c){
        String massage;
        if (countDifferenceBetweenMinAndAverage(a, b, c) > 3.51){
            massage = "Bolshoy rozbros chisel";
            //System.out.println(massage);
        }
        else {
            massage = "Malenkiy razbros chisel";
            //System.out.println(massage);
        }

        return massage;
    }

    public static void main(String[] args) {
    // dano 3 chisla
    // nayti maximalno tochny riznitsyu
    // mezhdu min chislom i srednim znacheniem
    //Esli raznitsa bolshe 3.51,
    //pokazat polzovatelyu soobshchenie "Bolshoy rozbros chisel"
    //inache pokazat soobshchenie "Malenkiy rozbros chisel"

    int a = 5;
    int b = 2;
    int c = 10;

        //System.out.println(returnMinOfThree(a, b, c));
        //System.out.println(average(a, b, c));

        System.out.println(displayMassage(a, b, c));


    }
}
