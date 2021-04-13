package com.example.calculator;

import com.example.calculator.Services.AddService;
import com.example.calculator.Services.DivService;
import com.example.calculator.Services.MultService;
import com.example.calculator.Services.SubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("calculator")
public class CalculatorController {

    @Autowired
    private AddService addService;

    @Autowired
    private SubService subService;

    @Autowired
    private MultService multService;

    @Autowired
    private DivService divService;

    @GetMapping("add")
    public Result add(@RequestParam double a, @RequestParam double b) {
        return addService.add(a, b);
    }

    @GetMapping("sub")
    public Result sub(@RequestParam double a, @RequestParam double b) {
        return subService.sub(a, b);
    }

    @GetMapping("mult")
    public Result mult(@RequestParam double a, @RequestParam double b) {
        return multService.mult(a, b);
    }

    @GetMapping("div")
    public Result div(@RequestParam double a, @RequestParam double b) {
        return divService.div(a, b);
    }

}
