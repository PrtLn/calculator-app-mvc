package com.examle.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by prtLn on 8/18/2017.
 */
public class CalculatorController {

    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculateListener(new CalculationListener());
    }

    private class CalculationListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            int firstNum, secondNum = 0;

            try {
                firstNum = theView.getFirstNum();
                secondNum = theView.getSecondNum();

                theModel.addTwoNumber(firstNum, secondNum);
                theView.setCalcSolution(theModel.getCalculatorValue());
            }
            catch (NumberFormatException ex) {
                theView.displayErrorMessage("Please, Enter 2 Integer");
            }
        }
    }
}
