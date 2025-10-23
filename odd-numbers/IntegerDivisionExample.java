public class IntegerDivisionExample {

    public static boolean isEven(int number) {

        int half = number / 2;
        int whole = half * 2;
        int diff = number - whole;

        if (diff == 1) return false;

        return true;
    }

    public static void main(String[] args) {

        int[] numbers  = { 7, 2, 5, 6, 1, 3, 4 };

        for (int number: numbers) {
            System.out.println("Is " + number + " even? -> " + isEven(number));
        }
    }
}