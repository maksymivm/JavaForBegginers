package homework_java_advance;

public class HomeWork5_3 {

    public static void main(String[] args) {

        int i, j;
        //int n = 10;

        for (i = 9; i >= 0; i--) {
           System.out.println();

            for (j = 0; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
                }

            }
        System.out.println();

        for (i = 9; i >= 0; i--) {
            for (j = i; j < 9; j++) {
                System.out.print("  ");
            }

            for (j = 0; j <= i ;j ++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }



        for (i = 9; i >= 0; i--) {
            for (j = i; j < 9; j++) {
                System.out.print("  ");
            }

            for (j = i; j >= 0 ;j --){
                System.out.print(j);
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }









    }
}



