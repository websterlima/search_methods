package metodos_busca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BuscaCustoUniforme {

	public static void buscar(Graph graph, String key) {
		List<GraphNode> nodeList = new ArrayList<GraphNode>();
		List<GraphNode> visitedNodes = new ArrayList<GraphNode>();

		nodeList.add(graph.getRootNode());

		while (!nodeList.isEmpty()) {
			GraphNode node = null;

			Iterator<GraphNode> iterator = nodeList.iterator();

			while (iterator.hasNext()) {
				GraphNode nextNode = iterator.next();

				if (visitedNodes.contains(nextNode)) {
					iterator.remove();
					continue;
				}

				if (node == null || nextNode.getAccumulatedDistance() < node.getAccumulatedDistance()) {
					node = nextNode;
				}
			}

			node.visit();
			visitedNodes.add(node);

			if (key.equals(node.getName())) {
				break;
			}

			nodeList.remove(node);

			Map<GraphNode, Integer> sonsMap = node.getSons();
			Set<GraphNode> sons = sonsMap.keySet();

			for (GraphNode son : sons) {
				if (visitedNodes.contains(son))
					continue;

				int distance = sonsMap.get(son);

				son = son.deepCopy();

				son.incrementAccumulatedDistance(distance + node.getAccumulatedDistance());
				nodeList.add(son);
			}
		}
	}
}
