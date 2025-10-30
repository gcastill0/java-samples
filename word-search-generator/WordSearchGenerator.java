import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordSearchGenerator {

    public static void main(String[] args) throws IOException {

        String fileName = getFileName();

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

    public static String getFileName() throws IOException {

        String defaultFileName = "input.txt";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Please enter the file name: ");
            String fileName = br.readLine();
            String userFileName = ( fileName == null || fileName.trim().isEmpty() ) ? defaultFileName : fileName;
            return userFileName ;
        } catch (IOException e) {
            System.err.println("Error getting file name: " + e.getMessage());
            return defaultFileName;
        }
    }

}
