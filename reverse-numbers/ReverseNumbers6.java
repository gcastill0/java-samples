import java.io.*;

public class ReverseNumbers5 {

    /**
     * The main method of the ReverseNumbers3 class.
     * This method reads four float numbers from the user and prints them in reverse
     * order.
     *
     * @param args The command-line arguments passed to the program.
     * @throws IOException If an I/O error occurs while reading the numbers.
     */
    public static void main(String[] args) throws IOException {

        /* Use an array of four (4) float numbers */
        float numbers[] = new float[4];

        System.out.println(
                "Welcome to the Number Reverser Program! When you type in four numbers, they will be returned to you reversed!");

        /* Use a loop to read four (4) times and assign to each number in the array */
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = readFloatNumber();
        }

        /* Show the user each number in the array */
        printNumbers(numbers);

        /* Show numbers in the array in reverse order */
        printNumbersInReverse(numbers);

    }

    /**
     * Prints the numbers in the order they were entered.
     *
     * @param numbers an array of float numbers to be printed
     */
    public static void printNumbers(float[] numbers) {
        System.out.println("\nHere are the numbers in the order you entered them: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    /**
     * Prints the elements of the given array of floats in reverse order.
     *
     * @param numbers an array of float numbers to be printed in reverse order
     */
    public static void printNumbersInReverse(float[] numbers) {
        System.out.println("\nHere are the numbers in the reverse order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }

    /**
     * Reads a float number from the user.
     *
     * @return The float number entered by the user.
     * @throws IOException If an I/O error occurs while reading the input.
     */
    public static float readFloatNumber() throws IOException {

        float floatNumber = (float) 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.print("Please type a number: ");
                floatNumber = Float.parseFloat(br.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid float number.");
            }

        }

        return floatNumber;
    }
}