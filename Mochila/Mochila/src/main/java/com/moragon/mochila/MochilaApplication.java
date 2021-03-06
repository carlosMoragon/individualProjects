package com.moragon.mochila;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MochilaApplication {

    public static void main(String[] args) {
        //precioValor(new int[]{12,2,1,4,1}, 15, new int[]{4,2, 1, 10, 2}).stream().forEach(System.out::println);
        mochila(3, 15, new Objeto[]{new Objeto(2, 4), new Objeto(4, 12), new Objeto(5, 6)});
        /*
        maximizar el valor de los elementos dentro de la mochila.
        ejemplo:
        - Peso maximo de la mochila: 15kg
        - obj1 = 12kg, 4$
        - obj2 = 2kg, 2$
        - obj3 = 1kg, 1$
        - obj4 = 4kg, 10$
        - obj5 = 1kg, 2$
         */
    }

    /*public static List<Integer> precioValor(int[] masa, int pesoMax, int[] valor){
        //obtener el objeto que tenga mejor relación de peso valor
        List<Integer> mochila = new ArrayList<>();
        int mejor = 0;

        while(pesoMax != 0) {
            for (int i = 0; i < masa.length; i++) {
                if ((valor[i] / masa[i]) > (valor[mejor] / masa[mejor]) && masa[i] < pesoMax) {
                    mejor = i;
                }
            }
            if(mochila.size() != 0 && mejor == mochila.get(mochila.size()-1)) pesoMax = 0;
            mochila.add(mejor);
            pesoMax -= masa[mejor];
            masa[mejor] = Integer.MAX_VALUE;
            valor[mejor] = 0;

        }


        return mochila;

    }*/

    public static Objeto[] mochila(int espacios, int pesoMax, Objeto[] objetos){
        if(espacios == 1){
            int mejor = 0;
            for (int i = 0; i < objetos.length; i++) {
                if ((objetos[i].valor / objetos[i].peso) > (objetos[mejor].valor / objetos[mejor].peso) && objetos[i].peso < pesoMax) {
                    mejor = i;
                }
            }
            return new Objeto[]{mejor};
        }else{
            return mochila(espacios - 1, pesoMax, objetos);
        }
    }

}
