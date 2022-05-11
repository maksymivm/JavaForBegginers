package homework_java_for_begginer;
// napisat algoritm CapitalizeWord, kotoriy prinimaet na vhod pridlozheniye z probelom mezhdy slovami
//i vozvrashchaet predlozheniye gde vse slova napisani z bolshoy bukvi
//happy birthday! -> Happy Birthday
//john jacob smith jr. -> John Jacob Smith Jr.

public class HW10 {

    public static String capitalizeWords(String sentence) {
        // pustoy String = "";
        // String str = null; - problema


        if (sentence != null) {
            sentence = sentence.trim(); // metod zaburae probilu pered i pislya rechenya !!! nichogo ne zaburae mizh slovamu

            //Character.toString(sentence.charAt(0)).toUpperCase(); //perevod pershoi bukvi u veliku
            if (sentence.length() != 0) {
                sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1); // perevelu pershu bukvu u veluku

                for (int i = 1; i < sentence.length(); i++) { // persha bukva vzhe zminena
                    if (sentence.charAt(i) == ' ') {
                        sentence = sentence.substring(0, i + 1)
                                + sentence.substring(i + 1, i + 2).toUpperCase()
                                + sentence.substring(i + 2);
                    }
                }
                return sentence;
                //System.out.println(sentence);

            }
        }
        return sentence;
    }


    public static void main(String[] args) {
        System.out.println(capitalizeWords("john jacob smith jr.   "));
    }
}
