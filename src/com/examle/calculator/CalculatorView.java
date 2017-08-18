package com.examle.calculator;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by prtLn on 8/18/2017.
 */
public class CalculatorView extends JFrame {

    private JTextField firstNum = new JTextField(5);
    private JLabel additionLabel = new JLabel(" + ");
    private JTextField secondNum = new JTextField(5);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(7);

    CalculatorView() {
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 100);

        calcPanel.add(firstNum);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNum);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);
    }

    public int getFirstNum() {
        return Integer.parseInt(firstNum.getText());
    }

    public int getSecondNum() {
        return Integer.parseInt(secondNum.getText());
    }

    public int getCalcSolution() {
        return Integer.parseInt(calcSolution.getText());
    }

    public void setCalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));
    }

    void addCalculateListener(ActionListener listenerforCalcButton) {
        calculateButton.addActionListener(listenerforCalcButton);
    }

    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
