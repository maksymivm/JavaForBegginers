package homework_java_advance;

public class HomeWork4_part_6 {

    public static void main(String[] args) {

        String[][] array = {{"Привет", "всем", "кто" }, {"изучает", "язык", "программирования" }, {"java" }};

        int count = 0;

        for (int i = 0; i < array.length; i = i + 1) {
            for (int j = 0; j < array[i].length; j = j + 1) {
                if (!array[i][j].contains("е")) {
                    count = count + 1;
                }
            }
        }
        System.out.println(count);
    }
}
