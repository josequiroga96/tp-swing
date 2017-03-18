package otroTpMediciones;

/**
 * Created by JoseRojas on 18/3/17.
 */
public class Levenshtein {
    private static String word1 = "Hello";
    private static String word2 = "World!";
    private static int changes = 0;

    public static void inicialitation(){
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        if((word2.length() > word1.length()) || (word1.length() == word2.length())) {
            changes = word2.length()-word1.length();
            char[] w1 = new char[word2.length()];
            for (int i = 0; i < word1.length(); i++) {
                w1[i] = word1.charAt(i);
                for(int j = word1.length(); j < word2.length(); j++) {
                    w1[j] = word2.charAt(j);
                }
                if(word1.charAt(i) != word2.charAt(i)){
                    w1[i] = word2.charAt(i);
                    changes++;
                }
            }
            System.out.println(changes);
            for(int i = 0; i< word2.length(); i++)
                System.out.println(w1[i]);
        }

        if((word2.length() < word1.length())) {
            changes = word1.length()-word2.length();
            char[] w1 = new char[word1.length()];
            for (int i = 0; i < word2.length(); i++) {
                w1[i] = word1.charAt(i);
                for(int j = word2.length(); j < word1.length(); j++) {
                    w1[j] = 7;
                }
                if(word1.charAt(i) != word2.charAt(i)){
                    w1[i] = word2.charAt(i);
                    changes++;
                }
            }
            System.out.println(changes);
            for(int i = 0; i< word1.length(); i++)
                System.out.println(w1[i]);
        }
    }
}
