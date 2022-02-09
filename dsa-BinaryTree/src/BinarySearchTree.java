public class BinarySearchTree {
    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public TreeNode insert(TreeNode root, int value) {
//  method to insert a node in Binary search tree.
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }
    public TreeNode search(TreeNode root, int key) {
//  method to search a given key in a Binary search tree.
        if (root == null) {
            return root;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }

    }
    public boolean isValid(TreeNode root, long min, long max) {
//  method to check the validity of a Binary search tree.
        if (root == null) {
            return true;
        }
        if (root.data <= min || root.data >= max) {
            return false;
        }
        boolean left = isValid(root.left, root.data, max);
            if (left){
             boolean right=isValid(root.right,root.data,max);
             return right;
            }
        return false;
    }




    public static void main(String[] args) {

    }
}
