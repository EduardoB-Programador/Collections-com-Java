package model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    List<Produto> carrinhoCompras;

    public Carrinho() {
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarProduto(String nome, int quantidade, double preco) {
        this.carrinhoCompras.add(new Produto(nome, quantidade, preco));

    }

    public void removerProduto(String nome) {
        for (Produto p : this.carrinhoCompras) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                this.carrinhoCompras.remove(p);
                break;

            }

        }

    }

    public double calcularValorTotal() {
        double acum = 0;

        for (Produto p : this.carrinhoCompras) {
            acum += (p.getPreco() * p.getQuantidade());
        }

        return acum;
    }

    public String exibirProdutos() {
        StringBuilder exibir = new StringBuilder("Os produtos do carrinho são\n");

        for (Produto p : this.carrinhoCompras) {
            exibir.append("{").append("Nome: ").append(p.getNome()).append(", Quantidade:").append(p.getQuantidade());
            exibir.append(", Preço:").append(p.getPreco()).append("}");

            if (p != this.carrinhoCompras.getLast()) {
                exibir.append("\n");
            }
        }

        return exibir.toString();
    }
}