package com.example.calculator;

import com.example.calculator.Services.AddService;
import com.example.calculator.Services.DivService;
import com.example.calculator.Services.MultService;
import com.example.calculator.Services.SubService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorServicesTest {

    double a = 20;
    double b = 5;

    @Test
    void addService (){
        AddService service = new AddService();
        Result result = service.add(a,b);
        assertEquals(result.getResult(), 25);
    }

    @Test
    void subService (){
        SubService service = new SubService();
        Result result = service.sub(a,b);
        assertEquals(result.getResult(), 15);
    }

    @Test
    void multService (){
        MultService service = new MultService();
        Result result = service.mult(a,b);
        assertEquals(result.getResult(), 100);
    }

    @Test
    void divService (){
        DivService service = new DivService();
        Result result = service.div(a,b);
        assertEquals(result.getResult(), 4);
    }
}
