package metodos_busca;

import java.util.List;
import java.util.Stack;

public class BuscaProfundidade {

	public static void buscar(Graph graph, String key) {
		Stack<GraphNode> nodeStack = new Stack<GraphNode>();
		nodeStack.push(graph.getRootNode());

		while (!nodeStack.isEmpty()) {
			GraphNode node = nodeStack.pop();
			node.visit();

			if (key.equals(node.getName())) {
				break;
			}

			List<GraphNode> sons = node.getSons();
			for (int i = sons.size() - 1; i > 0; i--) {
				if (!sons.get(i).isVisited())
					nodeStack.push(sons.get(i));
			}
		}
	}

}
