import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordSearchGenerator {

    public static void main(String[] args) {

            String fileName = "input.txt"; 
            
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
        
}
