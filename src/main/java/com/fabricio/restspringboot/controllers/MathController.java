package com.fabricio.restspringboot.controllers;

import com.fabricio.restspringboot.services.MathService;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {

    private final AtomicLong counter = new AtomicLong();
    private final MathService service;

    public MathController(MathService service) {
        this.service = service;
    }

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    @GetMapping
    public Double sum(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        return service.sum(numberOne, numberTwo);
    }

    @RequestMapping(value = "/minus/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    @GetMapping
    public Double minus(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        return service.minus(numberOne, numberTwo);
    }
    
    @RequestMapping(value = "/multiply/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    @GetMapping
    public Double multiply(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        return service.multiply(numberOne, numberTwo);
    }    

    @RequestMapping(value = "/divide/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    @GetMapping
    public Double divide(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        return service.divide(numberOne, numberTwo);
    }

    @RequestMapping(value = "/avg/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    @GetMapping
    public Double avg(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        return service.average(numberOne, numberTwo);
    }

    @RequestMapping(value = "/squareRoot/{numberOne}", method = RequestMethod.GET)
    @GetMapping
    public Double squareRoot(@PathVariable(value = "numberOne") String numberOne) {
        return service.squareRoot(numberOne);
    }

}
