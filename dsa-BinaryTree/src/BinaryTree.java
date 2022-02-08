import java.util.LinkedList;
import java.util.Queue;
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
        System.out.print(root.data+" ");

        preOrderR(root.left);
        preOrderR(root.right);
    }
    public void preOrderI(){
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
    public void inOrderI(){
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
        System.out.print(root.data);
        System.out.println();

    }

    public void postOrderI(){
//  iterative method to postOrder traverse a binary tree.(Left->Right->Node)

        TreeNode current=root;
        Stack<TreeNode> stack=new Stack<>();
        while(current!=null || !stack.isEmpty()){
            if (current!=null){
                stack.push(current);
                current=current.left;
            }
            else{
                TreeNode temp=stack.peek().right;
                if (temp==null){
                    temp=stack.pop();
                    System.out.println(temp.data+" ");
                    while (!stack.isEmpty() && temp==stack.peek().right){
                        temp=stack.pop();
                        System.out.println(temp.data+" ");
                    }

                }
                else {
                    current=temp;
                }
            }
        }

    }
    public void levelOrderTraversal(){
//  method to traverse nodes in each level of the binary tree(Level 1->Level 2->Level 3->.......->Level n)
        if (root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode temp=queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }
    }
    public int  findMax(TreeNode root){
//  method to find the maximum value in a binary tree
        if (root==null){
            return Integer.MIN_VALUE;
        }
        int result=root.data;
        int left=findMax(root.left);
        int right=findMax(root.right);
        if(left>result){
            result=left;
        }
        if (right>result){
            result=right;
        }
        return result;
    }


    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.createBinaryTree();
        bt.postOrderR(bt.root);
        bt.levelOrderTraversal();

    }
}
