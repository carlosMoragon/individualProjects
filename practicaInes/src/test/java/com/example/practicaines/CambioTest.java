package com.example.practicaines;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CambioTest {
    //200 cents = 2€
    List<Integer> monedasCambio = Arrays.asList(200, 100, 50, 20, 10, 5, 2, 1);

    @Test
    public void ejemploCambio(){
        //tenemos que dar el cambio (5000), con el menor numero de monedas posibles, por lo que son 25 veces 200.
        assertEquals(Cambio.cambioIterativo(5000, monedasCambio), 25);
    }
}
