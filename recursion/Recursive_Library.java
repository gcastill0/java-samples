public class Recursive_Library {

    // Power method: base^exp
    public static long power(int base, int exp) {

        // Clause : base or anything^0 = 1
        if (exp == 0) {
            return 1;
        }

        // Calculate the next power
        long next = power(base, exp - 1);

        return base * next; // recursive call
    }

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
        int base = 4;
        int exponent = 4;
        long power_result = power(base, exponent);
        System.out.println(base + "^" + exponent + " = " + power_result);

        long factorial_result = factorial(base);
        System.out.println("Factorial of " + base + " is: " + factorial_result);
    }

}
