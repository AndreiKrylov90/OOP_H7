package controller;

import service.SimpleActionsImpl;
import model.Numbers;

public class Controller {
    SimpleActionsImpl simpleActions;

    public Controller() {
        this.simpleActions = new SimpleActionsImpl();
    }

    public double setAfor1() {
        return Numbers.setAfor1();
    }

    public double setAfor2() {
        return Numbers.setAfor2();
    }

    public double setBfor1() {
        return Numbers.setBfor1();
    }

    public double setBfor2() {
        return Numbers.setBfor2();
    }

    public void summation(double number1, double number2, double number3, double number4) {
        simpleActions.summation(number1, number2, number3, number4);
    }

    public void subtraction(double number1, double number2, double number3, double number4) {
        simpleActions.subtraction(number1, number2, number3, number4);
    }

    public void multiplication(double number1, double number2, double number3, double number4) {
        simpleActions.multiplication(number1, number2, number3, number4);
    }

    public void division(double number1, double number2, double number3, double number4) {
        simpleActions.division(number1, number2, number3, number4);
    }

}
