package model;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        this.livros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {

        if (!this.livros.isEmpty()) {

            for (Map.Entry<String, Livro> entry : this.livros.entrySet()) {

                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    this.livros.remove(entry.getKey());
                    break;
                }

            }
        }

    }

    public void exibirLivrosOrdenadosPorPreco() {
        if (!this.livros.isEmpty()) {
            List<Map.Entry<String, Livro>> livrosDesordenados = new ArrayList<>(this.livros.entrySet());

            livrosDesordenados.sort(new ComparatorPorPreco());

            Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();

            for (Map.Entry<String, Livro> entry : livrosDesordenados) {
                livrosOrdenados.put(entry.getKey(), entry.getValue());
            }

            System.out.println(livrosOrdenados);

        }

    }

    public void pesquisarLivrosPorAutor(String autor) {
        if (!this.livros.isEmpty()) {
            List<Map.Entry<String, Livro>> livrosDesordenados = new ArrayList<>(this.livros.entrySet());

            Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();

            for (Map.Entry<String, Livro> entry : livrosDesordenados) {

                if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                    livrosOrdenados.put(entry.getKey(), entry.getValue());
                }

            }

            System.out.println(livrosOrdenados);
        }

    }

    public Livro obterLivroMaisCaro() {
        Livro livroCaro = null;
        double valor = Double.MIN_VALUE;

        if (!this.livros.isEmpty()) {
            for (Map.Entry<String, Livro> entry : this.livros.entrySet()) {

                if (entry.getValue().getPreco() > valor) {
                    livroCaro = entry.getValue();
                    valor = entry.getValue().getPreco();
                }

            }
        }

        return livroCaro;
    }

    public Livro obterLivroMaisBarato() {
        Livro livroBarato = null;
        double valor = Double.MAX_VALUE;

        if (!this.livros.isEmpty()) {
            for (Map.Entry<String, Livro> entry : this.livros.entrySet()) {

                if (entry.getValue().getPreco() < valor) {
                    livroBarato = entry.getValue();
                    valor = entry.getValue().getPreco();
                }

            }
        }

        return livroBarato;
    }

    public void exibirTodaLivraria() {
        System.out.println(this.livros);
    }
}
