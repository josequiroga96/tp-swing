package otroTpMediciones;

import java.util.ArrayList;

/**
 * Created by JoseRojas on 18/3/17.
 */
public class Levenshtein2 {
    private static String word1 = "Hello";
    private static String word2 = "World!";
    private static ArrayList<Character> word3 = new ArrayList<Character>();
    private static int changes = 0;


    public static void inicialitation(){
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        for(int i = 0; i<word1.length(); i++)
            word3.add(i, word1.charAt(i));
        analyze();
        printChanges();
        printWord3();
    }

    private static void printChanges() {
        System.out.println(changes);
    }

    private static void printWord3() {
        String w3="";
        for(int i =0; i < word3.size(); i++)
            w3 = w3 + word3.get(i);
        System.out.println(w3);
    }

    private static void analyze(){
        if(word1.length() < word2.length()) //tengo que utilizar sustitucion e insercion
            word1Less();
        if(word1.length() > word2.length())  //tengo que utilizar sustitucion y eliminacion
            word1High();
        if(word1.length() == word2.length())
            wordEqual();
    }

    private static void substitution(int i){
        word3.set(i, word2.charAt(i)); changes++;
    }

    private static void insert(){
        for(int j = word1.length(); j < word2.length(); j++) {
            word3.add(j, word2.charAt(j));
            changes++;
        }
    }

    private static void remove(){
        for(int j = 0; j < (word1.length()- word2.length()); j++) {
            word3.remove(word1.length() - 1 - j);
            changes++;
        }
    }

    private static void word1Less(){
        insert();
        for(int i = 0; i < word1.length(); i++)
            if (word1.charAt(i) != word2.charAt(i))
                substitution(i);
    }

    private static void word1High(){
        remove();
        for(int i = 0; i < word2.length(); i++)
            if (word1.charAt(i) != word2.charAt(i))
                substitution(i);
    }

    private static void wordEqual(){
        for(int i = 0; i < word1.length(); i++)
            if(word1.charAt(i) != word2.charAt(i))
                substitution(i);
    }
}
