import java.util.Arrays;

public class ContructBTFromPreAndInOrderTraversal {

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return new TreeNode(1);
    }

    public static void main(String[] args){
        int[] preorder = {1,2,4,5,3,6,7};
        int[] inorder = {4,2,5,1,6,3,7};
        buildTree(preorder,inorder);
        int[][] arr = {{1,2},{3,1}};
        Arrays.sort(arr, (a,b)->a[1] - b[1]);
        System.out.println(Arrays.toString(arr[0]));
    }
}
