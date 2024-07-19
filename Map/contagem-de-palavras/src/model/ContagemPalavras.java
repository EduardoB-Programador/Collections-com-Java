package model;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasTexto;

    public ContagemPalavras() {
        this.palavrasTexto = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, int quantidade) {
        this.palavrasTexto.put(palavra, quantidade);
    }

    public void removerPalavra(String palavra) {
        if (!this.palavrasTexto.isEmpty()) {
            this.palavrasTexto.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(this.palavrasTexto);
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraFrequente = null;

        if (!this.palavrasTexto.isEmpty()) {
            int frequencia = Integer.MIN_VALUE;

            for (String p : this.palavrasTexto.keySet()) {
                if (this.palavrasTexto.get(p) > frequencia) {
                    frequencia = this.palavrasTexto.get(p);
                    palavraFrequente = p;

                }

            }

        }

        return palavraFrequente;
    }
}
