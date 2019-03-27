package class_06;

import java.util.HashMap;
import java.util.HashSet;

public class Graph {
	public HashMap<Integer, TreeNode1> nodes;
	public HashSet<Edge> edges;

	public Graph() {
		nodes = new HashMap<>();
		edges = new HashSet<>();
	}
}
