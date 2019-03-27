/*
* 递归方法判断两棵树是否对称
*
*
*
*
*
* */
public class symmerticTree {
    public boolean isSymmetric(TreeNode root) {


        return isSymmetric(root, root);
    }

    public boolean isSymmetric(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 != null & root2 != null) {
            return root1.val == root2.val && isSymmetric(root1.left, root2.right) && isSymmetric(root1.right, root2.left);
        } else return false;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}