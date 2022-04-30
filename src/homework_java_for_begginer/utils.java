package homework_java_for_begginer;

public class utils {

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
}
