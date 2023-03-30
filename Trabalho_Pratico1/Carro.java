package br.edu.ufrb.gcet236.exercicios_classes_2.entities;

public class Carro {
    private String fabricante;
    private String modelo;
    private String cor;
    private int ano;

    public Carro(String fabricante, String modelo, String cor, int ano) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }
}
