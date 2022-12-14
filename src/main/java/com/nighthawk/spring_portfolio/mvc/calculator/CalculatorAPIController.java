package com.nighthawk.spring_portfolio.mvc.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorAPIController {

    @GetMapping("/{expression}")
    public ResponseEntity<String> getResult(@PathVariable String expression) {
        Calculator calculator = new Calculator(expression);
        String result = calculator.json();
        if (result != null) return new ResponseEntity<String>(result, HttpStatus.OK);
        return new ResponseEntity<String>("this is *your* fault", HttpStatus.OK);
    }
}
