public class IntegerDivisionExample {
    public static void main(String[] args) {
        int number = 5;
        int result = number / 2; // result will be 2 (2.5 is truncated to 2)
        System.out.println("Result of integer division: " + result); 

        int anotherNumber = 6;
        int anotherResult = anotherNumber / 2; // anotherResult will be 3
        System.out.println("Result of integer division: " + anotherResult);
    }
}