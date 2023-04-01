package br.edu.ufrb.gcet236.classes.requests;

import java.util.ArrayList;

public class ListaFornecedores {

  ArrayList<Fornecedor> listaDeFornecedores = new ArrayList<>();
  Fornecedor fornecedor_nulo = new Fornecedor();


  // ********** BUSCA ************ //

  // Função de busca por CNPJ
  public Fornecedor buscaPorCNPJ(long CNPJ) {

    for(Fornecedor fornecedor : listaDeFornecedores) {
      if(fornecedor.getCNPJ() == CNPJ) {
        return fornecedor;
      }
    }

  return fornecedor_nulo;
  }

  // Função de busca por nome
  public Fornecedor buscaPorNome(String nome) {

    for(Fornecedor fornecedor : listaDeFornecedores) {
      if(fornecedor.getNome() == nome) {
        return fornecedor;
      }
    }

    return fornecedor_nulo;
  }

  // Função de busca por parte do nome
  public ArrayList<Fornecedor> buscaPorParteDoNome(String parteDoNome) {
    ArrayList<Fornecedor> fornecedores = new ArrayList<>();
    int size = parteDoNome.length();

    for(Fornecedor fornecedor : listaDeFornecedores) {
      if(fornecedor.getNome().substring(0, size) == parteDoNome) {
        fornecedores.add(fornecedor);
      }
    }

    return fornecedores;
  }

}
