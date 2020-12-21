package Solution110;

public class BalancedBinaryTree {
    //TODO: Not finish yet. Recusion design.
    //Solution 110
public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(3);
    root.left.left.left = new TreeNode(4);
    root.left.left.right = new TreeNode(4);

    // TreeNode root = new TreeNode(1);
    // root.left = new TreeNode(2);
    // root.right = new TreeNode(2);
    // root.right.left = new TreeNode(1);
    // root.right.right = new TreeNode(2);
    

    boolean result = isBalanced(root);
    System.out.println(result);

}

public static boolean isBalanced(TreeNode root) {
        int min = minDepth(root);
        int max = maxDepth(root);

        if((max-min)<=1){
            return true;
        }else{
            return false;
        }
    }

    public static int minDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=minDepth(root.left);
        int r=minDepth(root.right);
        if(l==0||r==0){
            return l+r+1;
        }
        else{
            return (Math.min(l, r))+1;
        }
    }
    public static int maxDepth(TreeNode root) {

        if(root==null){
            return 0;
        }
        int l=minDepth(root.left);
        int r=minDepth(root.right);
        if(l==0||r==0){
            return l+r+1;
        }
        else{
            return (Math.max(l, r))+1;
        }
    }
    
}
