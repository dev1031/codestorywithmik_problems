
import java.util.*;

public class BinaryTreeRightSideViewBFS{
    public static List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<List<Integer>> levelOrder = new ArrayList<>();
        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < len ; i++){
                TreeNode top = q.poll();
                if(top.right != null){
                    q.offer(top.right);
                }
                if(top.left != null){
                    q.offer(top.left);
                }
                temp.add(top.val);
            }
            levelOrder.add(temp);
        }
        List<Integer> res = new ArrayList<>();
        for(List<Integer> elem: levelOrder){
            res.add(elem.getFirst());
        }
        return res;
    }

    //public static List<Integer> result = new ArrayList<>();
    public static List<Integer> dfsMethod(TreeNode root){
        List<Integer> res = new ArrayList<>();
        int level = 1;
        dfs(root,res,level);
        return res;
    }
    public static void dfs(TreeNode root , List<Integer> res , int level){
        if(root == null){
            return;
        }
        if(res.size() <  level ){
            res.add(root.val);
        }
        level++;
        dfs(root.right,res,level);
        dfs(root.left,res,level);
    }
    public static void main(String[] args){
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.left.right = new TreeNode(5);
        head.right = new TreeNode(3);
        head.right.right = new TreeNode(4);
        rightSideView(head);
        dfsMethod(head);
    }
}