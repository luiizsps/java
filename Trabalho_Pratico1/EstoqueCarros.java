package br.edu.ufrb.gcet236.exercicios_classes_2.entities;

import java.util.ArrayList;

public class EstoqueCarros {
    ArrayList<Carro> estoqueDeCarros = new ArrayList<Carro>();

    public void addCarros(Carro carro) {
        estoqueDeCarros.add(carro);
    }

    public int tamanhoDoEstoque() {
        return estoqueDeCarros.size();
    }

}
