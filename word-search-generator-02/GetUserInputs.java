
import java.util.Random;

public class GetUserInputs { 
	static Random random = new Random();

	public static void main(String[] args) {
		String wordList[] = {"word", "generate", "norah", "baba"};
		int rows = 10;
		int columns = 10;
		solutionFile(wordList, rows, columns);

	}
	
	 /**
	    * solutionFile 
	    * return String[]
	    * @param wordList, rows, columns
	    * This method is intended to generate the placement of the solution key 
	    **/
	    public static char[][] solutionFile(String wordList[], int rows, int columns) {
	    	char solution[][] = new char[rows][columns];
	    	for (int i = 0; i < wordList.length; i++) {
	    		int fOrB = random.nextInt(2) + 1;
	    		//int type = random.nextInt(4) + 1;
	    		int type = 1;
	    		switch (type) {
	    			case 1: 
	    				horizontalPlacement(solution, wordList[i]);
	    				break;
//	    			case 2: 
//	    				verticalPlacement(solution, wordList[i]);
//	    				break;
//	    			case 3: 
//	    				leftDiagonalPlacement(solution, wordList[i]);
//	    				break;
//	    			case 4: 
//	    				rightDiagonalPlacement(solution, wordList[i]);
//	    				break;
	    		}
	    	}
	    	return solution;
	    }
	    
	    /**
	    * horizontalPlacement 
	    * return type void
	    * @param solution, word
	    * This method is intended to find a location for the word to be placed horizontally without errors of array out of bounds or overruling a previous word 
	    **/
	    public static void horizontalPlacement(char[][] solution, String word) {
	           int rows = solution.length;
	           int columns = solution[0].length;
	           int boundaries = columns - word.length(); //to figure out how much space the word has within the boundaries

	           // randomizing the row and column where it spawns
	           int startingColumn = random.nextInt(boundaries);
	           int startingRow = random.nextInt(rows);
	           horizontalSpace(solution, word, rows, columns, boundaries);
	    }
	
	/**
	* horizontalSpace 
	* return boolean
	* @param solution, word, rows, columns
	* This method is intended to find a location where the word can be placed either vertically or horizontally without disrupting other words or going out of bounds 
	**/
	public static void horizontalSpace(char[][] solution, String word, int rows, int columns, int boundaries) {
		int matches = 0;
		int limit = 0;
		while (matches != word.length()) { //if the number of spaces available is enough to fit the word
			if (matches != 0) {
				int tempRow = rows;
				while (rows == tempRow) {
					rows = random.nextInt(boundaries);
				}
				int tempColumn = columns;
				while (columns == tempColumn) {
					columns = random.nextInt(solution[boundaries].length - word.length());
				}
			}
			matches = 0;
			limit = columns + word.length();
			// If horizontal word, the row does not change
			// If moving horizontally, the column increases by one
			for (int i = 0; i < limit; i++) {
				if (solution[rows -1][i] == ' ' || solution[rows -1][i] == word.charAt(i)) {
					matches++;
				}
			}
		}
		for (int i = 0; i < limit; i++) {
			solution[rows][i] = word.charAt(i);
			System.out.println(solution[rows][i]);
		}
	}
}
