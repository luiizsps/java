package br.edu.ufrb.gcet236.exercicios;

public class ListaFaturas {
  private Fatura[] listaFaturas;

  private int totalFaturas = 0;

  public ListaFaturas() {
    this.listaFaturas = new Fatura[10];
  }

  public void adicionaFatura(Fatura fatura) {
    this.listaFaturas[this.totalFaturas] = fatura;
    totalFaturas++;
  }

  public Fatura[] getListaFaturas() {
    return this.listaFaturas;
  }

  public void setListaFaturas(Fatura[] listaFaturas) {
    this.listaFaturas = listaFaturas;
  }
}
