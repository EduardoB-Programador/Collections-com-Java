package controller;

import model.ContagemPalavras;

public class User {
    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        //Adicionando palavras
        contagem.adicionarPalavra("abra", 2);
        contagem.adicionarPalavra("cadabra", 1);
        contagem.adicionarPalavra("pneu", 5);
        contagem.adicionarPalavra("injustiça", 3);
        contagem.adicionarPalavra("dor", 2);
        contagem.adicionarPalavra("água", 7);
        contagem.adicionarPalavra("chance", 3);
        contagem.adicionarPalavra("vida", 2);
        contagem.adicionarPalavra("alegria", 1);
        contagem.adicionarPalavra("sentir", 4);

        //Exibindo palavras
        contagem.exibirPalavras();

        //Exibindo a palavra mais frequente
        System.out.println(contagem.encontrarPalavraMaisFrequente());

        //Removendo palavras
        contagem.removerPalavra("cadabra");
        contagem.removerPalavra("injustiça");
        contagem.removerPalavra("água");

        //Exibindo palavras
        contagem.exibirPalavras();

        //Exibindo a palavra mais frequente
        System.out.println(contagem.encontrarPalavraMaisFrequente());
    }
}
