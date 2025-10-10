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
        if (isNull(this.left)) {
            this.left = newNode;
            this.left.id = this.id + 1 + newNode.id;
            System.out.println("New Node: " + newNode.id + "\tThis Node ID: " + this.id + "\t L_Node ID: " + (this.left.id) + "\tVal: " + newNode.val);
        } else if (isNull(this.right)) {
            this.right = newNode;
            this.right.id = this.left.id + 1 + newNode.id;
            System.out.println("New Node: " + newNode.id + "\tThis Node ID: " + this.id + "\t R_Node ID: " + (this.right.id) + "\tVal: " + newNode.val);
        } else {
            newNode.id++;
            this.left.addNode(newNode);
        }
    }

    void printTree() {

        // System.out.println();
        // System.out.println(this.id + "\t" + this.val + "\n");

        if (!isNull(this.left)) {
            System.out.println(this.id + ": " + this.val + "\t" + this.left.id + ": " + this.left.val + "\n");
        }

        if (!isNull(this.right)) {
            System.out.println(this.id + ": " + this.val + "\t" + this.right.id + ": " + this.right.val + "\n");
            // this.right.printTree();
        }

        if (!isNull(this.right)) {
            this.right.printTree();
        } 

        if (!isNull(this.left)) {
            this.left.printTree();
        } 


    }

    boolean isNull(TreeNode node) {
        return node == null ? true : false;
    }

}

public class HeapSort {

    public static void heapSort(int[] array) {

        if (array.length == 0) {
            return;
        }

        TreeNode tree = new TreeNode(array[0]);

        System.out.println();
        System.out.println();

        for (int i = 1; i < array.length; i += 2) {
            if (i < array.length) {
                tree.addNode(new TreeNode(array[i]));
            }
            if (i + 1 < array.length) {
                tree.addNode(new TreeNode(array[i + 1]));
            }
        }

        // tree.printTree();

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

        System.out.print("Before Sort:\t");
        displayArray(nums);

        heapSort(nums);

        System.out.print("After Sort:\t");
        displayArray(nums);
    }

}