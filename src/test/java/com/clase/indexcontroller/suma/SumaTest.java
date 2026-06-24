package com.clase.indexcontroller.suma;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SumaTest {

    suma suma = new suma();

    @BeforeEach
    void before() {
        System.out.println("Before: Iniciando Test Suma");
    }

    @Test
    void sumaPositivosTest() {
        System.out.println("SumaPositivosTest: Iniciando Test Suma");
        assertEquals(8, suma.suma(3, 5));
    }

    @Test
    void sumaNegativosTest() {
        assertEquals(-8, suma.suma(-3, -5));
    }

    @Test
    void sumaCeroTest() {
        assertEquals(5, suma.suma(0, 5));
    }

    @AfterEach
    void after() {
        System.out.println("After: Finalizando Test Suma");
    }
}
