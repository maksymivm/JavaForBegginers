package homework_java_for_begginer;

public class HW10_2 {

    // task 1
    public static String checkSpace(String str) {

        if (str.length() != 0) {

            int count = str.length();
            str = str.trim();
            int countNew = str.length();

            if (count == countNew) {
                System.out.println("Probelov nebelo");
            } else {
                return "Probelu udalenu";
            }
        }

        return "";
    }

    //task2
    public static String removeAlla(String str){

        if(str.isEmpty() != true){
            str = str.replace("a", "");

            return str;
        }

        return "Stroka pustaya";
    }

    //task 3
    public static String removeAllZeros(String str){
        if(str.isEmpty() != true){
            str = str.trim();
            str = str.replace("0", " ");
            str = str.replace(" ", "");

            return str;
        }
        return "";
    }

    //task 4
    public static String removeAllSpaces(String str){
        if(str.isEmpty() != true){
            str = str.trim();
            str = str.replace(" ", "");
        }

        return str;
    }


    public static void main(String[] args) {

        utils.task(1);
        System.out.println(checkSpace("  jhjhchg jhkg kkg    "));

        utils.task(2);
        System.out.println(removeAlla("yguyfytzewajhghdwa"));

        utils.task(3);
        System.out.println(removeAllZeros("500 67 3 42 0 0 0 1"));

        utils.task(4);
        System.out.println(removeAllSpaces("Qa  4 Ever io ne"));
    }
}