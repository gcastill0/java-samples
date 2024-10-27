import java.io.*;

public class ReverseNumbers4 {

    /**
     * The main method of the ReverseNumbers3 class.
     * This method reads four float numbers from the user and prints them in reverse order.
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
        for (int i = 0; i < 4; i++) {
            numbers[i] = readFloatNumber();
        }

        /* Show the user each number in the array */
        System.out.println(
            "Your first number is " +        numbers[0] + 
            ", your second number is " +     numbers[1] +
            ", your third number is " +      numbers[2] + 
            ", and your fourth number is " + numbers[3] + ".");

        /* Show numbers in the array in reverse order*/
        System.out.println("Therefore, your numbers reversed are: " + 
            numbers[3] + ", " + 
            numbers[2] + ", " + 
            numbers[1] + ", and " + 
            numbers[0]);

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

        while(true) {
            try {
                System.out.println("Please type a number: ");
                floatNumber = Float.parseFloat(br.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid float number.");
            }
    
        }

        return floatNumber;
    }
}