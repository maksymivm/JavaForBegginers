package homework_java_advance;

public class HomeWork4_part_5 {

    public static void main(String[] args) {

        String s = "Посмотрите как Рите нравится ритм";

        s = s.toLowerCase(); //perevod teksta v nizhiy registr

        int index = s.indexOf("рит");

        while (index != -1){
            System.out.println(index);
            index = s.indexOf("рит",index + 1);
            }
        }
    }
