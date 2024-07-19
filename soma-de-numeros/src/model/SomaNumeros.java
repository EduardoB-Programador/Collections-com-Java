package model;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.listaNumeros.add(numero);

    }

    public void calcularSoma() {
        int acum = 0;

        for (int i : this.listaNumeros) {
            acum += i;
        }

        System.out.println("A soma de todos os números é: " + acum);
    }

    public int encontrarMaiorNumero() {
        int maior = this.listaNumeros.getFirst();

        for (int i : this.listaNumeros) {
            if (i >= maior) {
                maior = i;
            }

        }

        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = this.listaNumeros.getFirst();

        for (int i : this.listaNumeros) {
            if (i <= menor) {
                menor = i;
            }

        }

        return menor;
    }

    public String exibirNumeros() {
        StringBuilder exibir = new StringBuilder("Os valores da lista de números são {");

        for (int i : this.listaNumeros) {
            exibir.append(i);

            if (i == this.listaNumeros.getLast()) {
                exibir.append("}");
            } else {
                exibir.append(", ");
            }

        }

        return exibir.toString();
    }
}
