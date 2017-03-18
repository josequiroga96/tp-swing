package otroTpMediciones;

/**
 * Created by JoseRojas on 18/3/17.
 */
public class Hamming {
    private static String word1 = "Hello";
    private static String word2 = "World";
    private static int changes = 0;

    public static void inicialitation(){ //word1 y word2 tienen que ser del mismo tamaño
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        for(int i = 0; i < word1.length(); i++)
            if(word1.charAt(i) != word2.charAt(i))
                changes++;

        System.out.println(changes);
    }
}
