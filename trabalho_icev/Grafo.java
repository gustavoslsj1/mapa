package trabalho_icev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Grafo{
private Map<String, List<String>> adjacencias;

public Grafo() {
        adjacencias = new HashMap<>();
}

public void adicionarCidade(String vertice) {
	   // Cria uma nova lista vazia de vizinhos para o vértice
    adjacencias.put(vertice, new ArrayList<>());
} 

public void adicionarLigacao(String vertice1, String vertice2) {
	 // Verifica se os vértices existem no grafo
    if (adjacencias.containsKey(vertice1) && adjacencias.containsKey(vertice2)) {
        List<String> vizinhos1 = adjacencias.get(vertice1);
        List<String> vizinhos2 = adjacencias.get(vertice2);

        if (!vizinhos1.contains(vertice2)) {
        	 // Adiciona vertice2 como vizinho de vertice1
            vizinhos1.add(vertice2);
            // Adiciona vertice1 como vizinho de vertice2
            vizinhos2.add(vertice1);
        }
    }
}

public List<String> obterVizinhos(String vertice) {
	 // Retorna a lista de vizinhos do vértice ou uma lista vazia se o vértice não existir
    return adjacencias.getOrDefault(vertice, new ArrayList<>());
}
}