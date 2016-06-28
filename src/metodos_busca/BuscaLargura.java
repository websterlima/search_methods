package metodos_busca;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BuscaLargura {

	public static void buscar(Graph graph, String key) {
		List<GraphNode> nodeList = new ArrayList<GraphNode>();

		nodeList.add(graph.getRootNode());

		while (!nodeList.isEmpty()) {
			GraphNode node = nodeList.remove(0);
			node.visit();

			if (key.equals(node.getName())) {
				break;
			}

			Map<GraphNode, Integer> sons = node.getSons();
			for (GraphNode graphNode : sons.keySet()) {
				if (!graphNode.isVisited() && !nodeList.contains(graphNode))
					nodeList.add(graphNode);
			}
		}
	}
}
