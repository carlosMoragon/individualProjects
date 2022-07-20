package com.moragon.mochila;

public class Objeto {
    public int valor;
    public int peso;

    public Objeto(int valor, int peso){
        this.valor = valor;
        this.peso = peso;
    }

    public String toString(){
        return "Peso: " + peso + ", Valor: " + valor;
    }
}
