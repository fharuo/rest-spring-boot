package com.fabricio.restspringboot.services.implementations;

import com.fabricio.restspringboot.exceptions.UnsupportedMathOperationException;
import com.fabricio.restspringboot.services.MathService;
import org.springframework.stereotype.Service;

import static java.lang.Math.sqrt;

@Service
public class MathServiceImpl implements MathService {

    @Override
    public Double sum(String numberOne, String numberTwo) {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("set a numeric value!");
        }
        return stringToDouble(numberOne) + stringToDouble(numberTwo);
    }

    @Override
    public Double minus(String numberOne, String numberTwo) {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("set a numeric value!");
        }
        return stringToDouble(numberOne) - stringToDouble(numberTwo);
    }

    @Override
    public Double multiply(String numberOne, String numberTwo) {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("set a numeric value!");
        }
        return stringToDouble(numberOne) * stringToDouble(numberTwo);
    }

    @Override
    public Double divide(String numberOne, String numberTwo) {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("set a numeric value!");
        }
        return stringToDouble(numberOne) / stringToDouble(numberTwo);
    }

    @Override
    public Double average(String numberOne, String numberTwo) {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("set a numeric value!");
        }
        return (stringToDouble(numberOne) + stringToDouble(numberTwo)) / 2;
    }

    @Override
    public Double squareRoot(String numberOne) {
        if(!isNumeric(numberOne)) {
            throw new UnsupportedMathOperationException("set a numeric value!");
        }
        return sqrt(stringToDouble(numberOne));
    }

    private Double stringToDouble(String strNumber) {
        if(strNumber == null) return 0D;
        String number = strNumber.replaceAll(",", ".");
        if(isNumeric(number)) return Double .parseDouble(number);
        return 0D;
    }

    private boolean isNumeric(String strNumber) {
        if(strNumber == null) return false;
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
