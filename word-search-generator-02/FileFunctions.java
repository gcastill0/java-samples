import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class FileFunctions {
	
	 public static final String defaultFileName = "input.txt";
	 static Random random = new Random();

	    /**
	     * generatorMainMethod
	     * return type void
	     * 
	     * @param
	     * This method is intended to act as the main method in this portion of the code, hence the name “generatorMainMethod.” Everything ends back here.
	     * @throws IOException 
	     **/
	    public static void generatorMainMethod() throws IOException {
	        // Scanner myScanner = new Scanner(System.in);
	        int counter = 0;
	        String solutionFileName;
	        String wordsInFile[] = fileHandling();
	        int rows = userInputNumber("rows");
	        int columns = userInputNumber("columns");
	        char solution[][] = new char[rows][columns];
	        for (int i = 0; i < rows; i++) {
	        	for (int j = 0; j < columns; j++) {
	        		solution[i][j] = ' ';
	        	}
	        }
	        //solution = solutionFile(wordsInFile, rows, columns);
//	        solutionFileName = namingFiles();
//	        // File solutionFileName = new File("location/userInput.solutionFileName");
//	        finalPuzzle();
	    }

	    /**
	     * fileHandling
	     * return String[]
	     * 
	     * @param
	     * This method is intended to find the file the user wants to use, check the validity of the file (whether it meets the conditions or not), and transform it into an array for easier use, in all uppercase words
	     **/
	    public static String[] fileHandling() throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int nOfWords = 0;
	        String userFileName = defaultFileName;

	        try {
	            System.out.print("Please enter the name of the file needed: ");
	            userFileName = br.readLine();
	        } catch (IOException e) {
	            System.err.println("Sorry, there was an error getting the file name: " + e.getMessage());
	            System.err.println("Using default file, input.txt.");
	        } finally {
	            userFileName = defaultFileName;
			}

	        try (
	            FileReader fileInput = new FileReader(userFileName);
	            BufferedReader reader = new BufferedReader(fileInput)) {
					String fileLine;
					while ((fileLine = reader.readLine()) != null) {						
						nOfWords++;
						if (nOfWords > 10) {
							System.out.println("The file can only contain a maximum of 10 words. Please try again.");
							// what do i do here
						}
						if (fileLine.length() > 8 || fileLine.length() < 4) {
							System.out.println(
									"The words in the file can only be between 4 and 8 characters, inclusive. Please try again.");
							// what do i do here
						}
					}

	        } catch (IOException e) {
	            System.err.println("Sorry, there was an error reading your file: " + e.getMessage());
	        }

	        String wordsInFile[] = new String[nOfWords];

	        try (
	            FileReader fileInput = new FileReader(userFileName);
	            BufferedReader reader = new BufferedReader(fileInput)) {
					String fileLine;
					int index = 0;
					while ((fileLine = reader.readLine()) != null) {
						wordsInFile[index] = fileLine.toUpperCase();
						System.out.println("Word added to array: " + fileLine);
						index++;
				}
	        } catch (IOException e) {
	            System.err.println("Sorry, there was an error reading your file: " + e.getMessage());
	            System.out.println("Using default file, input.txt…");
	            userFileName = defaultFileName;
	        }
	        insertionSort(wordsInFile);
	        return wordsInFile;
	    }
	    
	    /**
	     * insertionSort
	     * @param array
	     * return type: void 
	     * This array is intended to use the insertion sort algorithm to sort an array
	     */
	    public static void insertionSort (String[] wordsInFile) {
	    	for (int i = 1; i < wordsInFile.length; i++) { //to access each element starting with index 1
	    		String key = wordsInFile[i]; //
	    		int j = i-1; //j will be less than 1 to compare the previous elements 
	    		while (j >= 0 && wordsInFile[j].length() > key.length()) { //while j is an element (not out of bounds) and the current element is greater than the key //makes it adaptive 
	    			wordsInFile[j+1] = wordsInFile[j]; //the element ahead is equal to the current element (shifting them up) 
	    			j -= 1; //lessens to compare previous elements 
	    		}
	    		wordsInFile[j+1] = key; //the element is moved to its correct position 
	    	}
	    }

	    
	    /**
	     * userInputNumber
	     * @param type
	     * @return integer
	     * This method is intended to ensure the numbers that the user wants the row or column length to be fall within the boundaries required
	     */
	    public static int userInputNumber(String type) {
	    	int numType = 0;
			Scanner myScanner = new Scanner(System.in);
			while (numType < 10 || numType > 20) {

				if (numType != 0) {
					System.out.println("That number is invalid. Please try again.");
				}

				System.out.println("How many " + type + " would you like the puzzle to have? You cannot make the " + type + " smaller than 10 or greater than 20.");
				String line = myScanner.nextLine().trim();
				numType = Integer.parseInt(line);
			}

	    	return numType;
	    }
	    
	    public static void main (String args[]) throws IOException {
	    	generatorMainMethod();
	    }
}