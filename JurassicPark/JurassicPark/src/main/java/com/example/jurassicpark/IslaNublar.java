package com.example.jurassicpark;

import java.util.ArrayList;

public class IslaNublar extends IslaSorna{

    public IslaNublar(int comida, ArrayList<Dinosaurio> poblacion){
        super(comida, poblacion);
    }

    public IslaNublar(){
    }

    @Override
    public void comprarComida(int puntos){
        setComida(getComida()+ puntos*1550);
    }


}
