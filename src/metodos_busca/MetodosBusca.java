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
		
		nodeI.addSons(nodeA, nodeB, nodeN, nodeL);
		nodeA.addSons(nodeI, nodeB);
		nodeB.addSons(nodeI, nodeA, nodeC, nodeT);
		nodeN.addSons(nodeI, nodeP);
		nodeL.addSons(nodeI, nodeM);
		nodeC.addSons(nodeB, nodeD, nodeE);
		nodeT.addSons(nodeB, nodeS, nodeV, nodeW);
		nodeD.addSons(nodeC, nodeE);
		nodeE.addSons(nodeD, nodeC, nodeG);
		nodeG.addSons(nodeE, nodeH, nodeK);
		nodeK.addSons(nodeG, nodeH, nodeF);
		nodeH.addSons(nodeG, nodeK);
		nodeF.addSons(nodeK, nodeW, nodeM);
		nodeP.addSons(nodeN, nodeQ, nodeU);
		nodeM.addSons(nodeL, nodeF);
		nodeQ.addSons(nodeP, nodeR);
		nodeR.addSons(nodeQ, nodeS);
		nodeS.addSons(nodeR, nodeT);
		nodeU.addSons(nodeP, nodeV);
		nodeV.addSons(nodeU, nodeT);
		nodeW.addSons(nodeT, nodeF);
		
		Graph graph = new Graph();
		graph.setRootNode(nodeI);
		
		BuscaLargura.buscar(graph, "F");
	}
}
