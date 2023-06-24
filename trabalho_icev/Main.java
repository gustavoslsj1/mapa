package trabalho_icev;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Grafo grafo = new Grafo();

        // Adicionar cidades
        grafo.adicionarCidade("A");
        grafo.adicionarCidade("B");
        grafo.adicionarCidade("C");
        grafo.adicionarCidade("D");
        grafo.adicionarCidade("E");

        // Adicionar ligaçao
        grafo.adicionarLigacao("A", "B");
        grafo.adicionarLigacao("A", "C");
        grafo.adicionarLigacao("B", "D");
        grafo.adicionarLigacao("C", "D");
        grafo.adicionarLigacao("D", "E");

        // Obter vizinhos de um vértice
        List<String> vizinhosA = grafo.obterVizinhos("A");
        System.out.println("Vizinhos de A: " + vizinhosA);
    }
}
