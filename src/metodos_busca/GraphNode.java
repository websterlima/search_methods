package metodos_busca;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {

	private boolean visited;
	private String name;
	private List<GraphNode> sons;

	public GraphNode(String name) {
		this.visited = false;
		this.name = name;
		this.sons = new ArrayList<GraphNode>();
	}

	public void visit() {
		visited = true;

		System.out.println("Visit node " + name);
	}

	public boolean isVisited() {
		return visited;
	}

	public void addSons(GraphNode... nodes) {
		for (GraphNode graphNode : nodes) {
			sons.add(graphNode);
		}
	}

	public String getName() {
		return name;
	}

	public List<GraphNode> getSons() {
		return sons;
	}
}
