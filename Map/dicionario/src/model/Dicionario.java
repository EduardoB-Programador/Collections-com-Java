package model;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        this.dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!this.dicionario.isEmpty()) {
            this.dicionario.remove(palavra);
        }

    }

    public void exibirDicionario() {
        System.out.println(this.dicionario);
    }

    public String pesquisarPorPalavra(String palavra) {
        if (!this.dicionario.isEmpty()) return "A definção da palavra escolhida é:" +this.dicionario.get(palavra);

        return null;
    }


}
