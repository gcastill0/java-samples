import java.io.*;

public class ReverseNumbers {

    public static void main(String[] args) throws IOException {
        float numberOne, numberTwo, numberThree, numberFour;
        System.out.println(
                "Welcome to the Number Reverser Program! When you type in four numbers, they will be returned to you reversed!");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please type your first number: ");
        numberOne = Float.parseFloat(br.readLine());
        System.out.println("Please type your second number: ");
        numberTwo = Float.parseFloat(br.readLine());
        System.out.println("Please type your third number: ");
        numberThree = Float.parseFloat(br.readLine());
        System.out.println("Please type your fourth number: ");
        numberFour = Float.parseFloat(br.readLine());
        System.out.println("Your first number is " + numberOne + ", your second number is " + numberTwo
                + ", your third number is " + numberThree + ", and your fourth number is " + numberFour + ".");
        System.out.println("Therefore, your numbers reversed are: " + numberFour + ", " + numberThree + ", " + numberTwo
                + ", and " + numberOne);

    }
}