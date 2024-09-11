import java.io.*;

public class ReverseNumbers2 {

    public static void main(String[] args) throws IOException {
        float numberOne, numberTwo, numberThree, numberFour;
        System.out.println(
                "Welcome to the Number Reverser Program! When you type in four numbers, they will be returned to you reversed!");

        numberOne   = readFloatNumber();
        numberTwo   = readFloatNumber();
        numberThree = readFloatNumber();
        numberFour  = readFloatNumber();

        System.out.println("Your first number is " + numberOne + ", your second number is " + numberTwo
                + ", your third number is " + numberThree + ", and your fourth number is " + numberFour + ".");
        System.out.println("Therefore, your numbers reversed are: " + numberFour + ", " + numberThree + ", " + numberTwo
                + ", and " + numberOne);

    }

    /**
     * Reads a float number from the user.
     *
     * @return The float number entered by the user.
     * @throws IOException If an I/O error occurs while reading the input.
     */
    public static float readFloatNumber() throws IOException {

        float floatNumber;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please type a number: ");
        floatNumber = Float.parseFloat(br.readLine());

        return floatNumber;
    }
}