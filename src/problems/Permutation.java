package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation("", "ABC");

    }

    public static void permutation(String fx, String st){
        int x = st.length();

        if(x==0){
            System.out.println(fx);
        }else{
            for(int i = 0; i < x; i++){
                permutation(fx+st.charAt(i), st.substring(0,i) + st.substring(i + 1, x));
            }
        }
    }
}