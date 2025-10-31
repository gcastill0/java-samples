import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordSearchGenerator {

    public static void main(String[] args) throws IOException {

        // Use a single BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = 10;
        int max = 20;

        // User inputs
        String fileName = readFileName("Please enter the file name: ", br);
        int rows = readIntNumber("Enter the number of rows (10-20): ", min, max, br);
        int cols = readIntNumber("Enter the number of columns (10-20): ", min, max, br);

        // Data
        String wordsFromFile[] = getWordArray(fileName);
        char wordsInPuzzle[][] = new char[wordsFromFile.length][];

        // Assing the array of letters to the potential words in the puzzle
        // letters[0] -> ['t','h','i','s']
        // letters[1] -> ['t','e','s','t']
        // letters[2] -> ['f','i','l','e']
        // letters[3] -> ['c','o','n','t','a','i','n','s']
        // letters[4] -> ['s','e','v','e','n']
        // letters[5] -> ['w','o','r','d','s']
        // letters[6] -> ['i','n','s','i','d','e']

        for (int i = 0; i < wordsInPuzzle.length; i++) {
            String word = wordsFromFile[i];
            char letters[] = getLetterArray(word);
            wordsInPuzzle[i] = letters;
        }

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
    }

    public static boolean isGridSpaceAvailable(char grid[][], int targets[][]) {
        boolean availability = true;

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length; j++) {
                if (grid[i][j] != ' ') availability = false;
            }
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
