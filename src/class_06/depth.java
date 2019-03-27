package class_06;

public class depth {

    public static int maxDepth(TreeNode1 root) {
        if (root == null) {
            return 0;
        }
        //   if(root.left!=null&&root.right==null)
        //   { return maxDepth(root.left)+1; }
        //   if(root.left==null&&root.right!=null)
        //   { return  maxDepth(root.right)+1; }
        return maxDepth(root.left) > maxDepth(root.right) ? maxDepth(root.left) + 1 : maxDepth(root.right) + 1;
    }

    public static void main(String[] args) {
        TreeNode1 head = new TreeNode1(5);
        head.left = new TreeNode1(3);
        head.right = new TreeNode1(8);
        head.left.left = new TreeNode1(2);
        head.left.right = new TreeNode1(4);
        head.left.left.left = new TreeNode1(1);
        head.right.left = new TreeNode1(7);
        head.right.left.left = new TreeNode1(6);
        head.right.right = new TreeNode1(10);
        head.right.right.left = new TreeNode1(9);
        head.right.right.right = new TreeNode1(11);


        System.out.println(maxDepth(head));
    }

    public static class TreeNode1 {
        int val;
        TreeNode1 left;
        TreeNode1 right;
        TreeNode1(int x) { val = x; }
    }

}