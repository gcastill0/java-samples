public class Factorial_R {

    // Recursive method
    public static long factorial(int n) {

        // Clause or condition
        if (n == 0 || n == 1) {  
            return 1;
        }

        // recursive call
        long next = factorial(n - 1);  

        // multiply current number against the next one
        return n * next;  
    }

    public static void main(String[] args) {
        int number = 4;
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
