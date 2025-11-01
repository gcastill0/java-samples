import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class WordSearchGenerator {

    public static void main(String[] args) throws IOException {

        // Use a single BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = 5;
        int max = 10;

        // User inputs
        String fileName = readFileName("Please enter the file name: ", br);
        int rows = readIntNumber("Enter the number of rows (10-20): ", min, max, br);
        int cols = readIntNumber("Enter the number of columns (10-20): ", min, max, br);

        // Data from file is organized as follows:

        // wordsInPuzzle[0] -> "this"
        // wordsInPuzzle[1] -> "test"
        // wordsInPuzzle[2] -> "file"
        // wordsInPuzzle[3] -> "contains"
        // wordsInPuzzle[4] -> "seven"
        // wordsInPuzzle[5] -> "words"
        // wordsInPuzzle[6] -> "inside"

        String wordsFromFile[] = getWordArray(fileName);

        // Assing the array of letters to the potential words in the puzzle
        // wordsInPuzzle[0] -> ['t','h','i','s']
        // wordsInPuzzle[1] -> ['t','e','s','t']
        // wordsInPuzzle[2] -> ['f','i','l','e']
        // wordsInPuzzle[3] -> ['c','o','n','t','a','i','n','s']
        // wordsInPuzzle[4] -> ['s','e','v','e','n']
        // wordsInPuzzle[5] -> ['w','o','r','d','s']
        // wordsInPuzzle[6] -> ['i','n','s','i','d','e']

        char wordsInPuzzle[][] = new char[wordsFromFile.length][];

        for (int i = 0; i < wordsInPuzzle.length; i++) {
            String word = wordsFromFile[i];
            char letters[] = getLetterArray(word);
            wordsInPuzzle[i] = letters;
        }

        // Sort the array becuse longer length words are more difficult to place
        // wordsInPuzzle[0] -> ['c','o','n','t','a','i','n','s']
        // wordsInPuzzle[1] -> ['i','n','s','i','d','e']
        // wordsInPuzzle[2] -> ['s','e','v','e','n']
        // wordsInPuzzle[3] -> ['w','o','r','d','s']
        // wordsInPuzzle[4] -> ['t','e','s','t']
        // wordsInPuzzle[5] -> ['f','i','l','e']
        // wordsInPuzzle[6] -> ['t','h','i','s']

        sortWordArray(wordsInPuzzle);

        // Test the array
        for (int i = 0; i < wordsInPuzzle.length; i++) {
            for (int j = 0; j < wordsInPuzzle[i].length; j++) {
                char letter = wordsInPuzzle[i][j];
                System.out.print(letter + " ");
            }
            System.err.println();
        }

        // Grid data
        char grid[][] = new char[rows][cols];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = ' ';
            }
        }

        for (int i = 0; i < wordsInPuzzle.length; i++) {
            int index = getRandomIndex(grid);
            getHorizonalTargets(index, rows, cols, wordsInPuzzle[i]);
        }
    }

    public static int getRandomIndex(char grid[][]) {

        int rows = grid.length;
        int cols = grid[0].length;
        int min = 0;
        int max = rows * cols;

        Random random = new Random();
        int randomIndex = random.nextInt(max - min + 1) + min;

        return randomIndex;
    }

    public static int[] getHorizonalTargets(int index, int rows, int cols, char letters[]) {
        int targets[] = new int[letters.length];

        int col = index % cols;
        int row = index / rows;

        int proof = row * cols + col;

        System.out.print("Target Index: " + index + "\tcol: " + col + "\trow: " + row + "\tproof: " + proof + "\t");

        for (int i = 0; i < letters.length; i++, col++) {
            targets[i] = row * cols + col;
            System.out.print(row + ":" + col + " \tTarget: " + targets[i] + " -> " + letters[i] + " ");
        }

        System.out.println();

        return targets;
    }

    public static int[] getVerticalTargets(int index, int rows, int cols, char letters[]) {
        int targets[] = new int[letters.length];

        int col = index % cols;
        int row = index / rows;

        int proof = row * cols + col;

        System.out.println("Target Index: " + index + "\tcol: " + col + "\trow: " + row + "\tproof: " + proof + "\t");

        for (int i = 0; i < letters.length; i++, row++) {
            targets[i] = row * cols + col;
            System.out.print(row + ":" + col + " -> " + letters[i] + " Target: " + targets[i] + "\t");
        }

        System.out.println();
        System.out.println();

        return targets;
    }

    public static boolean isGridSpaceAvailable(char grid[][], int targets[]) {
        boolean availability = false;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < targets.length; i++) {
            int index = targets[i];
            int col = index % cols;
            int row = index / rows;

            if (col < 0 || col >= cols || row < 0 || row >= rows)
                return availability;
            if (grid[row][col] == ' ')
                availability = true;
        }

        return availability;
    }

    public static char[] getLetterArray(String word) {
        char letters[] = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            letters[i] = Character.toUpperCase(letter);
        }

        return letters;
    }

    public static void sortWordArray(String wordsFromFile[]) {

        for (int i = 0; i < wordsFromFile.length - 1; i++) {
            for (int j = i + 1; j < wordsFromFile.length; j++) {
                if (wordsFromFile[i].length() < wordsFromFile[j].length()) {
                    String temp = wordsFromFile[i];
                    wordsFromFile[i] = wordsFromFile[j];
                    wordsFromFile[j] = temp;
                }
            }
        }

    }

    public static void sortWordArray(char wordsInPuzzle[][]) {

        for (int i = 0; i < wordsInPuzzle.length - 1; i++) {
            for (int j = i + 1; j < wordsInPuzzle.length; j++) {
                if (wordsInPuzzle[i].length < wordsInPuzzle[j].length) {
                    char temp[] = wordsInPuzzle[i];
                    wordsInPuzzle[i] = wordsInPuzzle[j];
                    wordsInPuzzle[j] = temp;
                }
            }
        }

    }

    public static String[] getWordArray(String fileName) throws IOException {
        int wordArrayLength = 0;

        try (
                FileReader fileInput = new FileReader(fileName);
                BufferedReader reader = new BufferedReader(fileInput)) {
            String line;
            while ((line = reader.readLine()) != null) {
                wordArrayLength++;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        String wordArray[] = new String[wordArrayLength];

        try (
                FileReader fileInput = new FileReader(fileName);
                BufferedReader reader = new BufferedReader(fileInput)) {
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null) {
                wordArray[index] = line;
                index++;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return wordArray;
    }

    public static String readFileName(String message, BufferedReader br) throws IOException {
        String defaultFileName = "input.txt";

        try {
            System.out.print(message);
            String fileName = br.readLine();

            if (fileName == null || fileName.trim().isEmpty()) {
                System.out.println("File is empty. Using default file " + defaultFileName);
                fileName = defaultFileName;
            }

            return fileName;

        } catch (IOException e) {
            System.err.println("Error getting file name: " + e.getMessage());
            return defaultFileName;
        }
    }

    public static int readIntNumber(String message, int min, int max, BufferedReader br) throws IOException {

        int number = -99;

        while (true) {
            try {
                System.out.print(message);
                number = Integer.parseInt(br.readLine());
                if (number >= min && number <= max)
                    break;
                System.out.format("Entere a value between %d and %d.\n", min, max);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid whole number.");
            }
        }

        return number;
    }

}
