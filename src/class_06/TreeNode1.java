package class_06;

import java.util.ArrayList;

public class TreeNode1 {
	public int value;
	public int in;
	public int out;
	public ArrayList<TreeNode1> nexts;
	public ArrayList<Edge> edges;

	public TreeNode1(int value) {
		this.value = value;
		in = 0;
		out = 0;
		nexts = new ArrayList<>();
		edges = new ArrayList<>();
	}
}
