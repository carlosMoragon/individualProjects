package com.example.jurassicpark;

public class Dinosaurio {

    String nombre;
    int estomago;
    int estomagoMax;

    public int alimentar(){
        return estomagoMax-estomago;
    }

}
