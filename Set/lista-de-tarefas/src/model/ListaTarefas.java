package model;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa t : this.tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                this.tarefas.remove(t);
                break;
            }
        }

    }

    public void exibirTarefas() {
        System.out.println(this.tarefas);
    }

    public int contarTarefas() {
        return this.tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for (Tarefa t : this.tarefas) {
            if (t.isConcluido()) {
                tarefasConcluidas.add(t);
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for (Tarefa t : this.tarefas) {
            if (!t.isConcluido()) {
                tarefasPendentes.add(t);
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : this.tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao) && !t.isConcluido()) {
                t.changeConcluido();
            }

        }

    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : this.tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao) && t.isConcluido()) {
                t.changeConcluido();
            }

        }

    }

    public void limparListaTarefas() {
        this.tarefas.clear();
    }
}
