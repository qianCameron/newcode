package class_06;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Code_01_BFS {

	public static void bfs(TreeNode1 node) {
		if (node == null) {
			return;
		}
		Queue<TreeNode1> queue = new LinkedList<>();
		HashSet<TreeNode1> map = new HashSet<>();
		queue.add(node);
		map.add(node);
		while (!queue.isEmpty()) {
			TreeNode1 cur = queue.poll();
			System.out.println(cur.value);
			for (TreeNode1 next : cur.nexts) {
				if (!map.contains(next)) {
					map.add(next);
					queue.add(next);
				}
			}
		}
	}

}
