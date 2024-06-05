package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class pruebaTest {
    @Test
    public void testSumar() {

        int a = 4;
        int b = 3;
        int expectedResult = 7;
        pruebaTestService pruebaService = new pruebaTestService();

        // Act (actuar, llamar al método que quieres probar)
        int result = pruebaService.sumar(a, b);

        // Assert (verificar el resultado)
        // Aquí puedes verificar si el resultado es el esperado
        assertEquals(expectedResult, result);
    }
}
