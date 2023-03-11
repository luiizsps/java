package br.edu.ufrb.gcet236.exercicios;

public class Fatura {
  private int numeroFatura;
  private String descricaoItem;
  private int quantidadeItem;
  private float precoItem;
 
  public Fatura(int numeroFatura, String descricaoItem, int quantidadeItem, float precoItem) {
    this.numeroFatura = numeroFatura;
    this.descricaoItem = descricaoItem;
    this.quantidadeItem = quantidadeItem;
    this.precoItem = precoItem;
  }

  public void setNumeroFatura(int numeroFatura) {
    this.numeroFatura = numeroFatura;
  }

  public int getNumeroFatura() {
    return this.numeroFatura;
  }

  public void setDescricaoItem(String descricaoItem) {
    this.descricaoItem = descricaoItem;
  }

  public String getDescricaoItem() {
    return this.descricaoItem;
  }

  public float getPrecoItem() {
    return this.precoItem;
  }

  public void setPrecoItem(float precoItem) {
    if(precoItem < 0) this.precoItem = 0;
    else this.precoItem = precoItem;
  }

  public int getQuantidadeItem() {
    return quantidadeItem;
  }

  public void setQuantidadeItem(int quantidadeItem) {
    if(quantidadeItem < 0) this.quantidadeItem = 0; 
    else this.quantidadeItem = quantidadeItem;
  }

  public double getTotalFatura() {
    return (double)this.quantidadeItem * this.precoItem;
  }

}
