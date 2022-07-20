package com.example.jurassicpark;

import java.util.ArrayList;

public abstract class Isla {

    private String nombre;
    private int comida;
    private ArrayList<Dinosaurio> poblacion = new ArrayList<>();

    public Isla(int comida, ArrayList<Dinosaurio> poblacion){
        this.comida = comida;
        this.poblacion = poblacion;
    }
    public Isla(){
    }

    public abstract void comprarComida(int puntos);

    public void annadirDinosaurio(Dinosaurio dino){
        poblacion.add(dino);
    }

    public void eliminarDinosaurios(Dinosaurio dino){
        poblacion.remove(dino);
    }

    public int getComida(){
        return comida;
    }

    public void setComida(int comida){
        this.comida = comida;
    }

    public void alimentarPoblacion() throws NoHayComidaException {
       int apetitoPoblacion = poblacion.stream().map(x -> x.estomagoMax- x.estomago).reduce(0, Integer::sum);
       if(comida < apetitoPoblacion){
           throw new NoHayComidaException("No hay comida para alimentar a toda la poblacion");
       }else{
           comida -= apetitoPoblacion;
           poblacion.stream().forEach(x -> x.estomago = x.estomagoMax);
       }
    }

    public String toString(){
        StringBuilder mensaje = new StringBuilder("La isla " + nombre + ", tiene " + comida + " comida y " + poblacion.size() + " dinosaurios, los cuales son:\n");

        for(Dinosaurio n: poblacion){
            mensaje.append(n + "\n");
        }

        return mensaje.toString();
    }
}
