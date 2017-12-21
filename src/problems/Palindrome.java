
package problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String w1 = "LEVEL";
        chckPalindrome(w1);

    }

    public static void chckPalindrome(String wrd){
        String x = wrd.toLowerCase();
        String reverse = "";

        for(int i = x.length()-1; i >= 0; i--){
            reverse = reverse + x.charAt(i);
        }

        if (x.equals(reverse)){
            System.out.println("Level is a palindrome");
        }else{
            System.out.println("Level is not a palindrome");
        }

    }

}