public class Power_R {

    // Power method: base^exp
    public static long power(int base, int exp) {
        
        // Clause : base or anything^0 = 1
        if (exp == 0) {  
            return 1;
        }

        // Calculate the next power
        long next = power(base, exp - 1);

        return base * next;  // recursive call
    }

    public static void main(String[] args) {
        int base = 4;
        int exponent = 4;
        long result = power(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
    }
}
