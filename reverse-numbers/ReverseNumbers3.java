import java.io.*;

public class ReverseNumbers3 {

    public static void main(String[] args) throws IOException {

        float numbers[] = new float[4];

        System.out.println(
                "Welcome to the Number Reverser Program! When you type in four numbers, they will be returned to you reversed!");

        for (int i = 0; i < 4; i++) {
            numbers[i] = readFloatNumber();
        }

        System.out.println(
            "Your first number is " + numbers[0] + 
            ", your second number is " + numbers[1] +
            ", your third number is " + numbers[2] + 
            ", and your fourth number is " + numbers[3] + ".");

        System.out.println("Therefore, your numbers reversed are: " + 
            numbers[3] + ", " + 
            numbers[2] + ", " + 
            numbers[1] + ", and " + 
            numbers[0]);

    }

    public static float readFloatNumber() throws IOException {

        float floatNumber;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please type a number: ");
        floatNumber = Float.parseFloat(br.readLine());

        return floatNumber;
    }
}