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

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Please enter the file name: ");
            String fileName = br.readLine();
            
            if ( fileName == null || fileName.trim().isEmpty() ) {
                System.out.println("File is empty. Using default file " + defaultFileName);
                fileName = defaultFileName;
            }
            
            return fileName ;

        } catch (IOException e) {
            System.err.println("Error getting file name: " + e.getMessage());
            return defaultFileName;
        }
    }

}
