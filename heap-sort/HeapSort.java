package HeapSort;

class TreeNode {
    int id = 0;
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    void addNode(TreeNode newNode) {
        newNode.id++;
        if (isNull(this.left)) {
            this.left = newNode;
            this.left.id = newNode.id;
        } else if (isNull(this.right)) {
            this.right = newNode;
            this.right.id = this.left.id + 1;
        } else {
            newNode.id = this.right.id;
            this.left.addNode(newNode);
        }
    }

    void printTree() {
        System.out.println(this.id + "\t" + this.val);

        if (isActive(this.right)) {
            // System.out.println(this.left.id + "\t" + this.left.val);
            // System.out.println(this.right.id + "\t" + this.right.val);
            this.left.printTree();
            this.right.printTree();
        } else
        if (isActive(this.left)) {
            // System.out.println(this.left.id + "\t" + this.left.val);
            this.left.printTree();
        }

    }

    boolean isNull(TreeNode node) {
        return node == null ? true : false;
    }

    boolean isActive(TreeNode node) {
        return node == null ? false : true;
    }

}

public class HeapSort {

    public static void heapSort(int[] array) {

        if (array.length == 0) {
            return;
        }

        int max_value = array[0];

        TreeNode tree = new TreeNode(max_value);

        System.out.println();
        System.out.println();

        for (int i = 1; i < array.length; i += 2) {

            int left_value = Integer.MIN_VALUE;
            int right_value = Integer.MIN_VALUE;

            if (i < array.length) {
                left_value = array[i];
                tree.addNode(new TreeNode(left_value));
            }
            if (i + 1 < array.length) {
                right_value = array[i + 1];
                tree.addNode(new TreeNode(right_value));
            }

        }

        tree.printTree();

        System.out.println();
        System.out.println();
    }

    /**
     * Prints the elements of the given integer array to the standard output,
     * separated by spaces, followed by a newline.
     *
     * @param array the integer array to be displayed
     */
    public static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums = { 7, 2, 5, 6, 1, 3, 4 };

        System.out.println();
        System.out.println();

        System.out.print("Before Sort:\t");
        displayArray(nums);

        heapSort(nums);

        System.out.print("After Sort:\t");
        displayArray(nums);
    }

}