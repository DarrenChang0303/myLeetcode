package Solution100;
public class SameTree2 {
    // solution100-2

    public boolean compare(TreeNode t1, TreeNode t2) {
        // boolean result;
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1==null ||  t2==null) {
            return false;
        }
        if (t1.val != t2.val) {
            return false;
        }
        return compare(t1.left, t2.left) && compare(t1.right, t2.right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return compare(p,q);
    }

}
