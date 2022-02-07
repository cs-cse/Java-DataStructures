import java.util.Stack;

public class BinaryTree {

    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
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
    public void preOrderR(TreeNode root){
//  recursive method to preOrder traverse a binary tree.(Node->Left->Right)
        if(root==null){
            return;
        }
        System.out.println(root.data);

        preOrderR(root.left);
        preOrderR(root.right);
    }
    public void preOrderI(TreeNode root){
//  iterative method to preOrder traverse a binary tree.(Node->Left->Right)
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



    }

    public void inOrderR(TreeNode root){
//  recursive method to inOrder traverse a binary tree.(Left->Node->Right)
        if(root==null){
            return;
        }
        inOrderR(root.left);
        System.out.println(root.data);
        inOrderR(root.right);

    }
    public void inOrderI(TreeNode root){
//  iterative method to inOrder traverse a binary tree.(Left->Node->Right)
        if (root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        TreeNode temp=root;
        while (!stack.isEmpty() ||temp!=null ){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;

            }
            else{
                temp=stack.pop();
                System.out.println(temp.data+" ");
                temp=temp.right;
            }

        }

    }
    public void postOrderR(TreeNode root){
//  recursive method to postOrder traverse a binary tree.(Left->Right->Node)
        if(root==null){
            return;
        }
        preOrderR(root.left);
        preOrderR(root.right);
        System.out.println(root.data);

    }

    public static void main(String[] args) {

    }
}
