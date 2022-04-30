package homework_java_advance;

public class HomeWork4_part_4 {

    public static void main(String[] args) {

        String s = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                count = count + 1;
            }
        }
        System.out.println("Kolichestvo bukv e = " + count);
    }
}
