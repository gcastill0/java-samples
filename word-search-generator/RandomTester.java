import java.util.Random;

public class RandomTester {

    public static int HORIZONTAL = 0;
    public static int VERTICAL = 1;
    public static int DIAGONAL = 2;

    public static void main(String[] args) {

        int tester[] = new int[3];

        tester[HORIZONTAL] = 0;
        tester[VERTICAL] = 0;
        tester[DIAGONAL] = 0;

        Random random = new Random();

        // System.out.println(tester.length);

        int modes = tester.length;

        for (int i = 0; i < 100; i++) {
            int idx = random.nextInt(modes);
            // System.out.println(idx);
            tester[idx]++;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(i + " " + tester[i]);
        }
    }

}