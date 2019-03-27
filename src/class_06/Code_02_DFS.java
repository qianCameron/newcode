package class_06;

import java.util.HashSet;
import java.util.Stack;

public class Code_02_DFS {

	public static void dfs(TreeNode1 node) {
		if (node == null) {
			return;
		}
		Stack<TreeNode1> stack = new Stack<>();
		HashSet<TreeNode1> set = new HashSet<>();
		stack.add(node);
		set.add(node);
		System.out.println(node.value);
		while (!stack.isEmpty()) {
			TreeNode1 cur = stack.pop();
			for (TreeNode1 next : cur.nexts) {
				if (!set.contains(next)) {
					stack.push(cur);
					stack.push(next);
					set.add(next);
					System.out.println(next.value);
					break;
				}
			}
		}
	}

}
