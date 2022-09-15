package com.fabricio.restspringboot.services;

public interface MathService {
    Double sum(String numberOne, String numberTwo);

    Double minus(String numberOne, String numberTwo);

    Double multiply(String numberOne, String numberTwo);

    Double divide(String numberOne, String numberTwo);

    Double average(String numberOne, String numberTwo);

    Double squareRoot(String numberOne);


}
