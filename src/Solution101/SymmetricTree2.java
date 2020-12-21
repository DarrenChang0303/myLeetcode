package Solution101;

import java.util.ArrayList;

public class SymmetricTree2 {

    ArrayList<Integer> leftArray = new ArrayList<>();
    ArrayList<Integer> rightArray = new ArrayList<>();

    public ArrayList<Integer> leftToArray(TreeNode root) {
        if (root.left == null && root.right == null) {
            leftArray.add(null);
        }
        if (root.left != null && root.right != null) {
            leftArray.add(root.left.val);
            leftArray.add(root.right.val);
        }
        if (root.left == null && root.right != null) {
            leftArray.add(null);
            leftArray.add(root.right.val);
        }
        if (root.left != null && root.right == null) {
            leftArray.add(root.left.val);
            leftArray.add(null);
        }
        leftToArray(root.left);
        leftToArray(root.right);
        return leftArray;
    }

    public ArrayList<Integer> rightToArray(TreeNode root) {
        if (root.left == null && root.right == null) {
            rightArray.add(null);
        }
        if (root.left != null && root.right != null) {
            rightArray.add(root.right.val);
            rightArray.add(root.left.val);
        }
        if (root.left == null && root.right != null) {
            rightArray.add(root.right.val);
            rightArray.add(null);
        }
        if (root.left != null && root.right == null) {
            rightArray.add(null);
            rightArray.add(root.left.val);
        }
        rightToArray(root.left);
        rightToArray(root.right);
        return rightArray;
    }

    public boolean isSymmetric(TreeNode root) {
        if (root.left != root.right) {
            return false;
        }
        if (root.left == root.right) {
            return leftToArray(root.left).equals(rightToArray(root.right));
            // return  leftToArray(root.left), rightToArray(root.right);
        }
        return false;
    }

}
