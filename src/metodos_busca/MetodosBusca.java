package metodos_busca;

public class MetodosBusca {

	public static void main(String[] args) {
		System.out.println("Busca Largura");
		BuscaLargura.buscar(Graph.getGraph(), "F");
		
		System.out.println();
		
		System.out.println("\nBusca Profundidade");
		BuscaProfundidade.buscar(Graph.getGraph(), "F");
		
		System.out.println();
		
		System.out.println("\nBusca Custo Uniforme");
		BuscaCustoUniforme.buscar(Graph.getGraph(), "F");
	}
}
