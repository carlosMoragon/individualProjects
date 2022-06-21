package com.example.practicaines;

import java.util.List;

public class Cambio {
    public static int cambioIterativo(int cambio, List<Integer> sistemaMonedas){
        return 0;
    }

    public static int cambioRecursivo(int cambio, List<Integer> sistemaMonedas){
        int[] resultado = new int[1];
        cambioRecursivo(cambio,0,sistemaMonedas, resultado);
        return resultado[0];
    }

    public static void cambioRecursivo(int cambio, int i, List<Integer> sistemaMonedas, int[] resultado){

    }

    //En el simulacro no pusieron lambda pero si quieres hacerla aquí esta la cabezera:
    //VOLUNTARIO
    public static int cambioLambat(int cambio, List<Integer> sistemaMonedas){
        return 0;
    }

}
