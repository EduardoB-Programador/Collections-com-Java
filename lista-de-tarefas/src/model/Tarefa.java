package model;

public class Tarefa {
    private String descricao;
    private boolean concluido;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluido = false;
    }

    public void changeConcluido() {
        this.concluido = !this.concluido;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao + ", concluido: " + (concluido ? "sim" : "não") +
                "\n";
    }
}
