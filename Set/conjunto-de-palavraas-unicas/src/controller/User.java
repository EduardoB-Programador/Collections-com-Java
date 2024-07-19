package controller;

import model.ConjuntoPalavrasUnicas;

import java.sql.SQLOutput;

public class User {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        //Inserindo palavras
        conjunto.adicionarPalavra("Beterraba");
        conjunto.adicionarPalavra("Água");
        conjunto.adicionarPalavra("Jogo");
        conjunto.adicionarPalavra("Pneu");
        conjunto.adicionarPalavra("Pulmão");

        //Exibindo palavras
        conjunto.exibirPalavrasUnicas();

        //Verificando palavras
        System.out.println(conjunto.verificarPalavra("Ladrão") ? "A palavra existe" : "A palavra não existe");

        System.out.println(conjunto.verificarPalavra("Pulmão") ? "A palavra existe" : "A palavra não existe");

        //Removendo uma palavra
        conjunto.removerPalavra("Pneu");
        conjunto.removerPalavra("Ladrão");

        //Exibindo palavras
        conjunto.exibirPalavrasUnicas();

    }
}
