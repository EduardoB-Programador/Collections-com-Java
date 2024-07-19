package controller;

import model.SomaNumeros;

public class User {
    public static void main(String[] args) {
        SomaNumeros sn = new SomaNumeros();

        //adicionando números
        sn.adicionarNumero(23);
        sn.adicionarNumero(50);
        sn.adicionarNumero(42);
        sn.adicionarNumero(-12);
        sn.adicionarNumero(15);

        //exibindo os números
        System.out.println(sn.exibirNumeros());

        //calculando a soma dos números
        sn.calcularSoma();

        //encontrando o maior dentre os números
        System.out.println(sn.encontrarMaiorNumero());

        //encontrando o menor dentre os números
        System.out.println(sn.encontrarMenorNumero());
    }
}
