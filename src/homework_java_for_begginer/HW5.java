package homework_java_for_begginer;

public class HW5 {


    public static void task(int a){
        System.out.println("****************** Task # " + a + " ******************");
    }

    public static void verifyEquals(double expectedResult, double actualResult){

        if (expectedResult == actualResult){
            System.out.println("TRUE");
        } else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {

        task(1);
    }


}
