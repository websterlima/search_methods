package metodos_busca;

import java.util.ArrayList;
import java.util.List;

public class BuscaHeuristica {
	public static void buscar(Graph graph, String key) {
		ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

		nodeList.add(graph.getRootNode());

		while (!nodeList.isEmpty()) {
			GraphNode node = nodeList.remove(0);
			node.visit();

			if (key.equals(node.getName())) {
				break;
			}

			List<GraphNode> sons = node.getSons();
			for (GraphNode graphNode : sons) {
				if (!graphNode.isVisited() && !nodeList.contains(graphNode))
					nodeList.add(graphNode);
			}
		}
	}
}
