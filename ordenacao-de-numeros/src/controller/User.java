package controller;

import model.OrdenacaoNumeros;

public class User {
    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        //inserindo os números
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(12);
        numeros.adicionarNumero(42);
        numeros.adicionarNumero(15);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(800);
        numeros.adicionarNumero(33);
        numeros.adicionarNumero(6);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(302);

        //ordenando do menor para o maior
        numeros.ordenarAscendente();

        //ordenando do maior para o menor
        numeros.ordenarDescendente();
    }
}
