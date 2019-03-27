package class_08;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }

public class BTlevelordertraver {
    public static ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {

        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        if(root==null) return res;

        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        int d=treedepth(root,0);

        for(int i=d-1;i>=0;i--){
            ArrayList<Integer> list=new ArrayList<Integer>();
            int size=queue.size();
            for(int j=0;j<size;j++){
                TreeNode cur=queue.poll();
                list.add(cur.val);
                //res.get(i).add(cur.val);
                if(cur.left!=null)
                    queue.offer(cur.left);
                if(cur.right!=null)
                    queue.offer(cur.right);
            }
             res.add(0,list);
        }
        return res;
    }
    public static int treedepth(TreeNode root,int level){
        if(root==null) return level;
        return Math.max(treedepth(root.left,level+1),treedepth(root.right,level+1));
        //if(root.left!=null&&root.right==null) return treedepth(root.left,level+1);
        //if(root.left==null&&root.right!=null) return treedepth(root.right,level+1);
    }
    public static void main(String[] args){
        TreeNode node =new TreeNode(3);
         node.left=new TreeNode(9);
         node.right=new TreeNode(20);
         node.right.left=new TreeNode(15);
        node.right.right=new TreeNode(7);
        System.out.println(treedepth(node,0));
        ArrayList<ArrayList<Integer>> res=levelOrderBottom(node);
        for(int i=0;i<res.size();i++){
            for(int j=0;j<res.get(i).size();j++){
              System.out.print(res.get(i).get(j));

            }
            System.out.print("/n");
        }
    }
}
