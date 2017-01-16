/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
 */
//imports for BufferedReader
import java.util.Scanner;

public class SumTest {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
        */
        Scanner s = new Scanner(System.in);
        int Num = s.nextInt();
        for (int i = 0; i < Num; i++) {
            double n1=s.nextDouble();
            double n2=s.nextDouble();
            double sum=n1+n2;
            System.out.println("Sum of two numbers are "+sum);
        }
        s.close();

    }
}
