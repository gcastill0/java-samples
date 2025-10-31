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

        String fileName = readFileName("Please enter the file name: ", br);
        Integer rows    = readIntNumber("Enter the number of rows (10-20): ", min, max, br);
        Integer cols    = readIntNumber("Enter the number of columns (10-20): ", min, max, br);

        try (
                FileReader fileInput = new FileReader(fileName);
                BufferedReader reader = new BufferedReader(fileInput)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
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
                if ( number >= min && number <= max ) break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid whole number.");
            }
        }

        return number;
    }

}
