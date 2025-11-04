import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class WordSearchGenerator {

    /**
     * Application entry point. Reads inputs, generates a word search grid, places
     * words, and prints the final puzzle.
     * 
     * @param args Command-line arguments. Not required for typical interactive use.
     * @throws IOException if reading user input or the source word file fails.
     */
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
                case Constants.VERTICAL:
                    fit = getVerticalTargets(index, grid, wordInGrid);
                    break;
                case Constants.HORIZONTAL:
                    fit = getHorizontalTargets(index, grid, wordInGrid);
                    break;
                case Constants.DIAGONAL_LR:
                    fit = getDiagonalTargetsRL(index, grid, wordInGrid);
                    break;
                case Constants.DIAGONAL_RL:
                    fit = getDiagonalTargetsLR(index, grid, wordInGrid);
                    break;
            }

            if (fit) {
                addWordToGrid(index, grid, wordInGrid, mode);
            }
        }

        saveGrid(grid);
        displayGrid(grid);

    }

    /**
     * Attempt to place a single word into the grid starting at a linear index using
     * a specified orientation.
     * <p>
     * Computes row and column from the linear index (index = row * columnCount +
     * col).
     * <p>
     * Validates that the path fits and that each cell is either empty or already
     * matches the required letter.
     * <p>
     * On success, writes letters into empty cells and leaves matching overlaps
     * intact; otherwise the grid is unchanged.
     * 
     * @param index      Zero-based linear start position (row * columnCount + col).
     * @param grid       Puzzle grid. Filled cells contain letters; empty cells
     *                   contain a placeholder such as '.'.
     * @param wordInGrid Word to place. Must be non-null and length ≥ 1.
     * @param mode       Direction constant: HORIZONTAL, VERTICAL, DIAGONAL_LR
     *                   (down-right), or DIAGONAL_RL (down-left).
     */
    public static void addWordToGrid(int index, char grid[][], String wordInGrid, int mode) {
        int rows = grid.length;
        int cols = grid[0].length;

        int row = index / rows;
        int col = index % cols;

        switch (mode) {
            case Constants.VERTICAL:
                for (int i = 0; i < wordInGrid.length(); i++, row++) {
                    grid[row][col] = wordInGrid.charAt(i);
                }
                break;
            case Constants.HORIZONTAL:
                for (int i = 0; i < wordInGrid.length(); i++, col++) {
                    grid[row][col] = wordInGrid.charAt(i);
                }
                break;
            case Constants.DIAGONAL_LR:
                col = col + wordInGrid.length() - 1;
                for (int i = 0; i < wordInGrid.length(); i++, row++, col--) {
                    grid[row][col] = wordInGrid.charAt(i);
                }
                break;
            case Constants.DIAGONAL_RL:
                for (int i = 0; i < wordInGrid.length(); i++, row++, col++) {
                    grid[row][col] = wordInGrid.charAt(i);
                }
                break;

        }
    }

    /**
     * Find a random valid starting position for the given word in the current grid.
     * <p>
     * Enumerates all legal placements under the supported orientations and selects
     * one uniformly at random.
     * <p>
     * If no legal placements exist, returns a sentinel value.
     * 
     * @param grid Current puzzle grid used to test bounds and conflicts.
     * @param word Word to test for placement.
     * @return Zero-based linear index for a valid start (row * columnCount + col),
     *         or −1 if none fit.
     */
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

    /**
     * Print the grid to standard output in row-major order.
     * 
     * @param grid Grid to display. Each cell is printed as a character.
     */
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

    /**
     * Validate and place the word horizontally from a linear starting position.
     * <p>
     * Ensures the word fits to the right within the same row.
     * <p>
     * Accepts overlaps where existing letters match; rejects conflicting letters.
     * <p>
     * Modifies the grid on success and returns true.
     * 
     * @param index Zero-based linear start position (row * columnCount + col).
     * @param grid  Puzzle grid to validate and possibly modify.
     * @param word  Word to place left-to-right.
     * @return true if the word was placed; false if out-of-bounds or blocked by a
     *         conflicting letter.
     */
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

    /**
     * Validate and place the word vertically downward from a linear starting
     * position.
     * <p>
     * Checks row bounds for the word length from the starting cell downward.
     * <p>
     * Allows same-letter overlaps; fails on conflicts.
     * <p>
     * Writes letters into empty cells on success.
     * 
     * @param index Zero-based linear start position (row * columnCount + col).
     * @param grid  Puzzle grid to validate and possibly modify.
     * @param word  Word to place top-to-bottom.
     * @return true on successful placement; false otherwise.
     */
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

    /**
     * Validate and place the word along the down-right diagonal from the starting
     * position.
     * <p>
     * Steps (row+1, col+1) per letter and verifies bounds and conflicts.
     * <p>
     * Allows matching overlaps; fills empty cells on success.
     * 
     * @param index Zero-based linear start position (row * columnCount + col).
     * @param grid  Puzzle grid to validate and possibly modify.
     * @param word  Word to place along the down-right diagonal.
     * @return true if placed; false if out-of-bounds or conflicting.
     */
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

    /**
     * Validate and place the word along the down-left diagonal from the starting
     * position.
     * <p>
     * Steps (row+1, col−1) per letter and checks bounds and conflicts.
     * <p>
     * Allows matching overlaps; fills empty cells on success.
     * 
     * @param index Zero-based linear start position (row * columnCount + col).
     * @param grid  Puzzle grid to validate and possibly modify.
     * @param word  Word to place along the down-left diagonal.
     * @return true if placed; false if out-of-bounds or conflicting.
     */
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

    /**
     * Sort the array of words in descending length so longer words are placed
     * first.
     * <p>
     * Sorting by length reduces placement dead-ends and backtracking.
     * 
     * @param wordsFromFile Array of words to sort in place. Null or empty strings
     *                      should be filtered beforehand.
     */
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

    /**
     * Load newline-separated words from a text file into an array.
     * <p>
     * Coverts each word to upper case.
     * 
     * @param fileName Path to the file containing one word per line.
     * @return Array of words in file order.
     * @throws IOException if the file cannot be opened or read.
     */
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

    /**
     * Prompt the user for an input file path and return their response.
     * <p>
     * Displays the prompt and reads a single line from the provided reader.
     * 
     * @param message Prompt shown to the user (e.g., "Please enter the file
     *                name:").
     * @param br      BufferedReader connected to standard input.
     * @return The path entered by the user, without the trailing newline.
     * @throws IOException on input read failure.
     */
    public static String readFileName(String message, BufferedReader br) throws IOException {
        String defaultFileName = Constants.DEFAULT_INPUT_FILE_NAME;

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

    /**
     * Prompt repeatedly until the user supplies an integer within [min, max], then
     * return it.
     * <p>
     * Writes the prompt, parses the response, and reprompts on format errors or
     * out-of-range values.
     * <p>
     * Useful for dimensions like rows and columns.
     * 
     * @param message Prompt text shown before reading input.
     * @param min     Minimum acceptable integer value (inclusive).
     * @param max     Maximum acceptable integer value (inclusive).
     * @param br      BufferedReader connected to standard input.
     * @return Validated integer in the inclusive range [min, max].
     * @throws IOException on input read failure.
     */
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

    /**
     * Writes the given 2D character grid to the default output file specified by
     * Constants.DEFAULT_OUTPUT_FILE_NAME. Each row of the grid is written as a line:
     * characters in a row are written consecutively (no separators) and a newline
     * ('\n') is written after each row.
     * </p>
     * 
     * @param grid 2D array of characters representing the grid to save
     * @see Constants#DEFAULT_OUTPUT_FILE_NAME
     */
    public static void saveGrid(char grid[][]) {
        String defaultFileName = Constants.DEFAULT_OUTPUT_FILE_NAME;

        try {
            FileWriter writer = new FileWriter(defaultFileName);
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    writer.write(grid[i][j]);
                }
                writer.write("\n");
            }
            writer.close(); // Important to close the writer
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
