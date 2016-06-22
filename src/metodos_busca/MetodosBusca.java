package metodos_busca;

public class MetodosBusca {

	public static void main(String[] args) {
		GraphNode nodeA = new GraphNode("A");
		GraphNode nodeB = new GraphNode("B");
		GraphNode nodeC = new GraphNode("C");
		GraphNode nodeD = new GraphNode("D");
		GraphNode nodeE = new GraphNode("E");
		GraphNode nodeF = new GraphNode("F");
		GraphNode nodeG = new GraphNode("G");
		GraphNode nodeH = new GraphNode("H");
		GraphNode nodeI = new GraphNode("I");
		GraphNode nodeK = new GraphNode("K");
		GraphNode nodeL = new GraphNode("L");
		GraphNode nodeM = new GraphNode("M");
		GraphNode nodeN = new GraphNode("N");
		GraphNode nodeP = new GraphNode("P");
		GraphNode nodeQ = new GraphNode("Q");
		GraphNode nodeR = new GraphNode("R");
		GraphNode nodeS = new GraphNode("S");
		GraphNode nodeT = new GraphNode("T");
		GraphNode nodeU = new GraphNode("U");
		GraphNode nodeV = new GraphNode("V");
		GraphNode nodeW = new GraphNode("W");
		
		nodeI.addSon(nodeA, 3);
		nodeI.addSon(nodeB, 4);
		nodeI.addSon(nodeN, 12);
		nodeI.addSon(nodeL, 5);

		nodeA.addSon(nodeI, 3);
		nodeA.addSon(nodeB, 3);

		nodeB.addSon(nodeI, 4);
		nodeB.addSon(nodeA, 3);
		nodeB.addSon(nodeC, 4);
		nodeB.addSon(nodeT, 11);

		nodeN.addSon(nodeI, 12);
		nodeN.addSon(nodeP, 3);

		nodeL.addSon(nodeI, 5);
		nodeL.addSon(nodeM, 27);

		nodeC.addSon(nodeB, 4);
		nodeC.addSon(nodeD, 3);
		nodeC.addSon(nodeE, 3);

		nodeT.addSon(nodeB, 11);
		nodeT.addSon(nodeS, 4);
		nodeT.addSon(nodeV, 7);
		nodeT.addSon(nodeW, 3);

		nodeD.addSon(nodeC, 3);
		nodeD.addSon(nodeE, 2);

		nodeE.addSon(nodeD, 2);
		nodeE.addSon(nodeC, 3);
		nodeE.addSon(nodeG, 3);

		nodeG.addSon(nodeE, 3);
		nodeG.addSon(nodeH, 3);
		nodeG.addSon(nodeK, 3);

		nodeK.addSon(nodeG, 3);
		nodeK.addSon(nodeH, 2);
		nodeK.addSon(nodeF, 8);

		nodeH.addSon(nodeG, 3);
		nodeH.addSon(nodeK, 2);

		nodeF.addSon(nodeK, 8);
		nodeF.addSon(nodeW, 8);
		nodeF.addSon(nodeM, 8);

		nodeP.addSon(nodeN, 3);
		nodeP.addSon(nodeQ, 2);
		nodeP.addSon(nodeU, 3);

		nodeM.addSon(nodeL, 27);
		nodeM.addSon(nodeF, 8);

		nodeQ.addSon(nodeP, 2);
		nodeQ.addSon(nodeR, 2);

		nodeR.addSon(nodeQ, 2);
		nodeR.addSon(nodeS, 2);

		nodeS.addSon(nodeR, 2);
		nodeS.addSon(nodeT, 4);

		nodeU.addSon(nodeP, 3);
		nodeU.addSon(nodeV, 2);

		nodeV.addSon(nodeU, 2);
		nodeV.addSon(nodeT, 7);

		nodeW.addSon(nodeT, 3);
		nodeW.addSon(nodeF, 8);
		
		Graph graph = new Graph();
		graph.setRootNode(nodeI);
		
		System.out.println("Busca Largura");
		BuscaLargura.buscar(graph, "F");
		
		System.out.println();
		
		System.out.println("\nBusca Profundidade");
		BuscaProfundidade.buscar(graph, "F");
		
		System.out.println();
		
		System.out.println("\nBusca Custo Uniforme");
		BuscaHeuristica.buscar(graph, "F");
	}
}
