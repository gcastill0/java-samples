import java.io.*;

public class NumberRound {

    public static void main(String[] args) throws IOException {
        double PI = 3.1415926535;

        double PI2 = Math.round(PI * 100.0) / 100.0;

        System.out.printf("\n\n");

        // PI 3.141593 is the original
        System.out.printf( "PI %f is the original\n", PI);

        // PI2 3.140000 is the calculated number to two decimal precision places
        System.out.printf( "PI2 %f is the calculated number to two decimal precision places\n", PI2);

        // PI2 3.14 displays to two decimal places
        System.out.printf( "PI2 %.2f displays to two decimal places\n", PI2);

        System.out.printf("\n\n");

    }

}