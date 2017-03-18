package otroTpMediciones;

/**
 * Created by JoseRojas on 18/3/17.
 */
public class Hamming2 {
    private static String word1 = "Hello";
    private static String word2 = "World!";
    private static int changes = 0;

    public static void inicialitation(){
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        toSize();
        System.out.println(changes);
    }

    private static void toSize(){
        if((word2.length()>word1.length()) || (word1.length() == word2.length())) {
            for(int i = 0; i < word1.length(); i++)
                if(word1.charAt(i) != word2.charAt(i))
                    changes++;
            int a = word2.length() - word1.length();
            changes = changes + a;
        }
        if(word1.length()>word2.length()) {
            for(int i = 0; i < word2.length(); i++)
                if(word2.charAt(i) != word1.charAt(i))
                    changes++;
            int a = -word2.length() + word1.length();
            changes = changes + a;
        }
    }
}
