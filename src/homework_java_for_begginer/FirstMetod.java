package homework_java_for_begginer;

public class FirstMetod {

public static void printEmptyLine() {
        System.out.println("____________________________");
    }

    static int num = 1;

    public static void task (int num){
        System.out.println("Zadacha" + num);
        num++;
    }

    public static void print(String text){
        System.out.println(text);
    }

    public static void main(String[] args) {

        printEmptyLine();

        //print();

        task(num);

        task(num);
    }
}
