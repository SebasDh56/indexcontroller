
package com.clase.indexcontroller.controller;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IndexControllerTest {

    @Test
    void welcomeTest() {
        IndexController indexController = new IndexController();
        String[] paramArray = null;
        String resultActual = "El array esta vacio";
        String resultReal = indexController.welcome(paramArray);
        assertEquals(resultActual, resultReal);
    }

    @Test
    void arraySinDatosTest() {
        IndexController indexController = new IndexController();
        String[] paramArray = new String[3];
        String resultActual = """
                param[0]null
                param[1]null
                param[2]null
                """;
        String resultReal = indexController.welcome(paramArray);
        assertEquals(resultActual, resultReal);
    }

    @Test
    void arrayConDatosTest() {
        IndexController indexController = new IndexController();
        String[] paramArray = new String[]{"java", "desde", "0"};
        String resultActual = """
                param[0]Java
                param[1]desde
                param[2]0
                """;
        String resultReal = indexController.welcome(paramArray);
        assertEquals(resultActual, resultReal);
    }
}
