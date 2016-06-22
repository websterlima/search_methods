package metodos_busca;

import java.util.HashMap;
import java.util.Map;

public class GraphNode {

	private boolean visited;
	private String name;
	private Map<GraphNode, Integer> sons;
	private int accumulatedDistance;

	public GraphNode(String name) {
		this.visited = false;
		this.name = name;
		this.sons = new HashMap<GraphNode, Integer>();
		this.accumulatedDistance = 0;
	}

	public void visit() {
		visited = true;

		System.out.print(name + " > ");
	}

	public boolean isVisited() {
		return visited;
	}

	public void addSon(GraphNode node, int distance) {
		sons.put(node, distance);
	}

	public String getName() {
		return name;
	}

	public Map<GraphNode, Integer> getSons() {
		return sons;
	}
	
	public int getAccumulatedDistance() {
		return accumulatedDistance;
	}
	
	public void incrementAccumulatedDistance(int distance) {
		this.accumulatedDistance += distance;	
	}
}
