package controller;

import model.Carrinho;

public class User {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        //adicionando produtos
        carrinho.adicionarProduto("Agua mineral", 6, 1.99);
        carrinho.adicionarProduto("Chocolate", 2, 6.49);
        carrinho.adicionarProduto("Pêra", 3, 4.69);
        carrinho.adicionarProduto("Caixa de Uva", 2, 6.49);
        carrinho.adicionarProduto("Requeijão", 2, 8.99);
        carrinho.adicionarProduto("Queijo", 1, 12.99);

        //exibindo os produtos
        System.out.println(carrinho.exibirProdutos());

        //calculando o preço
        System.out.println(carrinho.calcularValorTotal());

        //removendo produtos
        carrinho.removerProduto("Queijo");
        carrinho.removerProduto("Caixa de Uva");

        //exibindo novamente
        System.out.println(carrinho.exibirProdutos());

        //calculando novamente
        System.out.println(carrinho.calcularValorTotal());
    }
}
