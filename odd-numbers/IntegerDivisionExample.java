public class IntegerDivisionExample {

    /** Determine if a number is even 
     * @param number is the value to evaluate
     * 
     * @return true if the number is even, 
     * false is the number is odd
     * 
     * Use the logic of number - [ ( number / 2 ) * 2 )
     * where the division of an integer truncates
     * the decimal value, givin a whole number.
     * 
     * NOTE that we say "truncate", not "round-off" 
     * 
     * For instance, given a number = 5, 
     * 5 - ((5/2) * 2) -> 5 - (2 * 2) -> 5 - 4 -> 1.
     * 
     * Also, number = 4 
     * 4 - ((4/2) * 2) -> 4 - (2*2) -> 4 - 4 -> 0
     * 
     * If the value difference is zero, then the
     * number is even. Otherwise, the number is odd.
    */
    public static boolean isEven(int number) {

        int half = number / 2;
        int whole = half * 2;
        int diff = number - whole;

        if (diff == 0) return true;

        return false;
    }

    public static void main(String[] args) {

        int[] numbers  = { 7, 2, 5, 6, 1, 3, 4 };

        for (int number: numbers) {

            if (isEven(number)) {
              System.out.println(number + " is even");
            } else {
              System.out.println(number + " is odd");
            }

        }
    }
}