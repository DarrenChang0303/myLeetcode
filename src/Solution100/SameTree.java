package Solution100;
import java.util.ArrayList;

public class SameTree {
    // Solution 100

    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> a = frontShow(p);
        ArrayList<Integer> b = frontShow(q);
        boolean success = true;
        if (a.size() != b.size()) {
            success = false;
        }
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) != b.get(i)) {
                success = false;
            }
        }
        return success;
    }

    ArrayList<Integer> tree1 = new ArrayList<>();

    public ArrayList<Integer> frontShow(TreeNode x) {
        tree1.add(x.val);
        if (x.left != null) {
            frontShow(x.left);
        }
        if (x.right != null) {
            frontShow(x.right);
        }

        return tree1;

    }

}
