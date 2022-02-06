<<<<<<< HEAD
import java.util.Stack;
=======

>>>>>>> origin/master

public class Tree {

    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    public void createBinaryTree(){
        TreeNode first=new TreeNode(1);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(3);
        TreeNode fourth=new TreeNode(4);
        TreeNode fifth=new TreeNode(5);

        root=first;
        first.left=second;
        first.right=third;

        second.left=fourth;
        second.right=fifth;

    }
<<<<<<< HEAD
    public void preOrderR(TreeNode root){
//  recursive method to preOrder traverse a binary tree.
=======
    public void preOrder(TreeNode root){
//  method to preOrder traverse a binary tree.
>>>>>>> origin/master
        if(root==null){
            return;
        }
        System.out.println(root.data);
<<<<<<< HEAD
        preOrderR(root.left);
        preOrderR(root.right);
    }
    public void preOrderI(){
//  iterative method to preOrder traverse a binary tree.
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp=stack.pop();
            System.out.println(temp.data);
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
=======
        preOrder(root.left);
        preOrder(root.right);
>>>>>>> origin/master
    }

    public static void main(String[] args) {

    }
}
