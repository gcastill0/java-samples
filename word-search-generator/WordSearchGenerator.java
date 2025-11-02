import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class WordSearchGenerator {

    public static int HORIZONTAL = 0;
    public static int VERTICAL = 1;
    public static int DIAGONAL_LR = 2;
    public static int DIAGONAL_RL = 3;

    public static void main(String[] args) throws IOException {

        // Use a single BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = 10;
        int max = 20;

        // User inputs
        String fileName = "input.txt";// readFileName("Please enter the file name: ", br);
        int rows = 10;// readIntNumber("Enter the number of rows (10-20): ", min, max, br);
        int cols = 10;// readIntNumber("Enter the number of columns (10-20): ", min, max, br);

        // Data from file is organized as follows:
        // wordsFromFile[0] -> "THIS"
        // wordsFromFile[1] -> "TEST"
        // wordsFromFile[2] -> "FILE"
        // wordsFromFile[3] -> "CONTAINS"
        // wordsFromFile[4] -> "SEVEN"
        // wordsFromFile[5] -> "WORDS"
        // wordsFromFile[6] -> "INDIDE"

        String wordsFromFile[] = getWordArray(fileName);

        // Sort the array becuse longer length words are more difficult to place
        // wordsFromFile[0] -> "CONTAINS"
        // wordsFromFile[1] -> "INDIDE"
        // wordsFromFile[2] -> "SEVEN"
        // wordsFromFile[3] -> "WORDS"
        // wordsFromFile[4] -> "FILE"
        // wordsFromFile[5] -> "TEST"
        // wordsFromFile[6] -> "THIS"

        sortWordArray(wordsFromFile);

        // Grid data. Start with empty characters.
        char grid[][] = new char[rows][cols];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = ' ';
            }
        }

        Random random = new Random();

        for (int i = 0; i < wordsFromFile.length; i++) {
            String word = wordsFromFile[i];
            int index = randomIndexPosition(grid, word);
            int mode = random.nextInt(4);
            boolean fit = false;

            String wordInGrid = word;

            int choice = random.nextInt(2); // Generates 0 or 1
            if (choice == 0) {
                StringBuilder stringBuilder = new StringBuilder(word);
                wordInGrid = stringBuilder.reverse().toString();
            }

            switch (mode) {
                case 0:
                    fit = getVerticalTargets(index, grid, wordInGrid);
                    break;
                case 1:
                    fit = getHorizontalTargets(index, grid, wordInGrid);
                    break;
                case 2:
                    fit = getDiagonalTargetsRL(index, grid, wordInGrid);
                    break;
                case 3:
                    fit = getDiagonalTargetsLR(index, grid, wordInGrid);
                    break;
            }

            if (fit) {
                addWordToGrid(index, grid, wordInGrid, mode);
            }
        }

        displayGrid(grid);

    }

    public static void addWordToGrid(int index, char grid[][], String wordInGrid, int mode) {
        int rows = grid.length;
        int cols = grid[0].length;

        int row = index / rows;
        int col = index % cols;

        switch (mode) {
            case 0:
                for (int i = 0; i < wordInGrid.length(); i++, row++) {
                    grid[row][col] = wordInGrid.charAt(i);
                }
                break;
            case 1:
                for (int i = 0; i < wordInGrid.length(); i++, col++) {
                    grid[row][col] = wordInGrid.charAt(i);
                }
                break;
            case 2:
                col = col + wordInGrid.length() - 1;
                for (int i = 0; i < wordInGrid.length(); i++, row++, col--) {
                    grid[row][col] = wordInGrid.charAt(i);
                }
                break;
            case 3:
                for (int i = 0; i < wordInGrid.length(); i++, row++, col++) {
                    grid[row][col] = wordInGrid.charAt(i);
                }
                break;

        }
    }

    public static void addWordToGrid(int index, char grid[][], String word) {
        int rows = grid.length;
        int cols = grid[0].length;

        int row = index / rows;
        int col = index % cols;

        for (int i = 0; i < word.length(); i++, col++) {
            grid[row][col] = word.charAt(i);
        }
    }

    public static int randomIndexPosition(char grid[][], String word) {
        int index;
        int word_length = word.length();

        int grid_horizontal_boundary = grid.length - word_length;
        int grid_vertical_boundary = grid[0].length - word_length;

        Random random = new Random();
        int target_col = random.nextInt(grid_horizontal_boundary) + 1;
        int target_row = random.nextInt(grid_vertical_boundary) + 1;

        index = target_col * grid.length + target_row;

        return index;
    }

    public static void displayGrid(char grid[][]) {

        System.out.print("   ");
        for (int i = 0; i < grid[0].length; i++) {
            System.out.printf(" %2d ", i);
        }
        System.out.println();

        for (int i = 0; i < grid.length; i++) {
            System.out.print("   ");
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print("|---");
            }
            System.out.println("|");
            System.out.printf("%2d ", i);
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print("| " + grid[i][j] + " ");
            }
            System.out.println("|");
        }

        System.out.print("   ");
        for (int i = 0; i < grid[0].length; i++) {
            System.out.print("|---");
        }
        System.out.println("|");
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

    public static boolean getHorizontalTargets(int index, char grid[][], String word) {
        boolean fit = false;
        int rows = grid[0].length;
        int cols = grid[0].length;

        int row = index / rows;
        int col = index % cols;
        int matches = 0;

        // If we are moving horizontally, the row does not change
        // If we are moving horizontally, the column changes by one

        for (int i = 0; i < word.length(); i++, col++) {
            char letter = word.charAt(i);
            char cell = grid[row][col];
            if (cell == ' ' || cell == letter)
                matches++;
        }

        if (matches == word.length())
            fit = true;

        return fit;
    }

    public static boolean getVerticalTargets(int index, char grid[][], String word) {
        boolean fit = false;
        int rows = grid[0].length;
        int cols = grid[0].length;

        int row = index / rows;
        int col = index % cols;
        int matches = 0;

        // If we are moving vertically, the column does not change
        // If we are moving vertically, the row changes by one

        for (int i = 0; i < word.length(); i++, row++) {
            char letter = word.charAt(i);
            char cell = grid[row][col];
            if (cell == ' ' || cell == letter)
                matches++;
        }

        if (matches == word.length())
            fit = true;

        return fit;
    }

    public static boolean getDiagonalTargetsLR(int index, char grid[][], String word) {
        boolean fit = false;
        int rows = grid[0].length;
        int cols = grid[0].length;

        int row = index / rows;
        int col = index % cols;
        int matches = 0;

        // If we are moving horizontally, the column changes by one
        // If we are moving vertically, the row changes by one

        for (int i = 0; i < word.length(); i++, row++, col++) {
            char letter = word.charAt(i);
            char cell = grid[row][col];
            if (cell == ' ' || cell == letter)
                matches++;
        }

        if (matches == word.length())
            fit = true;

        return fit;
    }

    public static boolean getDiagonalTargetsRL(int index, char grid[][], String word) {
        boolean fit = false;
        int rows = grid[0].length;
        int cols = grid[0].length;

        int row = index / rows;
        int col = index % cols;
        int matches = 0;

        // If we are moving horizontally, the column changes by one
        // If we are moving vertically, the row changes by one

        col = col + word.length() - 1;

        for (int i = 0; i < word.length(); i++, row++, col--) {
            char letter = word.charAt(i);
            char cell = grid[row][col];
            if (cell == ' ' || cell == letter)
                matches++;
        }

        if (matches == word.length())
            fit = true;

        return fit;
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
                wordArray[index] = line.toUpperCase();
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
