package com.example.jurassicpark;

import java.util.Date;

public class Jugador {
    Date ingreso;
    String nombre;
    int puntos;

    public Jugador(String nombre){
        this.ingreso = new Date();
        this.nombre = nombre;
        this.puntos = 50000;
    }

    public void trasladar(Dinosaurio dino){

    }
}