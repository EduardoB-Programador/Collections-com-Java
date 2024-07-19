package model;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int num) {
        this.numeros.add(num);
    }

    public void ordenarAscendente() {
        List<Integer> ascendendo = new ArrayList<>(this.numeros);

        Collections.sort(ascendendo);

        StringBuilder teste = new StringBuilder("{");

        for (int i : ascendendo) {
            if (i == ascendendo.getLast()) {
                teste.append(i).append("}");
            } else {
                teste.append(i).append(", ");
            }
        }

        System.out.println(teste);
    }

    public void ordenarDescendente() {
        List<Integer> descendendo = new ArrayList<>(this.numeros);

        Collections.sort(descendendo);
        Collections.reverse(descendendo);

        StringBuilder teste = new StringBuilder("{");

        for (int i : descendendo) {
            if (i == descendendo.getLast()) {
                teste.append(i).append("}");
            } else {
                teste.append(i).append(", ");
            }
        }

        System.out.println(teste);
    }

}
