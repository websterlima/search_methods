package metodos_busca;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BuscaHeuristica {

	public static void buscar(Graph graph, String key) {
		List<GraphNode> nodeList = new ArrayList<GraphNode>();

		nodeList.add(graph.getRootNode());

		while (!nodeList.isEmpty()) {
			GraphNode node = null;
			
			for (GraphNode nextNode : nodeList) {
				if (node == null || nextNode.getAccumulatedDistance() < node.getAccumulatedDistance()) {
					node = nextNode;
				}
			}
			
			node.visit();

			if (key.equals(node.getName())) {
				break;
			}

			nodeList.remove(node);

			Map<GraphNode, Integer> sonsMap = node.getSons();
			Set<GraphNode> sons = sonsMap.keySet();

			for (GraphNode son : sons) {
				if (son.isVisited())
					continue;
				
				int distance = sonsMap.get(son);
				son.incrementAccumulatedDistance(distance + node.getAccumulatedDistance());
				nodeList.add(son);
			}
		}
	}
}
