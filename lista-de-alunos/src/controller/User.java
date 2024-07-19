package controller;

import model.GerenciadorAlunos;

public class User {
    public static void main(String[] args) {
        GerenciadorAlunos sistema = new GerenciadorAlunos();

        //Adicionando alunos
        sistema.adicionarAluno("João", 512224875, 8.5);
        sistema.adicionarAluno("Maria", 213354998, 7.2);
        sistema.adicionarAluno("Luiz", 512224875, 5.4);
        sistema.adicionarAluno("Mateus", 446812121, 4.4);
        sistema.adicionarAluno("Lívia", 344465187, 9.1);
        sistema.adicionarAluno("Pedro", 213354688, 8.3);
        sistema.adicionarAluno("Laura", 221355546, 7.5);

        //Exibindo alunos
        sistema.exibirAlunos();

        //Exibindo alunos por nome
        sistema.exibirAlunosPorNome();

        //Removendo alunos
        sistema.removerAluno(446812121);
        sistema.removerAluno(213354998);

        //Exibindo alunos por nota
        sistema.exibirAlunosPorNota();
    }
}
