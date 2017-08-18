package com.examle.calculator;

/**
 * Created by prtLn on 8/18/2017.
 */
public class CalculatorModel {

    private int calculatorValue;

    public int getCalculatorValue() {
        return calculatorValue;
    }

    public void addTwoNumber(int firstNum, int secondNum) {
        calculatorValue = firstNum + secondNum;
    }
}
