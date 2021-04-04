package com.example.calculator.Services;

import com.example.calculator.Result;
import org.springframework.stereotype.Service;

@Service
public class DivService {
    public Result div(double a, double b){
        double result;
        if (a == 0 || b == 0) {
            result = 0;
        } else {
            result = a / b;
        }
        return new Result(result);
    }
}
