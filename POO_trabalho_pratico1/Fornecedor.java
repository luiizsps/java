package br.edu.ufrb.gcet236.classes.requests;

public class Fornecedor {
  private long CNPJ;
  private String nome;
  private String endereço;
  private long telefone;
  private String email;

  public Fornecedor() {
    CNPJ = 0;
    this.nome = "";
    this.endereço = "";
    this.telefone = 0;
    this.email = "";
  }

  public long getCNPJ() {
    return CNPJ;
  }

  public void setCNPJ(long cNPJ) {
    CNPJ = cNPJ;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereço() {
    return endereço;
  }

  public void setEndereço(String endereço) {
    this.endereço = endereço;
  }
  
  public long getTelefone() {
    return telefone;
  }

  public void setTelefone(long telefone) {
    this.telefone = telefone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}
