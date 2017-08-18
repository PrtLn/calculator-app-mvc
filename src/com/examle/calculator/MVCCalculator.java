package com.examle.calculator;

/**
 * Created by prtLn on 8/18/2017.
 */
public class MVCCalculator {
    public static void main(String[] args) {

        CalculatorView theVeiw = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();

        theVeiw.setVisible(true);

    }
}
