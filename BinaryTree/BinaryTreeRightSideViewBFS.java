class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    public TreeNode(TreeNode left , TreeNode right , int val){
        this.left = left;
        this.right = right;
        this.val = val;
    }
}

public class BinaryTreeRightSideViewBFS{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}