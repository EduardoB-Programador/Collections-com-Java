package model;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> listaAlunos;

    public GerenciadorAlunos() {
        this.listaAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double media) {
        this.listaAlunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(int matricula) {
        for (Aluno a : this.listaAlunos) {
            if (a.getMatricula() == matricula) {
                this.listaAlunos.remove(a);
                break;
            }
        }

    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(this.listaAlunos);
        System.out.println(alunosPorNome);

    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(this.listaAlunos);
        System.out.println(alunosPorNota);

    }

    public void exibirAlunos() {
        System.out.println(this.listaAlunos);
    }
}
