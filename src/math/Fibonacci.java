package math;

public class Fibonacci {
    public static void main(String[] args) {
        int next = 0;
        int prev = 1;
        for(int i=0; i<40; i++){
            System.out.println(next);
            next = next + prev;
            prev = next - prev;
        }
        /*
          Write 40 Fibonacci numbers with java.
         */

    }
}
