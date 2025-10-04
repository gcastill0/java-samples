import java.util.ArrayList;
import java.util.List;

/**
 * QuickSort is a simplified implementation of the quicksort algorithm for educational purposes.
 * <p>
 * This class provides static methods to sort an integer array in ascending order using the quicksort technique.
 * The implementation is intentionally verbose and broken down into readable steps to aid understanding.
 * </p>
 *
 * <ul>
 *   <li>{@link #quicksort(int[])} - Sorts the given array in-place using quicksort.</li>
 *   <li>{@link #partition(int[], int)} - Partitions the array into elements less than and greater than the pivot.</li>
 *   <li>{@link #displayArray(int[])} - Utility method to print the contents of an array.</li>
 *   <li>{@link #main(String[])} - Demonstrates sorting an example array.</li>
 * </ul>
 *
 * <p>
 * Note: This implementation is not optimized for performance and is intended for teaching the basic concepts of quicksort.
 * </p>
 */
public class QuickSort {

    public static void quicksort(int[] array) {

        if (array.length == 0) {
            return;
        }

        int pivot = array.length - 1;
        int[][] left_n_right = partition(array, array.length - 1);

        // We break this up into lower and higher for readabililty
        // Create reasonable variables to populate lower and higher 
        int[] lower = new int[left_n_right[0].length];
        int[] higher = new int[left_n_right[1].length];

        // Populate the content into lower and higher 
        System.arraycopy(left_n_right[0], 0, lower, 0, left_n_right[0].length);
        System.arraycopy(left_n_right[1], 0, higher, 0, left_n_right[1].length);

        quicksort(lower);
        quicksort(higher);

        // The new array contains the total number of elements
        // from the left, right and current (1)
        int[] sorted_array = new int[lower.length + higher.length + 1];

        // ri is our running index.
        int ri = 0;

        // Populate material less than the value at the array pivot (if any) 
        for (int i = 0; i < lower.length; i++, ri++) {
            sorted_array[ri] = lower[i];
        }

        // Populate the pivot 
        sorted_array[ri] = array[pivot]; ri++;

        // Populate material greater than the value at the array pivot (if any) 
        for (int i = 0; i < higher.length; i++, ri++) {
            sorted_array[ri] = higher[i];
        }

        // Modify the entry array with the new values
        System.arraycopy(sorted_array, 0, array, 0, sorted_array.length);
    }

    /**
     * Partitions the given array into two subarrays based on the value at the specified pivot index.
     * Elements less than the pivot value are placed in the first subarray, and elements greater than or equal to the pivot value are placed in the second subarray.
     *
     * @param array the input array to partition
     * @param pivot the index of the pivot element in the array
     * @return a two-dimensional array where the first subarray contains elements less than the pivot value,
     *         and the second subarray contains elements greater than or equal to the pivot value
     */
    public static int[][] partition(int[] array, int pivot) {

        List<Integer> lower = new ArrayList<>();
        List<Integer> higher = new ArrayList<>();

        for (int i = 0; i < pivot; i++) {
            if (array[pivot] > array[i]) {
                lower.add(array[i]);
            } else {
                higher.add(array[i]);
            }
        }

        int[][] new_arrays = new int[2][];
        new_arrays[0] = new int[lower.size()];
        new_arrays[1] = new int[higher.size()];

        for (int i = 0; i < lower.size(); i++) {
            new_arrays[0][i] = lower.get(i);
        }

        for (int i = 0; i < higher.size(); i++) {
            new_arrays[1][i] = higher.get(i);
        }

        return new_arrays;
    }

    /**
     * Prints the elements of the given integer array to the standard output,
     * separated by spaces, followed by a newline.
     *
     * @param array the integer array to be displayed
     */
    public static void displayArray(int[] array) {
        for (int num: array) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = { 7, 2, 5, 6, 1, 3, 4 };

        System.out.print("Before Sort:\t");
        displayArray(nums);

        quicksort(nums);
        
        System.out.print("After Sort:\t");
        displayArray(nums);
    }
}
