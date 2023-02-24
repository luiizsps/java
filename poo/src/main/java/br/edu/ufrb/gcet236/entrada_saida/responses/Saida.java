package br.edu.ufrb.gcet236.entrada_saida.responses;

public class Saida {
  private int resultado;

  public Saida(int resultado) {
    this.resultado = resultado;
  }

  public int getResultado() {
    return this.resultado;
  }

  public void setResultado(int resultado) {
    this.resultado = resultado;
  }
}
