package com.example.calculator;

import com.example.calculator.Services.AddService;
import com.example.calculator.Services.DivService;
import com.example.calculator.Services.MultService;
import com.example.calculator.Services.SubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public Result add(@RequestParam int a, @RequestParam int b) {
        return addService.add(a, b);
    }

    @GetMapping("sub")
    public Result sub(@RequestParam int a, @RequestParam int b) {
        return subService.sub(a, b);
    }

    @GetMapping("mult")
    public Result mult(@RequestParam int a, @RequestParam int b) {
        return multService.mult(a, b);
    }

    @GetMapping("div")
    public Result div(@RequestParam int a, @RequestParam int b) {
        return divService.div(a, b);
    }

}
