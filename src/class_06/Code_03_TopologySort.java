package class_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Code_03_TopologySort {

	// directed graph and no loop
	public static List<TreeNode1> sortedTopology(Graph graph) {
		HashMap<TreeNode1, Integer> inMap = new HashMap<>();
		Queue<TreeNode1> zeroInQueue = new LinkedList<>();
		for (TreeNode1 node : graph.nodes.values()) {
			inMap.put(node, node.in);
			if (node.in == 0) {
				zeroInQueue.add(node);
			}
		}
		List<TreeNode1> result = new ArrayList<>();
		while (!zeroInQueue.isEmpty()) {
			TreeNode1 cur = zeroInQueue.poll();
			result.add(cur);
			for (TreeNode1 next : cur.nexts) {
				inMap.put(next, inMap.get(next) - 1);
				if (inMap.get(next) == 0) {
					zeroInQueue.add(next);
				}
			}
		}
		return result;
	}
}
