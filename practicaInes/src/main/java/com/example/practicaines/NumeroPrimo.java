package com.example.practicaines;

import java.util.stream.Stream;

public class NumeroPrimo {
    public static boolean primoIterativo(int n){
        return false;
    }
    public static boolean primoRecursivo(int n){
        return false;
    }
    public static boolean primoLambda(int n){
        //ejemplo 17 es primo
        return Stream.iterate(2, x -> x+1).limit(10).filter(x -> x != n).noneMatch(x -> 17 % x == 0);
    }
}
