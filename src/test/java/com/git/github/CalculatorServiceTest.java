package com.git.github;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.git.github.services.CalculatorService;

@SpringBootTest
class CalculatorServiceTest {

    @Autowired
    private CalculatorService calculator;

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }
}
