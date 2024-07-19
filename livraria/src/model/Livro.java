package model;

import java.util.Comparator;
import java.util.Map;

public class Livro {
    private String titulo, autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "\b = [\n\t\tTítulo: " + this.titulo +
                "\n\t\tAutor: " + this.autor +
                "\n\t\tPreço: " + this.preco + "]\n";
    }

}

class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco());
    }
}

