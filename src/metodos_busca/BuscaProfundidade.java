package metodos_busca;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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

			Set<GraphNode> sons = node.getSons().keySet();
			List<GraphNode> sonsList = new ArrayList<>(sons);
			
			for (int i = sonsList.size() - 1; i > 0; i--) {
				if (!sonsList.get(i).isVisited())
					nodeStack.push(sonsList.get(i));
			}
		}
	}

}
