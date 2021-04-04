package com.example.calculator.Services;

import com.example.calculator.Result;
import org.springframework.stereotype.Service;

@Service
public class MultService {
    public Result mult(double a, double b){
        double result = a * b;
        return new Result(result);
    }
}
