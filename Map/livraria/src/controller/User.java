package controller;

import model.LivrariaOnline;

public class User {
    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();

        //Adicionando livros
        livraria.adicionarLivro("www.amazon.com.br/Java-para-leigos-Barry-Burd/dp/8576088010/",
                "Java Para Leigos", "Barry Burd", 111.00);

        livraria.adicionarLivro("https://www.amazon.com.br/Java®-como-programar-Paul-Deitel/dp/8543004799/",
                "Java®: Como Programar", "Paul Deitel & Harvey Deitel", 559.00);

        livraria.adicionarLivro("https://www.amazon.com.br/Programação-JAVA-Orientação-Objetos-Interface-ebook/dp/B016AVQGVY/",
                "Programação JAVA: Orientação a Objetos e Interface Gráfica com conexão ao Banco de Dados MySQL",
                "Fabíola Ventavoli", 553.00);

        livraria.adicionarLivro("https://www.amazon.com.br/Back-end-Java-Microsserviços-Spring-Kubernetes-ebook/dp/B08ZWQ6YMB/",
                "Back-end Java: Microsserviços, Spring Boot e Kubernetes", "Eduardo Felipe Zambom Santana", 59.90);

        livraria.adicionarLivro("https://www.amazon.com.br/Programador-Pragmático-Aprendiz-Mestre/dp/8577807002",
                "O Programador Pragmático: De Aprendiz a Mestre", "Andrew Hunt & David Thomas", 237.00);

        //Exibindo livros
        //livraria.exibirTodaLivraria();

        //Organizando por preço
        livraria.exibirLivrosOrdenadosPorPreco();

        //Pesquisando por autor
        livraria.pesquisarLivrosPorAutor("Barry Burd");

        //Removendo livros
        livraria.removerLivro("Java®: Como Programar");
        livraria.removerLivro("Java Para Leigos");

        //Exibindo livros
        //livraria.exibirTodaLivraria();

        //Organizando por preço
        livraria.exibirLivrosOrdenadosPorPreco();

        //Pesquisando por autor
        livraria.pesquisarLivrosPorAutor("Andrew Hunt & David Thomas");

    }
}
