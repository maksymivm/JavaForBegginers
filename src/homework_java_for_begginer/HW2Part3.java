package homework_java_for_begginer;

public class HW2Part3 {

    public static void main(String[] args) {
// deleniye na noll potomu oshibka nado izmenit tip peremennoy
        int a, b, c;
        a = 2;
        b = 3;
        c = 4;
        int x = 2;
        int y = 3;
        int d = y - x;
        int result21, result22, result23;

        result21 = (x + 3) * (x + 3);

        result22 = ((3 + (4 * x)) / 5) - ((10 * (y - 5) * (a + b + c)) / x) + (9 * (4 / x + (9 + x) / y));

        result23 = ((((5 * x) + (7 * y)) / ((8 * x) + (10 * y))) / (((3 * x - y) / (x + y))) / (a + b + (c / d)
                + ((a +b) / (c + d)) + (a * b)));
        System.out.println("___________________________");
        System.out.println("Task\t\t\t Result");
        System.out.println("21" + "\t\t" + "|" + "\t\t" + "  " + result21);
        System.out.println(result21);
        System.out.println(result22);
        System.out.println(result23);
    }
}
