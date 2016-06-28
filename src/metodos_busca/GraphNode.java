package metodos_busca;

import java.util.LinkedHashMap;
import java.util.Map;

public class GraphNode {

	private boolean visited;
	private String name;
	private Map<GraphNode, Integer> sons;
	private int accumulatedDistance;
	
	private GraphNode() {
		// TODO Auto-generated constructor stub
	}

	public GraphNode(String name) {
		this.visited = false;
		this.name = name;
		this.sons = new LinkedHashMap<GraphNode, Integer>();
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

	public GraphNode deepCopy() {
		GraphNode graphNode = new GraphNode();
		
		graphNode.accumulatedDistance = this.accumulatedDistance;
		graphNode.name = this.name;
		graphNode.sons = this.sons;
		graphNode.visited = this.visited;
		
		return graphNode;
	}
	
	@Override
	public boolean equals(Object obj) {
		GraphNode node = (GraphNode) obj;
		return this.getName().equals(node.getName());
	}
}
