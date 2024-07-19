package controller;

import model.Dicionario;

public class User {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        //Adicionando palavras
        dicionario.adicionarPalavra("Reminiscência", "Substantivo feminino, Recordação do passado: o que se mantêm na memória. Recordação vaga e quase apagada");
        dicionario.adicionarPalavra("Memento Mori", "Memento mori é uma expressão latina que significa \"lembre-se de que é mortal\" ou \"de que morrerá\" ou, ipsis litteris, \"lembre-se da morte\"");
        dicionario.adicionarPalavra("Alvíssaras", "Expressão de alegria por notícia recebida");
        dicionario.adicionarPalavra("Deletério", "Degradante, insalubre, prejudicial");
        dicionario.adicionarPalavra("Filantropo", "Altruísta, benevolente");
        dicionario.adicionarPalavra("Heliopatia", "Conjunto de distúrbios, perturbações ou alterações patológicas causadas pela luz dos raios solares");
        dicionario.adicionarPalavra("Esperança", "A palavra esperança indica uma expectativa ou espera otimista, recheada de fé e confiança");
        dicionario.adicionarPalavra("Plenitude", "A palavra plenitude indica o ato de estar pleno e completo, no grau máximo de ser inteiro");

        //Exibindo o dicionario
        dicionario.exibirDicionario();

        //Removendo palavras
        dicionario.removerPalavra("Alvíssaras");
        dicionario.removerPalavra("Deletério");

        //Exibindo o dicionario
        dicionario.exibirDicionario();

        //Procurando palavra
        System.out.println(dicionario.pesquisarPorPalavra("Reminiscência"));
    }
}
