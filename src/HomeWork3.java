public class HomeWork3 {
    public static void main(String[] args) {
        int a = 11;
        int b = 20;
        System.out.println(a + b);
        System.out.println(b - a);
        System.out.println(a * b);
        System.out.println(b / a);
        System.out.println(b % a);

        if (a % 2 == 0) {
            System.out.println("chislo "+ a +" chetnoe");
        } else {
            System.out.println("chislo "+a+" ne chotnoe");
        }

        if (b % 2 == 0) {
            System.out.println("chislo "+b+" chotnoe");
        } else {
            System.out.println("chislo "+b+" ne chotnoe");
        }

    }
}
