package problems;
/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
//Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
//same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String w1 = "MARY";
        String w2 = "ARMY";

        checkIfAnagram(w1, w2);
    }

    private static void checkIfAnagram(String word1, String word2) {
        if (isAnagram(word1, word2) == true) {
            System.out.println(word1 + " " + word2 +" are Anagrams");       //if its an anagram it will print the if statement
        } else {
            System.out.println(word1 + " " + word2 + " are not Anagram");   //if its not an anagram it will print else statement
        }
    }
    public static boolean isAnagram(String word1, String word2) {
        if (word1.length()!= word2.length()) {
            return false;
        }
        char[] chars = word1.toCharArray();
        for (char x : chars) {
            int index = word2.indexOf(x);
            if (index != -1) {
                word2 = word2.substring(0, index) + word2.substring(index + 1, word2.length());
            } else {
                return false;
            }
        }
        return word2.isEmpty();
    }

}