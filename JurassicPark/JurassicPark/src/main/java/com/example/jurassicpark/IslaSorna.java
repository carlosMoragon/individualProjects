package com.example.jurassicpark;

import java.util.ArrayList;

public class IslaSorna extends Isla{
    //int edad;

    public IslaSorna(int comida, ArrayList<Dinosaurio> poblacion){
        super(comida, poblacion);
    }

    public IslaSorna(){
    }

    @Override
    public void comprarComida(int puntos){
        setComida(getComida()+ puntos*100);
    }


}
