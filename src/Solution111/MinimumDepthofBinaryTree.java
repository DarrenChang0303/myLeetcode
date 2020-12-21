package Solution111;
public class MinimumDepthofBinaryTree {
//Solution 111

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.val = 3;
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int i = minDepth(root);
        System.out.println(i);

    }

    public static int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int l = minDepth(root.left);
        int r = minDepth(root.right);

        if (l == 0 || r == 0) {
            return (l + r + 1);
        } else {
            return (Math.min(l, r) + 1);
        }
    }
}
