package Solution98;
public class ValidateBinarySearchTree {
    // Solution 98
    public boolean isValidBST(TreeNode root){
        TreeNode left = root.left;
        TreeNode right = root.right;

        if(root.val>left.val&right.val<right.val){
            // compare(left,right);
            isValidBST(left);
            isValidBST(right);
            return true;
            
        }else{
            return false;
        }
	

    }


}
