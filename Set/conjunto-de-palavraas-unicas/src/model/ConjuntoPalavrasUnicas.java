package model;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        for (String remover : this.palavrasSet) {
            if (palavra.equals(remover)) {
                this.palavrasSet.remove(remover);
                break;
            }
        }
    }

    public boolean verificarPalavra(String palavra) {
        for (String p : this.palavrasSet) {
            if (p.equals(palavra)) {
                return true;
            }
        }

        return false;
    }

    public void exibirPalavrasUnicas() {
        System.out.println(this.palavrasSet);
    }
}
